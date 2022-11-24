package Modelo;

public class Debito {
    public double valor;
    public Debito(
        double valor
    ){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString() {
        return this.valor +"";
    }

}
