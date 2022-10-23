package MediaAluno;

public class RegistroNotas{
    public static void main(String[] args) throws Exception{
        Estudante [] e = new Estudante[2];
        e[0] = new Estudante("Joao");
        e[1] = new Estudante("Jose");
        e[0].le_notas();
        e[1].le_notas();
        e[0].calcula_media();
        e[1].calcula_media();
        e[0].info();
        e[1].info();
    }
}
