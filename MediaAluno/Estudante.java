package MediaAluno;
import java.util.Scanner;

public class Estudante{

    String nome;
    double media;
    double [] notas;
    
    public Estudante(String nome){

        this.nome = nome;
        notas = new double[4]; 

    }

    public void le_notas(){

        try (Scanner sc = new Scanner(System.in)){
            for(int i = 0; i < 4; i++){
                System.out.println( (i+1) + " Nota: ");
                notas[i] = sc.nextDouble();
            }
        }
    }

    public void calcula_media(){

        double soma = 0.0;
        for(int i = 0; i < 4; i++)
            soma += notas[i];
            media = soma/4.0;
    }
    
    public void info(){
        
        System.out.println(" Nome: " + nome);
        System.out.println(" Media: " + media);
    }
}
