/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : AccountTest
 * @author      : Emiliano Costa
 * @date        : 15 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia : Java como programar, Deitel, 10º edição
 * Capitulo     : 3.Introdução a classe, objetos, métodos e Strings
 * Exercicio    : 15 (Removendo código duplicado no método main)
 * ___________________________________________________________________________________________________________________
 * Descrição    : 
 * ___________________________________________________________________________________________________________________
 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Exer_03_15;
import javax.swing.JOptionPane;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class AccountTest {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
   
  
    /**Este seria o método main*/
    public static void inicio(){ 
    /*Declarações*/
        java.util.Scanner input = new java.util.Scanner(System.in);
        Account myAccount1 = new Account("Jane Green", 50.00);
        Account myAccount2 = new Account("John Blue", -7.53);
        String sMensagem;
    /*Inicio..........................................................................................................*/    
        /*Exibe saldo inicial*/
        System.out.printf("%s", displayAccount(myAccount1.getNomeCliente(),myAccount1.getSaldo()));
        System.out.printf("%s", displayAccount(myAccount2.getNomeCliente(),myAccount2.getSaldo()));
        /*Efetua os depósitos*/
        System.out.printf("Digite o valor de deposito para conta %s\n",myAccount1.getNomeCliente());
        myAccount1.deposit(input.nextDouble());
        System.out.printf("Digite o valor de deposito para conta %s\n",myAccount2.getNomeCliente());
        myAccount2.deposit(input.nextDouble());
        /*Exibe saldo*/
        System.out.printf("%s", displayAccount(myAccount1.getNomeCliente(),myAccount1.getSaldo()));
        System.out.printf("%s", displayAccount(myAccount2.getNomeCliente(),myAccount2.getSaldo()));
        /*Efetua os saques*/
        System.out.printf("Digite o valor do saque para conta %s\n",myAccount1.getNomeCliente());
        sMensagem = myAccount1.withdraw(input.nextDouble());
        System.out.println(sMensagem);
        System.out.printf("Digite o valor do saque para conta %s\n",myAccount2.getNomeCliente());
        sMensagem = myAccount2.withdraw(input.nextDouble());
        System.out.println(sMensagem);
        /*Exibe saldo final*/
        System.out.printf("%s", displayAccount(myAccount1.getNomeCliente(),myAccount1.getSaldo()));
        System.out.printf("%s", displayAccount(myAccount2.getNomeCliente(),myAccount2.getSaldo()));
    }

    public static void inicioD(){
    /*Declarações*/
        Account myAccount1 = new Account("Jane Green", 50.00);
        Account myAccount2 = new Account("John Blue", -7.53);
        String sMensagem;
    /*Inicio..........................................................................................................*/    
        /*Exibe saldo inicial*/
        JOptionPane.showMessageDialog(null,displayAccount(myAccount1.getNomeCliente(),myAccount1.getSaldo()));
        JOptionPane.showMessageDialog(null,displayAccount(myAccount2.getNomeCliente(),myAccount2.getSaldo()));
        /*Efetua os depósitos*/
        myAccount1.deposit(
                Double.parseDouble(
                        JOptionPane.showInputDialog(null,
                                String.format("Digite o valor de deposito para conta %s\n", 
                                        myAccount1.getNomeCliente()))));
        myAccount2.deposit(
                Double.parseDouble(
                        JOptionPane.showInputDialog(null,
                                String.format("Digite o valor de deposito para conta %s\n",
                                        myAccount2.getNomeCliente()))));
        /*Exibe saldo*/
        JOptionPane.showMessageDialog(null,displayAccount(myAccount1.getNomeCliente(),myAccount1.getSaldo()));
        JOptionPane.showMessageDialog(null,displayAccount(myAccount2.getNomeCliente(),myAccount2.getSaldo()));
        /*Efetua os saques*/
        sMensagem = myAccount1.withdraw(
            Double.parseDouble(
                JOptionPane.showInputDialog(
                    null, 
                    String.format(
                        "Digite o valor de saque para conta %s\n", 
                        myAccount1.getNomeCliente()))));
        JOptionPane.showMessageDialog(null,sMensagem);
        sMensagem = myAccount2.withdraw(
            Double.parseDouble(
                JOptionPane.showInputDialog(
                    null, 
                    String.format(
                        "Digite o valor de saque para conta %s\n", 
                        myAccount2.getNomeCliente()))));
        JOptionPane.showMessageDialog(null,sMensagem);
        /*Exibe saldo*/
        JOptionPane.showMessageDialog(null,displayAccount(myAccount1.getNomeCliente(),myAccount1.getSaldo()));
        JOptionPane.showMessageDialog(null,displayAccount(myAccount2.getNomeCliente(),myAccount2.getSaldo()));
    }
            
    private static String displayAccount(String cliente, double saldo){
       return String.format("saldo da conta %s = %.2f\n",cliente,saldo);
    }
    
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM MÉTODOS*/
}/*Fim da classe AccountTest*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
