package Banco;

public class ContaUsuario {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.abrirConta("Caio Henrique", "CC");
        conta1.sacar(50);
        conta1.depositar(12);
        conta1.pagarMensalidade();


        ContaBanco conta2 = new ContaBanco();
        conta2.abrirConta("Raissa Vilar" ,"CP");
        conta2.pagarMensalidade();



    }
}
