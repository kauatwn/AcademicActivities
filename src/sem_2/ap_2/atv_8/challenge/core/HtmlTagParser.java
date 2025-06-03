package sem_2.ap_2.atv_8.challenge.core;

public class HtmlTagParser {
    public int findTagClosingBracket(String content, int startIndex) {
        boolean insideDoubleQuotes = false;
        boolean insideSingleQuotes = false;

        for (int i = startIndex; i < content.length(); i++) {
            char c = content.charAt(i);

            if (c == '"' && !insideSingleQuotes) {
                insideDoubleQuotes = !insideDoubleQuotes;
                continue;
            }

            if (c == '\'' && !insideDoubleQuotes) {
                insideSingleQuotes = !insideSingleQuotes;
                continue;
            }

            if (c == '>' && !insideDoubleQuotes && !insideSingleQuotes) {
                return i;
            }
        }
        return -1;
    }

    public int skipSpecialTagContent(String content, int currentIndex, String tagName) {
        String endTag = String.format("</%s>", tagName);

        int endIndex = content.indexOf(endTag, currentIndex);
        if (endIndex == -1) {
            return -1;
        }
        return endIndex + endTag.length();
    }
}
// Implementa algoritmos específicos de parsing de HTML (encontrar fechamento de tags, pular conteúdo especial).
// Este parser é usado para analisar o conteúdo HTML e encontrar as tags, além de pular o conteúdo interno de tags especiais como <script> e <style>.
// Ele fornece métodos para encontrar o fechamento de uma tag e pular o conteúdo de tags especiais, garantindo que a estrutura HTML seja validada corretamente.