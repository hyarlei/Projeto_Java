package desafio;

public class Aposentado {

    private String nome;
    private int idade;
    private String cpf;
    private String datAposentado;

    public Boolean isAposentado(){
        if(this.idade >= 60){
            return true;
        }

        else{
            return false;
        }
    }
    
    public String getnome(){
        return this.nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public int getidade(){
        return this.idade;
    }

    public void setidade(int idade){
        this.idade = idade;
    }

    public String getcpf(){
        return this.cpf;
    }

    public void setcpf(String cpf){
        this.cpf = cpf;
    }

    public String getdatAposentado(){
        return this.datAposentado;
    }

    public void setdatAposentado(String datAposentado){
        this.cpf = datAposentado;
    }
}
