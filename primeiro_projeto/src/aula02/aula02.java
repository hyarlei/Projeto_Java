package aula02;

import java.util.Scanner;

public class aula02 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Caneta c1 = new Caneta();

            c1.modelo = sc.next();
            c1.cor = "Azul";
            c1.ponta = 0.5f;
            c1.carga = 100;
            c1.destampar();
            c1.status();
            c1.rabiscar();
        
        System.out.println("----------------");
        Caneta c2 = new Caneta();
        c2.modelo = "faber castell";
        c2.cor = "vermelha";
        c2.ponta = 1.0f;
        c2.carga = 100;
        c2.tampada = false;
        c2.tampar();
        c2.status();
        c2.rabiscar();

        sc.close();

    }
}
