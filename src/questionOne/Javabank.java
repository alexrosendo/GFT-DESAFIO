package questionOne;

public class Javabank {
    public static void main(String[] args) {
        ContaCorrente Alex = new ContaCorrente();
        ContaPoupanca Clecio = new ContaPoupanca();

        Alex.setTitular("José Alex Silva");
        Alex.deposito(1000.00f);
        Alex.setNumero(10001);
        Alex.rendimento();
        Alex.extrato();

        System.out.println();

        Clecio.setTitular("Clécio Paulino Moraes");
        Clecio.deposito(1000.00f);
        Clecio.setNumero(10002);
        Clecio.rendimento();
        Clecio.extrato();
    }
}
