package log;

/* Essa classe vai ser usada por todos os algoritmos para registrar eventos importantes.
Tambem pode ser estendida depois para salvar logs em arquivos .txt. */
public class Logger {
    
    public static void log(String mensagem) {
        System.out.println("[LOG] " + mensagem);
    }

    public static void falhaDetectada(int id) {
        System.out.println("[LOG] Processo " + id + " detectou falha do coordenador.");
    }

    public static void novoCoordenador(int id) {
        System.out.println("[LOG] Novo coordenador eleito: Processo " + id);
    }
}
