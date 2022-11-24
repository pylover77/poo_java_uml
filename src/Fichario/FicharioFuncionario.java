package Fichario;
import Modelo.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FicharioFuncionario {
    Scanner entrada = new Scanner(System.in);
    public Funcionario Cadastrar(){
        String nomedocargo;
        double salario;
        String cpf;
        String nome;
        String telefone;

        System.out.println("Nome do cargo:");
        nomedocargo = entrada.nextLine();
        System.out.println("digite cpf:");
        cpf = entrada.nextLine();
        System.out.println("digite salario:");
        salario = entrada.nextFloat();
        LimparBuffer(entrada);
        System.out.println("digite nome:");
        nome = entrada.nextLine();
        System.out.println("digite telefone:");
        telefone = entrada.nextLine();

        Cargo cargo = new Cargo(nomedocargo);
        Funcionario funcionario = new Funcionario(
            salario,
            cpf,
            nome,
            telefone,
            cargo
        );
        return funcionario;
    }

    private static void LimparBuffer(Scanner scanner){
        if(scanner.hasNextLine()){
            scanner.nextLine();
        }

    }
    
}
