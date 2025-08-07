import java.util.ArrayList;
import java.util.List;

import cenarios.Cenario_A;
import cenarios.Cenario_B;
import processo.Processo;

public class App {
    public static void main(String[] args) throws Exception {
        List<Processo> processos = new ArrayList<>();

        //Aqui estou criando 5 processos com IDs de 0 a 4
        for (int i = 0; i < 5; i++) {
            processos.add(new Processo(i));
        }

        //  Definindo o processo com maior ID como coordenaador inicial
        processos.get(4).setCoordenador(true);

        
        // Inicia todos os processos (como threads)
        for (Processo p : processos) {
            p.start();
        }

        // Aguarda 3 segundos e executa o cenário A
        Thread.sleep(3000);
        Cenario_A.executar(processos);

        // Aguarda mais 3 segundos e executa o cenário B
        Thread.sleep(3000);
        Cenario_B.executar(processos);

        // Aguarda 5 segundos e encerra todos os processos
        Thread.sleep(5000);
        for (Processo p : processos) {
            p.pararExecucao();
        }
        System.out.println("Todos os processos foram sinalizados para parar.");
        
        System.exit(0);
    }
}
