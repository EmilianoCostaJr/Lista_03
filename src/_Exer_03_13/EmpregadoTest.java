/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   EmpregadoTest
 * @author      :   Emiliano Costa
 * @date        :   3 de mar. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   3 Introdução a classes, objetos, métodos e strings
 * Exercicio    :   3.13 (Classe Employee)
 * ___________________________________________________________________________________________________________________
 * Descrição    :   TestDriver para classe Empregado
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Exer_03_13;

import java.util.Scanner;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class EmpregadoTest {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
    
    /**TestDriver do exercicio 13*/
    public static void inicio(){

        Scanner input = new Scanner(System.in);
        Empregado empregado1 = new Empregado("Marcos","Bueno", 12.32);
        Empregado empregado2 = new Empregado("Lucas","Orleans", 15.21);
        
        System.out.printf(
                "Nome %s %s, Salario %.2f\n",empregado1.getNome(),empregado1.getSobrenome(),empregado1.getSalario());
        System.out.printf(
                "Nome %s %s, Salario %.2f\n",empregado2.getNome(),empregado2.getSobrenome(),empregado2.getSalario());
        
        empregado1.setSalario(input.nextDouble());
        empregado2.setSalario(input.nextDouble());

        System.out.printf(
                "Nome %s %s, Salario %.2f\n",empregado1.getNome(),empregado1.getSobrenome(),empregado1.getSalario());
        System.out.printf(
                "Nome %s %s, Salario %.2f\n",empregado2.getNome(),empregado2.getSobrenome(),empregado2.getSalario());    
    }


/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM MÉTODOS*/
}/*Fim da classe EmpregadoTest*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/