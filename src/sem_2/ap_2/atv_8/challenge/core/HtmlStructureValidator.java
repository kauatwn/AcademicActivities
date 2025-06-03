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
        // Fluxo de validação:
        // 1. Percorre todo o conteúdo HTML caractere por caractere
        // 2. Quando encontra '<', identifica o fechamento '>'
        // 3. Extrai e normaliza o nome da tag
        // 4. Ignora tags especiais (comentários/doctype)
        // 5. Trata tags auto-fecháveis (ex: <img />)
        // 6. Para tags normais:
        //    - Tags de abertura: empilha
        //    - Tags de fechamento: desempilha e verifica correspondência
        // 7. Ao final, verifica se todas as tags foram fechadas

        TagStackProcessor stackProcessor = new TagStackProcessor();
        int length = content.length();

        for (int i = 0; i < length; i++) {
            if (!isTagStart(content.charAt(i))) {
                continue;
            }

            int closingIndex = getTagClosingIndex(content, i);
            if (closingIndex == -1) {
                return false;
            }

            String rawTag = extractTagContent(content, i, closingIndex);
            i = closingIndex;

            if (shouldIgnoreTag(rawTag)) {
                continue;
            }

            String normalizedTagName = getNormalizedTagName(rawTag);

            if (needsSpecialHandling(rawTag, normalizedTagName)) {
                i = handleSpecialTagContent(content, i, normalizedTagName);
                if (i == -1) {
                    return false;
                }
                continue;
            }

            boolean selfClosing = isSelfClosing(rawTag, normalizedTagName);

            if (!processTag(stackProcessor, rawTag, normalizedTagName, selfClosing)) {
                return false;
            }
        }

        return stackProcessor.isStackEmpty();
    }

    private boolean isTagStart(char character) {
        return character == '<';
    }

    private int getTagClosingIndex(String content, int startIndex) {
        return tagParser.findTagClosingBracket(content, startIndex + 1);
    }

    private String extractTagContent(String content, int startIndex, int endIndex) {
        return content.substring(startIndex + 1, endIndex);
    }

    private boolean shouldIgnoreTag(String rawTag) {
        return tagExtractor.shouldIgnoreTag(rawTag);
    }

    private String getNormalizedTagName(String rawTag) {
        String normalizedTagName;
        if (rawTag.startsWith("/")) {
            normalizedTagName = rawTag.substring(1);
        } else {
            normalizedTagName = rawTag;
        }

        return tagExtractor.extractTagName(normalizedTagName).toLowerCase();
    }

    private boolean needsSpecialHandling(String rawTag, String tagName) {
        return !rawTag.startsWith("/") && tagExtractor.isSpecialTag(tagName);
    }

    private int handleSpecialTagContent(String content, int currentIndex, String tagName) {
        return tagParser.skipSpecialTagContent(content, currentIndex, tagName);
    }

    private boolean isSelfClosing(String rawTag, String tagName) {
        return tagExtractor.isSelfClosingTag(tagName) || rawTag.endsWith("/");
    }

    private boolean processTag(TagStackProcessor processor, String rawTag, String tagName, boolean selfClosing) {
        return processor.processTag(rawTag, tagName, selfClosing);
    }
}
