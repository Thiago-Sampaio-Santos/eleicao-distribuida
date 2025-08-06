package utils;

import java.util.List;

import processo.Processo;

/* Aqui temos um método para retornar o coordenador ativo. 
* Nesse caso, ele verifica qual processo está como coordenador ativo.*/ 
public class CoordenadorUtils {
        public static Processo getCoordenadorAtual(List<Processo> processos) {
        for (Processo p : processos) {
            if (p.isCoordenador() && p.isAtivo()) {
                return p;
            }
        }
        return null;
    }
}
