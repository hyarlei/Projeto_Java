package Ex7;

import java.util.*;

class Person { //todo
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return String.format("%s:%d", name, age);
    }
}

class Motorcycle { //todo
    private Person person; //agregacao
    private final int power;
    private int time;
    
    //Inicia o atributo power, time com zero e person com null
    public Motorcycle(int power){
        this.power = power;
        this.time = 0;
        this.person = null;
    }
    public int getPower() { //todo
        return power;
    }
    public int getTime() {
        return time;
    }
    public Person getPerson() {
        return person;
    }
    //Comprar mais tempo
    public void buy(int time){
        this.time += time;
    }
    
    //Se estiver vazio, coloca a pessoa na moto e retorna true
    public boolean enter(Person person) {
        if(this.person == null){
            this.person = person;
            return true;
        }
        else{
            System.out.println("fail: busy motorcycle");
            return false;
        }
    }
    public Person leave() {
        if(this.person != null){
            Person temp = this.person;
            this.person = null;
            return temp;
        }
        else{
            System.out.println("fail: empty motorcycle");
            return null;
        }
    }
    public void drive(int time){
        if(this.person.getAge() > 10){
            System.out.println("fail: too old to drive");
            return;
        }
        else if(this.getTime() == 0){
            System.out.println("fail: buy time first");
            return;
        }
        if(this.time < time){
            System.out.printf("fail: time finished after %d minutes\n",this.time);
            this.time = 0;
        }
        else{
            this.time -= time;
        }
    }
    
    public void honk(){
        StringBuilder buzina = new StringBuilder();
        buzina.append('P');
        for(int i = 1; i <= power; i++){
            if(i == power) buzina.append("em");
            else buzina.append('e');
        }
        System.out.println(buzina);
    }
    
    public String toString(){
        if(this.person == null) return String.format("power:%d, time:%d, person:(empty)",power,time);
        else return String.format("power:%d, time:%d, person:(%s)",power,time,person);
    }
}

class Solver{
    static Shell sh = new Shell();
    static Motorcycle motoca  = new Motorcycle(1);
    public static void main(String[] args) {
    
        sh.setfn("init",   () -> motoca = new Motorcycle(toInt(sh.par(1))));
        sh.setfn("buy",    () -> motoca.buy(toInt(sh.par(1))));
        sh.setfn("enter",  () -> motoca.enter(new Person(sh.par(1), toInt(sh.par(2)))));
        sh.setfn("drive",  () -> motoca.drive(toInt(sh.par(1))));
        sh.setfn("leave",  () ->  {
            Person person = motoca.leave();
            if(person != null) {
                System.out.println(person.toString());
            }
        });
        sh.setfn("honk",   () -> motoca.honk());
        sh.setfn("show",   () -> System.out.println(motoca));
    
        sh.execute();
    }
    static int toInt(String s){
        return Integer.parseInt(s);
    }
}

class Shell {
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, Runnable> chain = new HashMap<>();
    private ArrayList<String> ui = new ArrayList<>();
    public Shell() {
        Locale.setDefault(new Locale("en", "US"));
    }
    public void setfn(String key, Runnable value) {
        chain.put(key, value);
    }
    public String par(int index) {
        return ui.get(index);
    }
    public void execute() {
        while(true) {
            ui.clear();
            String line = scanner.nextLine();
            Collections.addAll(ui, line.split(" "));
            System.out.println("$" + line);
            if(ui.get(0).equals("end")) {
                break;
            } else if (chain.containsKey(ui.get(0))) {
                chain.get(ui.get(0)).run();
            } else {
                System.out.println ("fail: comando invalido");
            }
        }
    }
    
}