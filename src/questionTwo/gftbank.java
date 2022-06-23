package questionTwo;

public class gftbank {
    public static void main(String[] args) {
        ContaCorrente Mario = new ContaCorrente();
        ContaPoupanca Ana = new ContaPoupanca();

        Mario.setTitular("José Mario Nunes Silva");
        Mario.deposito(1000.00f);
        Mario.setNumero(10003);
        Mario.rendimento();
        Mario.calcularImposto();
        Mario.extrato();

        System.out.println();

        Ana.setTitular("Ana Clara Paulino Moraes");
        Ana.deposito(1000.00f);
        Ana.setNumero(10004);
        Ana.rendimento();
        Ana.calcularImposto();
        Ana.extrato();
    }
}
