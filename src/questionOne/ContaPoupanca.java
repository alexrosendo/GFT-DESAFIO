package questionOne;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class ContaPoupanca extends Conta{

    @Override
    public void rendimento() {
        double atualizaSaldo = getSaldo() * 0.05;
        setSaldo(getSaldo()+atualizaSaldo);
    }

    @Override
    public void extrato(){
        DecimalFormat frmt = new DecimalFormat("#.##");
        System.out.println("====Extrato Conta Poupança====");
        System.out.println("Nome :. "+getTitular());
        System.out.println("N° da Conta :. "+getNumero());
        System.out.println("Saldo Atual :. R$"+frmt.format(getSaldo()));
        System.out.println("Hora da impressão :. "+ LocalDateTime.now());
    }

    @Override
    public void deposito(float deposito) {
        setSaldo(getSaldo()+deposito);
    }
}
