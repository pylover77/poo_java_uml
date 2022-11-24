package Fichario;
import Modelo.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FicharioCC {
    Scanner entrada = new Scanner(System.in);
    public ContaCorrente Cadastrar(){
        FicharioCliente fichariocliente = new FicharioCliente();
        
        System.out.println("digite limite:");
        double limite = entrada.nextDouble();
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
        ContaCorrente contacorrente = new ContaCorrente(
            limite,
            numero,
            cliente,
            credito,
            debito
        );
        return contacorrente;
    }
    private static void LimparBuffer(Scanner scanner){
        if(scanner.hasNextLine()){
            scanner.nextLine();
        }
    }
    
}
