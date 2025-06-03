package sem_2.ap_2.atv_8.challenge.ui;

import sem_2.ap_2.atv_8.challenge.core.HtmlFileValidator;
import sem_2.ap_2.atv_8.challenge.core.HtmlStructureValidator;
import sem_2.ap_2.atv_8.challenge.core.HtmlTagParser;
import sem_2.ap_2.atv_8.challenge.utils.HtmlFileReader;
import sem_2.ap_2.atv_8.challenge.utils.HtmlTagExtractor;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class HtmlValidatorUI {
    public void show() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result != JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, "Nenhum arquivo selecionado.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        File selectedFile = fileChooser.getSelectedFile();
        String filePath = selectedFile.getAbsolutePath();

        HtmlStructureValidator validator = new HtmlStructureValidator(
                new HtmlFileValidator(),
                new HtmlFileReader(),
                new HtmlTagExtractor(),
                new HtmlTagParser());

        try {
            boolean isValid = validator.isValidHtml(filePath);
            if (isValid) {
                JOptionPane.showMessageDialog(null, "HTML válido!", "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "HTML inválido!", "Resultado",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
