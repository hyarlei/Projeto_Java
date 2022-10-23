package aula07;

public class aula07 {
    public static void main(String[] args){

        ContaBanco P1 = new ContaBanco();
        System.out.println("----------EXTRATO BANCARIO---------");
        P1.setnumConta(1111);
        //P1.settipo(" CP ");
        P1.setdono(" JUBILEU ");
        P1.abrirConta(" CC ");

        ContaBanco P2 = new ContaBanco();
        P2.setnumConta(2222);
        //P1.settipo(" CP ");
        P2.setdono(" CREUZA ");
        P2.abrirConta(" CP ");

        P1.depositar(100);
        P2.depositar(500);
        //P1.pagarMensal();
        P1.sacar(150);
        P2.sacar(650);
        P1.fecharConta();
        P2.fecharConta();


        P1.EstadoAtual();
        P2.EstadoAtual();

    }
}