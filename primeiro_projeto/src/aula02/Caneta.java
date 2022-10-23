package aula02;

public class Caneta{
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;
    public int a;

    void status(){
        System.out.println(" modelo: " + modelo);
        System.out.println(" uma caneta " + cor);
        System.out.println(" ponta: " + ponta);
        System.out.println(" carga: " + carga);
        System.out.println(" esta tampada? " + tampada);
        }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println(" ERRO! nao posso rabiscar ");
        }
        else {
            System.out.println(" Estou rabiscando ");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
