package aula03;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println(" modelo: " + this.modelo);
        System.out.println(" uma caneta " + this.cor);
        System.out.println(" ponta: " + this.ponta);
        System.out.println(" carga: " + this.carga);
        System.out.println(" esta tampada? " + this.tampada);
        }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println(" ERRO! nao posso rabiscar ");
        }
        else {
            System.out.println(" Estou rabiscando ");
        }
    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}
