/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * ClasseDriver : InvoiceTest                                                                                         *
 * @author      : Emiliano Costa                                                                                      *
 * @date        : 15 de out. de 2022                                                                                  * 
 * ___________________________________________________________________________________________________________________*
 * Bibliografia : Java como programar, Deitel, 10º edição                                                             *
 * Capitulo     : 3 Introdução a classe e objetos                                                                     *    
 * Exercício    :                                                                                                     *
 * ___________________________________________________________________________________________________________________*
 * Descrição    : Teste Driver para a classe Invoice                                                                  * 
  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 
package _Exer_03_12;

public class InvoiceTest {
    /**TestDriver do exercicio 13*/
    public static void inicio(){

        Invoice item1 = new Invoice("1","mouse",1,3.60);
        Invoice item2 = new Invoice("2","fone",2,4.50);
        Invoice item3 = new Invoice("3","cabo",-3,2.40);
        Invoice item4 = new Invoice("4","teclado",5,1.10);
        Invoice item5 = new Invoice("5","hub",7,-5.30);
        Invoice item6 = new Invoice("6","tela",11,6.20);
        
        System.out.println("Item | descrição | quantidade | preço | total item");

        System.out.printf(
                "%5s|%11s|%11d |%5.2f  | %.2f\n", 
                item1.getNumero(),item1.getDescrição(),item1.getQuantidade(),item1.getPreço(),item1.getinvoiceAmount());
        System.out.printf(
                "%5s|%11s|%11d |%5.2f  | %.2f\n", 
                item2.getNumero(),item2.getDescrição(),item2.getQuantidade(),item2.getPreço(),item2.getinvoiceAmount());
        System.out.printf(
                "%5s|%11s|%11d |%5.2f  | %.2f\n", 
                item3.getNumero(),item3.getDescrição(),item3.getQuantidade(),item3.getPreço(),item3.getinvoiceAmount());
        System.out.printf(
                "%5s|%11s|%11d |%5.2f  | %.2f\n", 
                item4.getNumero(),item4.getDescrição(),item4.getQuantidade(),item4.getPreço(),item4.getinvoiceAmount());
        System.out.printf(
                "%5s|%11s|%11d |%5.2f  | %.2f\n", 
                item5.getNumero(),item5.getDescrição(),item5.getQuantidade(),item5.getPreço(),item5.getinvoiceAmount());
        System.out.printf(
                "%5s|%11s|%11d |%5.2f  | %.2f\n", 
                item6.getNumero(),item6.getDescrição(),item6.getQuantidade(),item6.getPreço(),item6.getinvoiceAmount());
    }
    public static void inicioD(){
        String msg,msg1,msg2,msg3,msg4,msg5,msg6;
        Invoice item1 = new Invoice("1","mouse",1,3.60);
        Invoice item2 = new Invoice("2","fone",2,4.50);
        Invoice item3 = new Invoice("3","cabo",-3,2.40);
        Invoice item4 = new Invoice("4","teclado",5,1.10);
        Invoice item5 = new Invoice("5","hub",7,-5.30);
        Invoice item6 = new Invoice("6","tela",11,6.20);
    /*Inicio..........................................................................................................*/    
        msg = "Item | descrição | quantidade | preço | total item\n";
        msg1 = String.format("%5s|%11s|%11d |%5.2f  | %.2f\n", 
                item1.getNumero(),item1.getDescrição(),item1.getQuantidade(),item1.getPreço(),item1.getinvoiceAmount());
        msg2 = String.format("%5s|%11s|%11d |%5.2f  | %.2f\n", 
                item2.getNumero(),item2.getDescrição(),item2.getQuantidade(),item2.getPreço(),item2.getinvoiceAmount());
        msg3 = String.format("%5s|%11s|%11d |%5.2f  | %.2f\n", 
                item3.getNumero(),item3.getDescrição(),item3.getQuantidade(),item3.getPreço(),item3.getinvoiceAmount());
        msg4 = String.format("%5s|%11s|%11d |%5.2f  | %.2f\n", 
                item4.getNumero(),item4.getDescrição(),item4.getQuantidade(),item4.getPreço(),item4.getinvoiceAmount());
        msg5 = String.format("%5s|%11s|%11d |%5.2f  | %.2f\n", 
                item5.getNumero(),item5.getDescrição(),item5.getQuantidade(),item5.getPreço(),item5.getinvoiceAmount());
        msg6 = String.format("%5s|%11s|%11d |%5.2f  | %.2f\n", 
                item6.getNumero(),item6.getDescrição(),item6.getQuantidade(),item6.getPreço(),item6.getinvoiceAmount());
        msg = String.format("%s%s%s%s%s%s%s", msg,msg1,msg2,msg3,msg4,msg5,msg6);
        javax.swing.JOptionPane.showInternalMessageDialog(null, msg);
    }
 
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM MÉTODOS*/
}/*Fim da classe InvoiceTest*/