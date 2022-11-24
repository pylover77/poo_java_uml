package Modelo;

public class Credito {
    public double valor;
    public Credito(
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
