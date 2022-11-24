package Modelo;
import java.util.Objects;
public class Cargo {
    private String nome;

    public Cargo(){}
    public Cargo(
        String nome
    ){
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return this.nome +"";
    }

    public boolean equals(Object myObject ) {
        if (this == myObject)return true;
        if (myObject == null || this.getClass() != myObject.getClass()) return false;
        Cargo cargo = (Cargo) myObject; 
        return Objects.equals(this.nome, cargo.nome);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
