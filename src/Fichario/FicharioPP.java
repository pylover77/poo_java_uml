package Fichario;
import Modelo.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FicharioPP {
    Scanner entrada = new Scanner(System.in);
    public ContaPoupanca Cadastrar(){
        FicharioCliente fichariocliente = new FicharioCliente();
        
        LimparBuffer(entrada);
        System.out.println("digite numero:");
        String numero = entrada.nextLine();
        System.out.println("digite credito:");
        Credito credito = new Credito(entrada.nextDouble());
        LimparBuffer(entrada);
        System.out.println("digite debito:");
        Debito debito = new Debito(entrada.nextDouble());
        LimparBuffer(entrada);
        Cliente cliente = fichariocliente.Cadastrar();
        ContaPoupanca contapoupanca = new ContaPoupanca(
            numero,
            cliente,
            credito,
            debito
        );
        return contapoupanca;
    }
    private static void LimparBuffer(Scanner scanner){
        if(scanner.hasNextLine()){
            scanner.nextLine();
        }
    }
    
}
