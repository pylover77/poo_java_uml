package Modelo;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
public class Cliente extends Pessoa implements IUsuario{
    private List <Endereco> endereco = new ArrayList<>();
    private boolean vip;
    public Cliente(){}
    public Cliente(
        String cpf, 
        String nome, 
        String telefone, 
        boolean vip,
        List <Endereco> endereco 
        ){
            this.cpf = cpf;
            this.nome = nome;
            this.telefone = telefone;
            this.vip = vip;
            this.endereco = endereco;
        }
    public void listarEnderecos(){
        for (Endereco endereco: this.endereco) {
            System.out.println(endereco);
        }

    }

    public boolean autenticar(){
        return true;
    }

    public boolean getVip(){
        return this.vip;
    }
    public void setVip(boolean vip){
        this.vip = vip;
    }

    public List <Endereco> getEndereco(){
        return this.endereco;
    }
    public void setEndereco(List <Endereco> endereco){
        this.endereco = endereco;
    }
    


    public String toString(){
        return  "Seu nome:"+ this.nome +" \n" + "Seu telefone:"  + this.telefone +" \n" + "Seu cpf:" + this.cpf + " \n" + "Seu endereço --> \n" + this.endereco+ " \n" + "Seu VIP:" + this.vip +" \n";
    }
    public boolean equals(Object myObject ) {
        if (this == myObject)return true;
        if (myObject == null || this.getClass() != myObject.getClass()) return false;
        Cliente cliente = (Cliente) myObject; 
        return Objects.equals(this.cpf, cliente.cpf);
    }
    public int hashCode(){
        return Objects.hash(cpf);
    }
    
}
