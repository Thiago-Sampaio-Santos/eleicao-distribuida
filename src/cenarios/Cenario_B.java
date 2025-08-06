package cenarios;

import java.util.List;

import anel.AlgoritmoAnel;
import processo.Processo;

// Essa classe simula várias falhas e inicia uma eleição via algoritmo do Anel

public class Cenario_B {
        public static void executar(List<Processo> processos) {
        System.out.println("\n--- CENÁRIO B ---");

        //Simula a falha dos processsos 2 e 4
        for (int i = 2; i <= 4; i++) {
            processos.get(i).desativar();
            System.out.println("Processo " + processos.get(i).getId() + " falhou.");
        }
        System.out.println("\n");
        
        // O processo 0 inicia eleição circular
        AlgoritmoAnel.iniciarEleicao(processos, 0);
    }
}
