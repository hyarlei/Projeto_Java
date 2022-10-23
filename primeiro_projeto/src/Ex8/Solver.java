package Ex8;

import java.util.ArrayList;
import java.util.Scanner;
class ComputaSequencia{

    ArrayList<Integer> vetor = new ArrayList<>();
    
    public void cadastra(int valor){
        if(valor != 0){
            vetor.add(valor);
        }
        else{
            vetor.remove(vetor.size()-1);
        }
    }

    public int computa(){
        int soma=0;
        for(int i : vetor){
            soma += i;
        }
        return soma;
    }

    public String toString(){
        return String.format("valores = "+vetor.toString());
    }
    
}



class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComputaSequencia sequencia = new ComputaSequencia();

        while(true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            System.out.println("$" + line);
            if(ui[0].equals("end")) {
                break; 
            } else if(ui[0].equals("cadastra")) {
                sequencia.cadastra( Integer.parseInt( ui[1]) );
            } else if(ui[0].equals("computa")) {
                System.out.println( sequencia.computa() ); 
            } else if(ui[0].equals("show")) {
                System.out.println( sequencia );
            }else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}
