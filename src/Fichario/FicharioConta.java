package Fichario;
import Modelo.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FicharioConta {
    Scanner entrada = new Scanner(System.in);
    
    public Conta Cadastrar(){
        FicharioCliente fichariocliente = new FicharioCliente();

        System.out.println("digite numero:");
        String numero = entrada.nextLine();
        LimparBuffer(entrada);
        System.out.println("digite cliente:");
        Cliente cliente = fichariocliente.Cadastrar();
        System.out.println("digite credito:");
        Credito credito = new Credito(entrada.nextDouble());
        LimparBuffer(entrada);
        System.out.println("digite debito:");
        Debito debito = new Debito(entrada.nextDouble());
        LimparBuffer(entrada);
        
        Conta conta = new Conta(
            numero,
            cliente,
            credito,
            debito
        );
        return conta;
    }
    private static void LimparBuffer(Scanner scanner){
        if(scanner.hasNextLine()){
            scanner.nextLine();
        }
    }


}
