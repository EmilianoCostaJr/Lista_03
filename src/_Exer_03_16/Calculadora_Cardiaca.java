/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Calculadora_Cardiaca
 * @author      :   Emiliano Costa
 * @date        :   28 de mar. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   3 Introdução a classes, objetos, métodos e strings
 * Seção        :   Exercício 3.16 (Calculadora de frequência cardíaca alvo)
 * ___________________________________________________________________________________________________________________
 * Descrição    :   (No final do arquivo)
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Exer_03_16;

import _Exer_03_14.Data;


/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Calculadora_Cardiaca{
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
    
    public static void inicio() {
        Data niver = new Data(5,11,1972);
//        HeartRates pessoa1 = new HeartRates("Emiliano", "Costa", new Data(5,11,1972));
        HeartRates pessoa1 = new HeartRates("Emiliano", "Costa", niver);
        System.out.println(pessoa1.displayMsg());
//        javax.swing.JOptionPane.showInternalMessageDialog(null, pessoa1.displayMsg());
        System.out.println(pessoa1.freqCardiacaMaximaMsg());
//        javax.swing.JOptionPane.showInternalMessageDialog(null, pessoa1.freqCardiacaMaximaMsg());
        System.out.println(pessoa1.freqCardiacaAlvoMsg());
//        javax.swing.JOptionPane.showInternalMessageDialog(null, pessoa1.freqCardiacaAlvoMsg());
    }
    
    
}//Fim classe Calculadora_Cardiaca
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/



/**Calculadora de frequência cardíaca alvo. 
Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver se sua frequência permanece 
dentro de um intervalo seguro sugerido pelos seus treinadores e médicos. 
Segundo a American Heart Associa-tion (AHA), a fórmula para calcular a frequência cardíaca máxima por minuto é 220 menos
a idade em anos. 
Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima. 
[Observação: essas fórmulas são estimativas fornecidas pela AHA. 
As frequências cardíacas máximas e alvo podem variar com base na saúde, capacidade física e sexo da pessoa. 
Sempre consulte um médico ou profissional de saúde qualificado antes de começar ou modificar um programa de 
exercícios físicos.] 

Crie uma classe chamada HeartRates. 
Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da pessoa 
(consistindo em atributos separados para mês, dia e ano de nascimento). 
Sua classe deve ter um construtor que receba esses dados como parâmetros. 
Para cada atributo forneça métodos set e get. 

A classe também deve incluir 
um método que calcule e retorne a idade (em anos), 
um que calcule e retome a frequência cardíaca máxima e 
um que calcule e retome a frequência cardíaca alvo da pessoa. 

Escreva um aplicativo Java que solicite as informações da pessoa, 
instancie um objeto da classe HeartRates e 
imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — 
calcule e imprima a idade da pessoa (em anos), 
seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.
*/