package UltraEmojiCombate;

import java.util.Random;

public class Luta {

    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //metodos
    public void MarcarLuta(Lutador l1, Lutador l2){
        if(l1.getcategoria().equals(l2.getcategoria())//verificar a categoria dos competidores.
        && l1 != l2){ //verificar se nao sao os mesmos.
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void Lutar(){
        if(this.aprovada){
            System.out.println("----desafiado-----");
            this.desafiado.apresentar();
            System.out.println("-----desafiante-----");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);//0 1 2
            System.out.println(" COMEÇAM O COMBATE! ");
            System.out.println("=========RESULTADO DA LUTA=========");
            switch(vencedor){
                case 0: //empate
                System.out.println(" EMPATOU! ");
                this.desafiado.EmpatarLuta();
                this.desafiante.EmpatarLuta();
                break;
                case 1: //desafiado vence
                System.out.println(" VITORIA DO "+ this.desafiado.getNome());
                this.desafiado.GanharLuta();
                this.desafiante.PerderLuta();
                break;
                case 2: //desafiante vence
                System.out.println(" VITORIA DO "+ this.desafiante.getNome());
                this.desafiante.GanharLuta();
                this.desafiado.PerderLuta();
                break;
            }
        }
        else{
            System.out.println(" A luta não pode acontecer! ");
        }
        System.out.println("==================================");
    }

    //metodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }
   
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
   
    public Lutador getDesafiante() {
        return desafiante;
    }
    
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    public int getRounds() {
        return rounds;
    }
   
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
