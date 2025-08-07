package bully;

import log.Logger;

import java.util.List;
import processo.Processo;

// Algoritmo Bully para eleger o coordenador entre processos.
public class AlgoritmoBully {
        public static void iniciarEleicao(Processo iniciador, List<Processo> processos) {
        Logger.falhaDetectada(iniciador.getProcessoId());

        int novoCoordenador = -1;

        // Envia mensagem para todos com ID maior
        for (Processo p : processos) {
            if (p.isAtivo() && p.getProcessoId() > iniciador.getProcessoId()) {
                p.enviarMensagem("ELEIÇÃO recebida de " + iniciador.getProcessoId());
            }
        }

        // Elege o maior ID ativo como coordenador
        for (Processo p : processos) {
            if (p.isAtivo() && p.getProcessoId() > novoCoordenador) {
                novoCoordenador = p.getProcessoId();
            }
        }

        for (Processo p : processos) {
            p.setCoordenador(p.getProcessoId() == novoCoordenador);
        }

        Logger.novoCoordenador(novoCoordenador);
    }
}
