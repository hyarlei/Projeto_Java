package Ex2;

import java.util.Scanner;

class Car{
    public int pass; // Passageiros
    public int passMax; // limite de Passageiros
    public int gas; // tanque
    public int gasMax; // limite do tanque
    public int km; // quantidade de quilometragem
    
    public Car(){
        this.pass = 0;
        this.passMax = 2;
        this.gas = 0;
        this.gasMax = 100;
        this.km = 0;
    }
    public void enter(){
        if(pass < passMax){
            pass++;
        }
        else{
            System.out.println("fail: limite de pessoas atingido");
        }
    }
    public void leave(){
        if(pass > 0){
            pass--;
        }
        else{
            System.out.println("fail: nao ha ninguem no carro");
        }
    }
    public void fuel(int gas){
        if(this.gas + gas <= this.gasMax){
            this.gas += gas;
        }
        else{
            this.gas = this.gasMax;
        }
    }
    public void drive (int km){
        if(this.pass > 0 && this.gas > 0){
            int aux = 0;
            if(this.gas >= km){
                this.gas -= km;
                this.km += km;
            }
            else{
                aux = gas;
                gas = 0;
                this.km += aux;
                System.out.println("fail: tanque vazio apos andar " +aux + " km");
            }
        }
        else if(this.pass <= 0){
            System.out.println("fail: nao ha ninguem no carro");
        }
        else{
            System.out.println("fail: tanque vazio");
        }
    }
    public String toString(){
        return "pass: " +this.pass + ", gas: " +this.gas + ", km: " +this.km;
    }
};

class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        while(true) {
            String line = scanner.nextLine();
            String ui[] = line.split(" ");
            System.out.println("$" + line);
            if(ui[0].equals("end")) {
                break;
            } else if(ui[0].equals("enter")) {
                car.enter();
            } else if(ui[0].equals("leave")) {
                car.leave();
            } else if(ui[0].equals("show")) {
                System.out.println(car.toString());
            } else if (ui[0].equals("drive")) {//km
                car.drive(Integer.parseInt(ui[1]));
            } else if (ui[0].equals("fuel")) {//gas
                car.fuel(Integer.parseInt(ui[1]));
            } else{
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}