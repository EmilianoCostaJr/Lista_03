/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Principal
 * @author      :   Emiliano Costa
 * @date        :   4 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição                                                             
 * Capitulo     :   3 Introdução a classes, objetos, métodos e strings
 * ___________________________________________________________________________________________________________________
 * Descrição    :   TestDriver para execução dos exercícios
 *                                                                                                                    
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package Lista03;

import java.util.Scanner;

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class Principal {
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

    /**Procedimento principal que inicia e termina a aplicação*/
    public static void main(String[] args){
        seleciona();
    } /*FIM Método main()*/

    /**Procedimento drive: Piloto que conduz a execução do aplicativo*/
    public static void drive(int escolha){
        switch (escolha){
            case 11:        
                _Exer_03_11.AccountTest.inicio();
        //        _Exer_03_11.AccountTest.inicioD();/*Versão caixa de dialogo*/
                break;
            case 12:
                _Exer_03_12.InvoiceTest.inicio();
        //        _Exer_03_12.InvoiceTest.inicioD();/*Versão caixa de dialogo*/
                break;
            case 13:
                _Exer_03_13.EmpregadoTest.inicio();/*Exercicio 13*/
                break;
            case 14:
                _Exer_03_14.DateTest.inicio();/*Exercicio 14*/
                break;
            case 15:
                _Exer_03_15.AccountTest.inicio();
                //        _Exer_03_15.AccountTest.inicioD();
                break;
            case 16:
                _Exer_03_16.Calculadora_Cardiaca.inicio();/*Exercicio 16*/
                break;
            case 17:
                _Exer_03_17.HealthProfileTest.inicio();
                break;
            default: 
                System.out.println("Nenhum exercício escolhido, escolha novamente: ");
            }
            seleciona();                
    }/*FIM Método drive()*/

    public static void seleciona(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nMenu de Escolha.\n");
        System.out.println("Digite zero para sair.");
        System.out.print("Ou digite o número do exercício a ser executado: ");

        int selecionado = 0;
        try{
            selecionado = input.nextInt(); 
        }catch(Exception e){
            selecionado = 0; 
        }

        if(selecionado != 0)
            drive(selecionado);        
    }


}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Fim da classe Principal*/

