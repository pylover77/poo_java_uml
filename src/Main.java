import Modelo.*;
import java.util.List;
import Fichario.*;
import java.util.ArrayList;

public class Main{
    public static void main(String []args){
        //Aplicação 1 
        FicharioFuncionario ficharioFuncionario = new FicharioFuncionario();
        Funcionario funcionario = ficharioFuncionario.Cadastrar();
        System.out.println(funcionario);
        //* */

        //Aplicação 2 
        FicharioCliente ficharioCliente = new FicharioCliente();
        Cliente cliente = ficharioCliente.Cadastrar();
        System.out.println(cliente.getEndereco());
        //* */

        //Aplicação 3 
        FicharioCC fichariocc = new FicharioCC();
        ContaCorrente contacorrente = fichariocc.Cadastrar();
        contacorrente.depositar(100);
        contacorrente.depositar(100);
        contacorrente.depositar(100);
        System.out.println("Voce depositou:" + contacorrente.getCredito());
        System.out.println("SEU SALDO --> " + contacorrente.calcularSaldo());
        contacorrente.sacar(50);
        System.out.println("SACOU:" + contacorrente.getDebito().getValor() );
        System.out.println("SEU SALDO --> "+contacorrente.calcularSaldo());

        //Aplicação 4
        contacorrente.depositar(1000);
        FicharioPP fichariopp  = new FicharioPP();
        ContaPoupanca contapoupanca = fichariopp.Cadastrar();
        contacorrente.transferir(contapoupanca , 1000.00);
        System.out.println("transferiu: "+ contapoupanca.getCredito());
        contacorrente.transferir(contapoupanca , 500.00);
        System.out.println("transferiu: "+ contapoupanca.getCredito());
        System.out.println("SEU SALDO --> "+ contapoupanca.calcularSaldo());
        
    }
    
    
}