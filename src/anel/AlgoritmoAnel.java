package anel;
import log.Logger;
import java.util.List;

import processo.Processo;

public class AlgoritmoAnel {
        public static void iniciarEleicao(List<Processo> processos, int iniciadorIndex) {
        Logger.falhaDetectada(processos.get(iniciadorIndex).getProcessoId());

        int eleito = processos.get(iniciadorIndex).getProcessoId();
        int n = processos.size();

        int atual = (iniciadorIndex + 1) % n;

        // Passa a mensagem circularmente
        while (atual != iniciadorIndex) {
            Processo p = processos.get(atual);
            if (p.isAtivo()) {
                if (p.getProcessoId() > eleito) {
                    eleito = p.getProcessoId(); // se o Id for maior que o atual, ele é atualizado
                }
                p.enviarMensagem("Passando ID " + eleito);
            }
            atual = (atual + 1) % n;
        }

        for (Processo p : processos) {
            p.setCoordenador(p.getId() == eleito);
        }

        Logger.novoCoordenador(eleito);
    }
}
