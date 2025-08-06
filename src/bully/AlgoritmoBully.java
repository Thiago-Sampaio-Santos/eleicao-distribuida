package bully;

import log.Logger;

import java.util.List;
import processo.Processo;

// Algoritmo Bully para eleger o coordenador entre processos.
public class AlgoritmoBully {
        public static void iniciarEleicao(Processo iniciador, List<Processo> processos) {
        Logger.falhaDetectada(iniciador.getId());

        int novoCoordenador = -1;

        // Envia mensagem para todos com ID maior
        for (Processo p : processos) {
            if (p.isAtivo() && p.getId() > iniciador.getId()) {
                p.enviarMensagem("ELEIÇÃO recebida de " + iniciador.getId());
            }
        }

        // Ele o maior ID ativo como coordenador
        for (Processo p : processos) {
            if (p.isAtivo() && p.getId() > novoCoordenador) {
                novoCoordenador = p.getId();
            }
        }

        for (Processo p : processos) {
            p.setCoordenador(p.getId() == novoCoordenador);
        }

        Logger.novoCoordenador(novoCoordenador);
    }
}
