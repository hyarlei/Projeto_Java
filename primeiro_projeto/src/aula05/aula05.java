package aula05;

public class aula05 {
    public static void main (String[] args){
        Caneta c1 = new Caneta("nic", "amarela", 0.5f);
        c1.status();
        System.out.println("--------------------");
        Caneta c2 = new Caneta("bic", "verde", 0.7f);
        c2.status();
    }
}
