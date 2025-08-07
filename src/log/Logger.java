package log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/* Essa classe vai ser usada por todos os algoritmos para registrar eventos importantes.
Os logs serão exibidos no console e também são salvos em um arquivo .txt.
 */
public class Logger {
    
    private static final String LOG_PATH = "src/log/eleicao_log.txt";

    public static void log(String mensagem) {
        String fullMessage = "[LOG " + LocalDateTime.now() + "] " + mensagem;
        System.out.println(fullMessage);
        salvarNoArquivo(fullMessage);
    }

    public static void falhaDetectada(int id) {
        log("Processo " + id + " detectou falha do coordenador.");
    }

    public static void novoCoordenador(int id) {
        log("Novo coordenador eleito: Processo " + id);
    }

        private static void salvarNoArquivo(String mensagem) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_PATH, true))) {
            writer.println(mensagem);
        } catch (IOException e) {
            System.err.println("Erro ao salvar log no arquivo: " + e.getMessage());
        }
    }
}

