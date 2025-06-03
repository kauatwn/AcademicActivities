package sem_2.ap_2.atv_8.challenge.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HtmlFileReader {
    public String readContent(String filePath) throws IOException {
        return Files.readString(Path.of(filePath));
    }
}
// Faz apenas I/O (leitura de arquivos), sem lógica de negócio.
// Não possui dependências externas, exceto as da biblioteca padrão do Java.