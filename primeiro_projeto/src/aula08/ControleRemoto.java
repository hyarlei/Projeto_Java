package aula08;

public class ControleRemoto implements Controlador{

    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //metodos especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume(){
        return this.volume;
    }

    private boolean getLigado(){
        return this.ligado;
    }

    private boolean getTocando(){
        return this.tocando;
    }

    private void setVolume(int V){
        this.volume = V;
    }


    private void setLigado(boolean L){
        this.ligado = L;
    }

    private void setTocando(boolean T){
        this.tocando = T;
    }

    @Override
    public void Ligar() {
        this.setLigado(true);
    }

    @Override
    public void Desligar() {
        this.setLigado(false);
    }

    @Override
    public void AbrirMenu() {
        System.out.println(" ESTA LIGADO? "+ this.getLigado());
        System.out.println(" ESTA TOCANDO? "+ this.getTocando());   
        System.out.print(" VOLUME: "+ this.getVolume());
        for (int i = 0; i <=this.getVolume() - 1; i+=10){
            System.out.print(" | ");
        }
        System.out.println();
    }

    @Override
    public void FecharMenu() {
        System.out.println(" FECHANDO MENU... ");
        System.out.println(" MENU FECHADO. ");
    }

    @Override
    public void MaisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
        else{
            System.out.println(" IMPOSSIVEL AUMENTAR VOLUME. LIGUE O CONTROLE REMOTO.");
        }
    }

    @Override
    public void MenosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
        else{
            System.out.println(" IMPOSSIVEL DIMINUIR VOLUME. LIGUE O CONTROLE REMOTO");
        }
    }

    @Override
    public void LigarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
        else{
            System.out.println(" IMPOSSIVEL LIGAR O MUDO. LIGUE O CONTROLE REMOTO. ");
        }
    }

    @Override
    public void DesligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
        else{
            System.out.println(" IMPOSSIVEL DESLIGAR O MUDO. LIGUE O CONTROLOE REMOTO.");
        }
    }

    @Override
    public void Play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
        else{
            System.out.println(" ERRO. NAO CONSEGUIR REPRODUZIR. LIGUE O CONTROLE REMOTO.");
        }
    }

    @Override
    public void Pause() {
        if(this.getLigado() && (this.getTocando())){
            this.setTocando(false);
        }
        else{
            System.out.println(" ERRO. NAO CONSEGUIR PAUSAR. LIGUE O CONTROLOE REMOTO. ");
        }
    }
}
