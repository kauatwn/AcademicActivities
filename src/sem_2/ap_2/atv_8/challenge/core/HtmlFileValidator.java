package sem_2.ap_2.atv_8.challenge.core;

import java.nio.file.Files;
import java.nio.file.Path;

public class HtmlFileValidator {
    private static final String HTML_EXTENSION = ".html";
    private static final String HTM_EXTENSION = ".htm";
    private static final String HTML_MIME_TYPE = "text/html";

    public boolean isValid(String filePath) {
        if (!isValidExtension(filePath)) {
            System.err.println("Extensão inválida. Use .html ou .htm");
            return false;
        }

        if (!isRealHtmlFile(filePath)) {
            System.err.println("Arquivo não é um HTML válido");
            return false;
        }

        return true;
    }

    private boolean isValidExtension(String filePath) {
        if (filePath == null) {
            return false;
        }

        String lowerPath = filePath.toLowerCase();

        return lowerPath.endsWith(HTML_EXTENSION) || lowerPath.endsWith(HTM_EXTENSION);
    }

    private boolean isRealHtmlFile(String fileName) {
        try {
            String mimeType = Files.probeContentType(Path.of(fileName));
            return mimeType != null && mimeType.equals(HTML_MIME_TYPE);
        } catch (Exception e) {
            return false;
        }
    }
}
// Implementa regras de validação específicas de HTML (extensão e MIME type).
// Este validador é usado para verificar se o arquivo é um HTML válido antes de processá-lo.
// Ele verifica a extensão do arquivo e o tipo MIME para garantir que o arquivo seja um HTML válido.
// Se o arquivo não for válido, ele retorna false e exibe uma mensagem de erro apropriada.
// Se o arquivo for válido, ele retorna true.