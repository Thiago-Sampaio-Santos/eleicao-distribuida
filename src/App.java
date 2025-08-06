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

        
        // Executa os dois cenários
        Cenario_A.executar(processos);
        Cenario_B.executar(processos);
    }
}
