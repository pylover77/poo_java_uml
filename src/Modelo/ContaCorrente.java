package Modelo;

public class ContaCorrente extends Conta{
    private  double limite;
    public void transferir(Conta contaDestino, Double valor){
        if(this.getLimite() < valor ){
            System.out.println("saldo insuficiente");
            return;
        } 
        this.depositar(valor);
        contaDestino.depositar(valor);
        setLimite(calcularSaldo());

    }

    public void transferir(ContaPoupanca contaDestino, Double valor){
        if(this.getLimite() < valor ){
            System.out.println("saldo insuficiente");
            return;
        } 
        this.depositar(valor);
        contaDestino.depositar(valor);
        setLimite(calcularSaldo());

    }
    
    public double calcularSaldo(){
        double resultado = 0;

        resultado = (getCredito().getValor() - getDebito().getValor())+ this.limite;
        return resultado;
    }
    public ContaCorrente(){}
    public ContaCorrente(
        double limite,
        String numero,
        Cliente cliente,
        Credito credito,
        Debito debito
    ){
        
        this.limite = limite;
        this.numero = numero;
        this.cliente = cliente;
        this.credito = credito;
        this.debito = debito;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
  
}
