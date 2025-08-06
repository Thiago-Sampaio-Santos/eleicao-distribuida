package processo;

/* Essa classe aqui, representa cada processo da rede. 
 * Os atributos "ativo e coordenador" permitem saber se o processo está "vivo" e se ele é o líder.
 * E o métodoo enviarMensagem() é uma simples simulação de comunicaçãp.
 */
public class Processo {
    private int id;
    private boolean ativo;
    private boolean coordenador;

    public Processo(int id) {
        this.id = id;
        this.ativo = true;
        this.coordenador = true;
    }

    public int getId() {
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

    public void enviarMensagem(String mensagem) {
        //Simuula o envio de uma mensagem
        System.out.println("Processo " + id + " envia: " + mensagem);
    }
}
