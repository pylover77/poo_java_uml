package Modelo;
import java.util.Objects;
public class Conta {
    protected String numero;
    protected Cliente cliente;
    protected Credito credito;
    protected Debito debito;
    public Conta(){}
    public Conta(
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
    public void depositar(double valor){
        this.credito.setValor( this.credito.getValor() + valor );

        
    }
    public void sacar(double valor){
        this.debito.setValor(this.debito.getValor() + valor);
    }

    public Credito getCredito() {
        return credito;
    }

    public Debito getDebito() {
        return debito;
    }

    public String getNumero() {
        return numero;
    }
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCredito(Credito credito) {
        this.credito = credito;
    }

    public void setDebito(Debito debito) {
        this.debito = debito;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return  "\n"+ "Seu Credito:" +this.credito + "\n"+ "Seu Debito:" + this.debito + "\n"+ "Seu numero:" + this.numero + "\n" + "Cliente--> \n"+ this.cliente + "\n";
    }
    
    @Override
    public boolean equals(Object myObject ) {
        if (this == myObject)return true;
        if (myObject == null || this.getClass() != myObject.getClass()) return false;
        Conta conta = (Conta) myObject; 
        return Objects.equals(this.numero, conta.numero);
    }
    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
