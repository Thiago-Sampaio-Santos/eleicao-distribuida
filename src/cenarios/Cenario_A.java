package cenarios;

import java.util.List;
import bully.AlgoritmoBully;
import processo.Processo;

// Essa classe está simulando a falha do coordenador atual
public class Cenario_A {
        public static void executar(List<Processo> processos) {
        System.out.println("\n--- CENÁRIO A ---");

        // Falha do coordenador atual
        for (Processo p : processos) {
            if (p.isCoordenador()) {
                p.desativar();
                System.out.println("Coordenador " + p.getId() + " falhou. \n");
                break;
            }
        }

        // Processo com ID 1 detecta e inicia eleição
        AlgoritmoBully.iniciarEleicao(processos.get(1), processos);
    }
}
