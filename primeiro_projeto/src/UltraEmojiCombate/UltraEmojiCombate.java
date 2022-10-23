package UltraEmojiCombate;

public class UltraEmojiCombate {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador(" Jon Jones", "EUA", 31, 1.93f, 113.0f, 
                           26, 1, 0);
        l[1] = new Lutador("Anderson silva", "Brasil", 29, 1.88f, 84.0f, 
                           34, 11, 0);
        l[2] = new Lutador("Georges St. Pierre", "Canadá", 35, 1.78f, 
                            84.0f, 26, 2, 0);
        l[3] = new Lutador("Fedor Emelianenko", "Ucrânia", 28, 1.83f,
                            106.0f, 39, 6, 0);
        l[4] = new Lutador("Demetrious Johnson", "EUA", 37, 1.60f,
                            57.0f, 30, 4, 1);
        l[5] = new Lutador("José Aldo", "Brasi", 30, 1.70f,
                            66.0f, 29, 7, 0);
        
        Luta UECE01 = new Luta();
        UECE01.MarcarLuta(l[3], l[5]);
        UECE01.Lutar();
        //l[1].status();
        //l[2].status();
        
    }
}
