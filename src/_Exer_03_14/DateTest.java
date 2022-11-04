/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : DateTest
 * @author      : Emiliano Costa
 * @date        : 15 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia : Java como programar, Deitel, 10º edição
 * Capitulo     : 3.Introdução a classe, objetos, métodos e Strings
 * Exercicio    : 3.14 (Classe Date)
 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Exer_03_14;

public class DateTest {

    /**TestDriver do exercicio 15*/
    public static void inicio(){
        testaMinhaClasseData();
    }

    public static void testaMinhaClasseData(){
        Data dia = new Data(05,11,1972);
        System.out.println(dia.displayDate());
        System.out.println("Idade = " + dia.idade());
    }
    

    
/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM MÉTODOS*/
}/*Fim da classe DateTest*/