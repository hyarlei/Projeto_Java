package MediaAluno;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception{
        double nota[][] = new double[2][4];
        double media[] = new double[2];
        try (Scanner sc = new Scanner(System.in)){
            for(int i = 0; i < 2; i++){
                System.out.println((i+1) + " Aluno: ");
                double soma = 0.0;
                for(int j = 0; j < 4; j++){
                    System.out.println( (j+1) + " Nota: ");
                    nota[i][j] = sc.nextDouble();
                    soma += nota[i][j];
                }
                media[i] = soma/4.0;
                System.out.println("Media é: " + media[i]);
            }
        }
    }
}