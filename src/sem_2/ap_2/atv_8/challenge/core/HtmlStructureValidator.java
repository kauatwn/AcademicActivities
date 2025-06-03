package sem_2.ap_2.atv_8.challenge.core;


import sem_2.ap_2.atv_8.challenge.utils.HtmlFileReader;
import sem_2.ap_2.atv_8.challenge.utils.HtmlTagExtractor;

import java.io.IOException;

public class HtmlStructureValidator {
    private final HtmlFileValidator fileValidator;
    private final HtmlFileReader fileReader;
    private final HtmlTagExtractor tagExtractor;
    private final HtmlTagParser tagParser;

    public HtmlStructureValidator(
            HtmlFileValidator fileValidator,
            HtmlFileReader fileReader,
            HtmlTagExtractor tagExtractor,
            HtmlTagParser tagParser
    ) {
        this.fileValidator = fileValidator;
        this.fileReader = fileReader;
        this.tagExtractor = tagExtractor;
        this.tagParser = tagParser;
    }

    public boolean isValidHtml(String filePath) {
        if (!fileValidator.isValid(filePath)) {
            return false;
        }

        try {
            String content = fileReader.readContent(filePath);
            return validateHtmlStructure(content);
        } catch (IOException e) {
            System.err.println("Erro na leitura: " + e.getMessage());
            return false;
        }
    }

    private boolean validateHtmlStructure(String content) {
        TagStackProcessor stackProcessor = new TagStackProcessor();
        int length = content.length();
        for (int i = 0; i < length; i++) {
            if (content.charAt(i) != '<') {
                continue;
            }

            int closingBracketIndex = tagParser.findTagClosingBracket(content, i + 1);
            if (closingBracketIndex == -1) {
                return false;
            }

            String rawTag = content.substring(i + 1, closingBracketIndex);
            i = closingBracketIndex;

            if (tagExtractor.shouldIgnoreTag(rawTag)) {
                continue;
            }

            String cleanTag;
            if (rawTag.startsWith("/")) {
                cleanTag = rawTag.substring(1);
            } else {
                cleanTag = rawTag;
            }

            String tagName = tagExtractor.extractTagName(cleanTag).toLowerCase();

            // Pula conteúdo interno de script/style
            if (!rawTag.startsWith("/") && tagExtractor.isSpecialTag(tagName)) {
                i = tagParser.skipSpecialTagContent(content, i, tagName);
                if (i == -1) return false;
                continue;
            }

            // Calcula se é self-closing antes de chamar processTag
            boolean isSelfClosing = tagExtractor.isSelfClosingTag(tagName) || rawTag.endsWith("/");

            if (!stackProcessor.processTag(rawTag, tagName, isSelfClosing)) {
                return false;
            }
        }

        return stackProcessor.isStackEmpty();
    }
}