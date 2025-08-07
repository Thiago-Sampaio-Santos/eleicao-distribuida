package processo;

/* Essa classe aqui, representa cada processo da rede. 
 * A execução é simulada por meio de uma thread.
 */
public class Processo extends Thread {
    private int id;
    private boolean ativo;
    private boolean coordenador;
    private boolean emExecucao;

    public Processo(int id) {
        this.id = id;
        this.ativo = true;
        this.coordenador = false;
        this.emExecucao = true;
    }

    public int getProcessoId() {
        return id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void desativar() {
        this.ativo = false;
    }

    public void ativar() {
        this.ativo = true;
    }

    public boolean isCoordenador() {
        return coordenador;
    }

    
    public void setCoordenador(boolean coordenador) {
        this.coordenador = coordenador;
    }

    
    public void pararExecucao() {
        this.emExecucao = false;
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("Processo " + id + " envia: " + mensagem);
    }

    @Override
    public void run() {
        while (emExecucao) {
            if (ativo) {
                try {
                    Thread.sleep(2000); // simula atividade

                    if (coordenador) {
                        System.out.println("Processo " + id + " (coordenador) está ativo.");
                    } else {
                        System.out.println("Processo " + id + " está aguardando.");
                    }

                } catch (InterruptedException e) {
                    System.err.println("Processo " + id + " foi interrompido.");
                }
            } else {
                try {
                    Thread.sleep(5000); // processo inativo demora mais
                } catch (InterruptedException e) {
                    System.err.println("Processo inativo " + id + " foi interrompido.");
                }
            }
        }

        System.out.println("Processo " + id + " terminou a execução.");
    }
}
