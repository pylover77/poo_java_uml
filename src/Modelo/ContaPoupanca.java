package Modelo;

public class ContaPoupanca extends Conta{
    private double rentabilidadeMensal;
    public double calcularSaldo(){
        double resultado = 0;
        resultado = (getCredito().getValor() - getDebito().getValor()) + this.rentabilidadeMensal;
        return resultado;
    }

    public ContaPoupanca(){}
    public ContaPoupanca(
        String numero,
        Cliente cliente,
        Credito credito,
        Debito debito
    ){
        this.numero = numero;
        this.cliente = cliente;
        this.credito = credito;
        this.debito = debito;
    }

    public double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }
}
