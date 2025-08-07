package cenarios;

import java.util.List;
import bully.AlgoritmoBully;
import processo.Processo;

// Essa classe simula a falha do coordenador atual e inicia uma eleição usando o algoritmo Bully.
public class Cenario_A {
        public static void executar(List<Processo> processos) {
        System.out.println("\n--- CENÁRIO A ---");

        for (Processo p : processos) {
            if (p.isCoordenador()) {
                p.desativar();
                System.out.println("Coordenador " + p.getProcessoId() + " falhou. \n");
                break;
            }
        }

        // Processo com ID 1 detecta e inicia eleição
        AlgoritmoBully.iniciarEleicao(processos.get(1), processos);

        // Simula retorno do coordenador original após eleição
        try {
            Thread.sleep(3000);
            processos.get(4).ativar();
            System.out.println("Coordenador original (Processo 4) retornou ao sistema.");
        } catch (InterruptedException e) {
            System.err.println("Erro ao simular retorno do coordenador.");
        }
    }
}
