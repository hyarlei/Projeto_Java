package aula07;

public class ContaBanco{

    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float Saldo;
    private boolean status;

    public ContaBanco(int n, String t, String d, float S, boolean s){
        
        this.numConta = n;
        this.tipo = t;
        this.dono = d;
        this.Saldo = S;
        this.status = s;

    }

    //metodos personalizados
    public void abrirConta(String t){
        
        this.settipo(t);
        this.setstatus(true);
        if(t == " CC " ){//CP - Conta Corrente
            //this.Saldo = 50;
            this.setSaldo(50);
        }
        else if(t == " CP "){//CP - conta poupaca
            //this.Saldo = 150;
            this.setSaldo(150);
        }
        System.out.println(" CONTA ABERTA COM SUCESSO POR -"+ this.getdono());
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println(" CONTA NAO PODE SER FECHADA. POIS CONTEM SALDO. ");
        }
        else if(this.getSaldo() < 0){
            System.out.println(" CONTA NAO PODE SER FECHADA. POIS, POSSUI DEBITO. ");
        }
        else{
            this.setstatus(false);
            System.out.println(" CONTA FECHADA COM SUCESSO POR -"+ this.getdono());
        }
    }

    public void depositar(float v){
        if(this.getstatus()){
            //this.setSaldo(this.getSaldo() + v);//saldo = saldo + v;
            this.Saldo = this.Saldo + v;
            System.out.println(" DEPOSITO REALIZADO COM SUCESSO NA CONTA DE -"+ this.getdono());
        }
        else{
            System.out.println(" IMPOSSIVEL REALIZAR DEPOSITO EM UMA CONTA FECHADA. " );
        }
    }

    public void sacar(float v){
        if(this.getstatus()){

            if(this.getSaldo() >= v){
                this.Saldo = this.Saldo - v;
                System.out.println(" SAQUE REALIZADO NA CONTA DE -"+ this.getdono());

            } else {
                System.out.println(" SALDO INSULFICIENTE PARA SAQUE. ");

            }
        }else{
            System.out.println(" IMPOSSIVEL SACAR EM UMA CONTA FECHADA. ");
            }
        }

    public void pagarMensal(){
        int v = 0;  
        if(this.tipo == "CC"){
            v = 12;
            }
        else if(this.tipo == "CP"){
            v = 20;
        }
        if(this.getstatus()){
            this.Saldo = this.Saldo - v;
            System.out.println(" MENSALIDADE PAGA COM SUCESSO POR -"+ this.getdono());
        }
        else{
            System.out.println(" IMPOSSIVEL PAGAR EM UMA CONTA FECHADA. ");
        }
    }

    public ContaBanco(){

        this.Saldo = 0;
        this.status = false;

    }

    public void setnumConta(int n) {
        numConta = n;
    }

    public int getnumConta() {
        return numConta;
    }

    public void settipo(String t){
        tipo = t;
    }

    public String gettipo(){
        return tipo;
    }

    public void setdono(String d) {
        dono = d;
    }

    public String getdono(){
        return dono;
    }

    public void setSaldo(int S){
        Saldo = S;
    }

    public float getSaldo(){
        return Saldo;
    }

    public void setstatus(boolean s){
        status = s;
    }

    public boolean getstatus(){
        return status;
    }

    public void EstadoAtual(){

        System.out.println(" ---------------------------------");
        System.out.println(" Conta: " + this.getnumConta());
        System.out.println(" Tipo: " + this.gettipo());
        System.out.println(" Dono: " + this.getdono());
        System.out.println(" Saldo: " + this.getSaldo());
        System.out.println(" Status: " + this.getstatus());
        System.out.println(" ---------------------------------");
    }
}
