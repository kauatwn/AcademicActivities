package sem_2.ap_2.atv_8.challenge.utils;

import java.util.Set;

public class HtmlTagExtractor {
    private static final Set<String> SELF_CLOSING_TAGS = Set.of(
            "area", "base", "br", "col", "embed", "hr", "img", "input",
            "link", "meta", "param", "source", "track", "wbr");
    public static final String COMMENT_PREFIX = "!--";
    public static final String DOCTYPE_PREFIX = "!DOCTYPE";
    public static final String PROCESSING_INSTRUCTION_PREFIX = "?";
    public static final String SCRIPT_TAG = "script";
    public static final String STYLE_TAG = "style";

    public String extractTagName(String tagContent) {
        // Verifica se a string é nula ou vazia para evitar NullPointerException
        if (tagContent == null || tagContent.isEmpty()) {
            // Retorna string vazia se não houver conteúdo válido
            return "";
        }

        // Percorre cada caractere do conteúdo da tag para encontrar o nome
        for (int i = 0; i < tagContent.length(); i++) {
            // Obtém o caractere atual da string
            char c = tagContent.charAt(i);

            // Verifica se o caractere atual é um delimitador que indica fim do nome da tag:
            // - Whitespace (espaço, tab, quebra de linha, etc.)
            // - '>' (fechamento tradicional da tag)
            // - '/' (fechamento automático como em <img/>)
            if (Character.isWhitespace(c) || c == '>' || c == '/') {
                // Retorna o nome da tag do início até o caractere anterior ao delimitador
                return tagContent.substring(0, i);
            }
        }

        // Se nenhum delimitador foi encontrado, retorna o conteúdo completo como nome
        // da tag
        return tagContent;
    }

    public boolean shouldIgnoreTag(String tagContent) {
        return tagContent.startsWith(COMMENT_PREFIX) || tagContent.toUpperCase().startsWith(DOCTYPE_PREFIX)
                || tagContent.startsWith(PROCESSING_INSTRUCTION_PREFIX);
    }

    public boolean isSelfClosingTag(String tagName) {
        return SELF_CLOSING_TAGS.contains(tagName.toLowerCase());
    }

    public boolean isSpecialTag(String tagName) {
        return SCRIPT_TAG.equals(tagName) || STYLE_TAG.equals(tagName);
    }
}
// Esta classe é responsável por extrair o nome de uma tag HTML a partir de seu conteúdo.
// Ela também verifica se a tag deve ser ignorada (como comentários ou instruções de processamento),
// se é uma tag de fechamento automático (self-closing) ou se é uma tag especial (como <script> ou <style>).