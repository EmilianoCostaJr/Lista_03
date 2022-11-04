/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   HealthProfileTest
 * @author      :   Emiliano Costa
 * @date        :   4 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   3 Introdução a classes, objetos, métodos e strings
 * Seção        :   Exercício 3.17 (Computadorização dos registros de saúde)
 * ___________________________________________________________________________________________________________________
 * Descrição    :   Testa a classe HealthProfile
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Exer_03_17;

import _Exer_03_14.Data;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class HealthProfileTest {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::ATRIBUTOS:::::::::*/    

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::MÉTODOS:::::::::*/
    
    public static void inicio(){
        Data niver = new Data(05,11,1972);
        HealthProfile obj = new HealthProfile("Sam", "Ramiro",niver,1.71,81.2);
        System.out.println("Nome            : " + obj.getNome() + " " + obj.getSobrenome());
        System.out.println("Idade           : " + obj.calculaIdade());
        System.out.println("Altura          : " + obj.getAltura());
        System.out.println("Peso            : " + obj.getPeso());
        System.out.println("Freq. Card. max : " + obj.freqCardiacaMaxima());
        System.out.println("Freq. Card. Alvo: " + obj.freqCardiacaAlvo());
        System.out.println("IMC             : " + obj.display_IMC());
        
        
    }
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

