package exercicios1;
public class Programa01 {
    public static void main(String[] args){
        final double CM_POR_POLEGADA = 2.54; //uma constante
        double LarguraPapel = 8.5;
        double AlturaPapel = 11;
        System.out.println(" Tamanho do papel em centimetros: "
                            + LarguraPapel * CM_POR_POLEGADA + " por "
                            + AlturaPapel * CM_POR_POLEGADA);
    }
}
