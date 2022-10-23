package UltraEmojiCombate;

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
    public Object getcategoria;

    //metodos
    public void apresentar(){

        System.out.println("------------------------------------------");
        System.out.println(" CHEGOU A HORA MAIS ESPERADA! apresentamos o lutador "+this.getNome());
        System.out.println(" diretamente do(a) "+this.getnacionalidade());
        System.out.println(" com "+this.getIdade() +" anos e "+this.altura +" metros de altura ");
        System.out.println(" pesando "+this.getpeso() +" Kg ");
        System.out.println("com "+this.getVitorias()+ " vitórias");
        System.out.println(this.getDerrotas()+" derrotas e ");
        System.out.println(this.getEmpates()+" empates! ");
        System.out.println("------------------------------------------");

    }
    //metodos especiais
    public void status(){

        System.out.println("------------------------------------------");
        System.out.println(this.getNome() + " é um peso " + this.getcategoria());
        System.out.println(" ganhou "+this.getVitorias() + " vezes ");
        System.out.println(" perdeu "+this.getDerrotas()+ " vezes ");
        System.out.println(" empatou "+this.getEmpates()+ " vezes. ");
        System.out.println("------------------------------------------");

    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, 
    float peso, int vitorias, int derrotas, int empates){

        this.Nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setpeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;

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

    public void setNome(String nome){
        this.Nome = nome;
    }

    public void setnacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setpeso(float peso){
        this.peso = peso;
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

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}

    