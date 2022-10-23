package aula04;

public class Aviao {

    protected int registro;
    protected String nome;
    protected float carga;
    public int passageiros;

    public void status(){
        System.out.println(" registro: " + this.registro);
        System.out.println(" nome " + this.nome);
        System.out.println(" carga: " + this.carga);
        System.out.println(" passageiros: " + this.passageiros);
    }
}
