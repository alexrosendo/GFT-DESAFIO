package questionTwo;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class ContaCorrente extends Conta {
    private double atualizaSaldo;
    private double imposto;

    public double getAtualizaSaldo() {
        return atualizaSaldo;
    }

    public void setAtualizaSaldo(double atualizaSaldo) {
        this.atualizaSaldo = atualizaSaldo;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public void rendimento() {
        setAtualizaSaldo(getSaldo() * 0.03);
        setSaldo(getSaldo()+getAtualizaSaldo());
    }

    @Override
    public void deposito(float deposito) {
        setSaldo(getSaldo()+deposito);
    }

    @Override
    public void calcularImposto(){
       setImposto(getAtualizaSaldo()*0.25); ;
    }

    @Override
    public void extrato(){
        DecimalFormat frmt = new DecimalFormat("#.##");
        System.out.println("====Extrato Conta Corrente====");
        System.out.println("Nome :. "+getTitular());
        System.out.println("N° da Conta :. "+getNumero());
        System.out.println("Saldo Atual :. R$ "+frmt.format(getSaldo()));
        System.out.println("Imposto Devido:. R$ "+frmt.format(getImposto()));
        System.out.println("Hora da impressão :. "+ LocalDateTime.now());
    }


}
