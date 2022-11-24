package Modelo;
import java.util.Objects;
public class Endereco {
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;


    public Endereco(){}
    public Endereco (

        String cep,
        String logradouro,
        String numero,
        String complemento,
        String cidade,
        String uf
    ){
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
    }
    public String toString(){
        return " \n"+ this.cep+ " \n" + this.logradouro +" \n" + this.numero +" \n" + this.complemento +" \n"+ this.cidade +"\n " + this.uf +" \n";
    }

    public boolean equals(Object myObject ) {
        if (this == myObject)return true;
        if (myObject == null || this.getClass() != myObject.getClass()) return false;
        Endereco endereco = (Endereco) myObject; 
        return Objects.equals(this.cep, endereco.cep);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cep);
    }
    
}
