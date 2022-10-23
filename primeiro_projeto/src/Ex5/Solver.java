package Ex5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

class Conta {
    private String titular;
    private int numero;
    private double saldo;
    private static int totalContas = 0;
    
    public Conta(String titular) {
		numero = totalContas;
		totalContas++;
		saldo = 0;
		this.titular = titular;
	}

	void deposita(double valor){
		saldo += valor;
    }

    static void deposita(Conta c, double valor){
    	c.deposita(valor);//metodo estatico
    }

    boolean saca(double valor){
		if(valor <= saldo) {
			saldo -= valor;
			return true;
		}
		else {
			System.out.printf("Conta ficou zerada após o saque %.2f reais\n", saldo);
			saldo = 0;
			return false;
		}
    }

    static void saca(Conta c, double valor){
    	c.saca(valor);
    }

    boolean transfere(Conta c, double valor){
        double tempSaldo = saldo;
        if(saca(valor)) {
        	c.deposita(valor);
        	return true;
        }
        else {
        	c.deposita(tempSaldo);
        	return false;
        }
    }

    static boolean transfere(Conta origem, Conta destino, double valor){
		return origem.transfere(destino, valor);
    }

    public String toString(){
        return String.format("Nro da conta: %d, Titular: %s, Saldo: %.2f", numero, titular, saldo);
    }
}

class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault ( Locale.US ) ;
        
        ArrayList<Conta> contas = new ArrayList<Conta>();

        while(true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            System.out.println("$" + line);

            if(ui[0].equals("init")) {
                contas.add( new Conta( ui[1] ) );
            } else if(ui[0].equals("end")) {
                break;
            } else if(ui[0].equals("deposita")) {
                int nro = Integer.parseInt(ui[1] );
                double valor = Double.parseDouble(ui[2]);
                Conta.deposita( contas.get(nro),  valor); 
            }else if(ui[0].equals("saca")) {
                int nro = Integer.parseInt(ui[1] );
                double valor = Double.parseDouble(ui[2]);
                Conta.saca( contas.get(nro),  valor); 
            }else if(ui[0].equals("transfere")) {
                int origem = Integer.parseInt(ui[1] );
                int destino = Integer.parseInt(ui[2] );
                double valor = Double.parseDouble(ui[3]);
                Conta.transfere( contas.get(origem), contas.get(destino), valor); 
            } else if(ui[0].equals("show")) {
                int i = Integer.parseInt(ui[1] );
                System.out.println( contas.get(i) ); 
            } else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}
