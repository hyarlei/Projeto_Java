package aula09;

public class Lutador {

    //atributos
    private String Nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //metodos especiais
    public Lutador(String no, String na, int id, float al, float pe, String ca, int vi, int de, int em){

        this.Nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setpeso(pe);
        this.categoria = ca;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates =  em;

    }
    public Lutador() {
    }
    public Lutador(String string, String string2, int i, double d, int j, int k, int l, int m) {
	}
	public void Apresentar(){

        System.out.println(" nome: "+ this.getNome());
        System.out.println(" nacionalidade: "+ this.getnacionalidade());
        System.out.printf(" idade: "+ this.getIdade(), " anos ");
        System.out.println();
        System.out.printf(" altura: "+ this.getAltura(), " m de altura. ");
        System.out.println();
        System.out.printf(" pesando "+ this.getpeso(), " kg. ");
        System.out.println();
        //System.out.println(" categoria: "+ this.getcategoria());
        System.out.println(" ganhou: "+ this.getVitorias());
        System.out.println(" perdeu: "+ this.getDerrotas());
        System.out.println(" empatou: "+this.getEmpates());

    }

    public void Status(){

    }

    public void GanharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void PerderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void EmpatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome(){
        return this.Nome;
    }

    public String getnacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }
    
    public float getpeso(){
        return this.peso;
    }

    public String getcategoria(){
        return this.categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setNome(String no){
        this.Nome = no;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public void setpeso(float pe){
        this.peso = pe;
        this.setcategoria();
    }

    private void setcategoria(){
        if(this.peso < 52.2){
            this.categoria = "invalido";
        }
        else if(this.peso <= 70.3){
            this.categoria = "leve";
        }
        else if(this.peso >= 83.9){
            this.categoria = "medio";
        }
        else if(this.peso <= 120.2){
            this.categoria = "pesado";
        }
        else{
            this.categoria = "invalido";
        }
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
}

