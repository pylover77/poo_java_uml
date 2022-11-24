package Fichario;
import Modelo.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FicharioEndereco {
    Scanner entrada = new Scanner(System.in);

    public Endereco Cadastrar(){
        String cep, logradouro, numero, complemento, cidade, uf;
        System.out.println("digite cep:");
        cep = entrada.nextLine();
        System.out.println("digite logradouro:");
        logradouro = entrada.nextLine();
        System.out.println("digite numero:");
        numero = entrada.nextLine();
        System.out.println("digite complemento:");
        complemento  = entrada.nextLine();
        System.out.println("digite cidade:");
        cidade = entrada.nextLine();
        System.out.println("digite uf:");
        uf = entrada.nextLine();

        Endereco endereco = new Endereco(
            cep,
            logradouro,
            numero,
            complemento,
            cidade,
            uf
        );
        return endereco;
    }
}
