package aula08;

public class aula08 {
    public static void main(String[] args){
        ControleRemoto C = new ControleRemoto();
        System.out.println("-------MENU--------");
        C.Ligar();
        C.MaisVolume();
        C.MaisVolume();
        C.MaisVolume();
        C.MaisVolume();
        //C.MenosVolume();
        //C.MaisVolume();
        //C.LigarMudo();
        //C.DesligarMudo();
        C.Play();
        C.AbrirMenu();
        C.FecharMenu();

    }
}
    