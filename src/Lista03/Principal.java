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

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class Principal {
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

    /**Procedimento principal que inicia e termina a aplicação*/
    public static void main(String[] args){
        drive();
    }/*FIM Método main()*/

    /**Procedimento drive: Piloto que conduz a execução do aplicativo*/
    public static void drive(){
        _Exer_03_11.AccountTest.inicio();
//        _Exer_03_11.AccountTest.inicioD();/*Versão caixa de dialogo*/
        _Exer_03_12.InvoiceTest.inicio();
//        _Exer_03_12.InvoiceTest.inicioD();/*Versão caixa de dialogo*/
        _Exer_03_13.EmpregadoTest.inicio();/*Exercicio 13*/
        _Exer_03_14.DateTest.inicio();/*Exercicio 14*/
        _Exer_03_15.AccountTest.inicio();
//        _Exer_03_15.AccountTest.inicioD();
        _Exer_03_16.Calculadora_Cardiaca.inicio();/*Exercicio 16*/
        _Exer_03_17.HealthProfileTest.inicio();
    }/*FIM Método drive()*/


}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Fim da classe Principal*/

