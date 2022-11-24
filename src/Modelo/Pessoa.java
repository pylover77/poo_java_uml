package Modelo;

public abstract class Pessoa{
    protected String cpf;
    protected String nome;
    protected String telefone;
    
    public Pessoa(){}

    public Pessoa (String cpf, String nome, String telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}