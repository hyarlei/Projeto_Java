package desafio;

public class Desafio{
    public static void main(String[] args){
        
        Aposentado ap = new Aposentado();
        ap.setnome("jefim");
        ap.setidade(61);
        System.out.println(" o nome e: "+ ap.getnome());
        System.out.println(" a idade e: "+ ap.getidade());
        //System.out.println(----------------------------);
        System.out.println(ap.isAposentado());
        //System.out.println(----------------------------);
    }
}
