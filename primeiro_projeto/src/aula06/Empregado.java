package aula06;

public class Empregado {

    public String nome;
    private int numero_de_identidade;
    private int salario;
    public int endereco;
    private int departamento;

    public Empregado(String n, int n_id, int s, int end, int dep){
        this.nome = n;
        this.numero_de_identidade = n_id;
        this.salario = s;
        this.endereco = end;
        this.departamento = dep;

    }

    public String getNome(){
        return this.nome;
    }
    
    public int getNumero_de_identidade(){
        return this.numero_de_identidade;
    }
    public void setNumero_de_identidade(int n_id){
        this.numero_de_identidade = n_id;
    }
    public int getSalario(){
        return this.salario;
    }
    public void setSalario(int s){
        this.salario = s;
    }
    public int getEndereco(){
        return this.endereco;
    }
    public void setEndereco(int n_end){
        this.endereco = n_end;
    }
    public int getDepartamento(){
        return this.departamento;
    }
    public void setDepartamento(int dep){
        this.departamento = dep;
    }
    public void status(){
        System.out.println(" nome: " + this.getNome());
        System.out.println(" numero de identidade: " + this.getNumero_de_identidade());
        System.out.println(" salario: " + this.getSalario());
        System.out.println(" endereco: " + this.getEndereco());
        System.out.println(" departamento: " + this.getDepartamento());
    }
}
