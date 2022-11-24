package Fichario;
import Modelo.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FicharioCliente {
    Scanner entrada = new Scanner(System.in);
    public Cliente Cadastrar(){
        FicharioEndereco ficharioendereco = new FicharioEndereco();
        String cpf;
        String nome;
        String telefone;
        List <Endereco>  endereco = new ArrayList<>();
        System.out.println("digite cpf:");
        cpf = entrada.nextLine();
        System.out.println("digite nome:");
        nome = entrada.nextLine();
        System.out.println("digite telefone:");
        telefone = entrada.nextLine();
        int Option;

        do{
            endereco.add(ficharioendereco.Cadastrar());
            System.out.println("\n1.Adicionar mais um endereco. \n0. Sair");
            Option = entrada.nextInt();
        }while (Option != 0);
        
        
        

        Cliente cliente = new Cliente(
            cpf,
            nome,
            telefone,
            true,
            endereco
        );
        return cliente;

    }

    
}
