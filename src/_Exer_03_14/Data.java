/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : Date
 * @author      : Emiliano Costa
 * @date        : 28 de mar. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia : Java como programar, Deitel, 10º edição
 * Capitulo     : 3.Introdução a classe, objetos, métodos e Strings
 * Exercicio    : 3.14 (Classe Date) - (descrição do exercício no fim do arquivo)
 * Descrição    : Classe simula uma data DD:MM:AA
 * Modificação  : Inclusão do método idade. (Exercicio 3.16)
 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Exer_03_14;

import java.util.Calendar;

public class Data{
/*Private:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private int dia;
    private int mes;
    private int ano;
/*Public::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
/*.................................................................................................Construtor.........*/
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
/*................................................................................................Gets e Sets.........*/
    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
           
    /*.........................................................................................Outros Métodos.........*/
   
    public String displayDate(){
        return String.format("%d / %d / %d", dia,mes,ano);
    }
    
    /**Função idade.
    @return a idade em anos*/
    public int idade(){/*Origem: Deitel exercicio 3.16*/
        
        /*Obtém a data de hoje*/    
        Calendar myData = Calendar.getInstance();
        
        /*Calcula a idade em anos*/
        int iIdade = myData.get(Calendar.YEAR) - this.ano;
        
        /*Corrige a idade, verificando:
            se o dia do ano em que estamos hoje é antes ou depois que a data de aniversário*/
        boolean bA = (myData.get(Calendar.MONTH)+1)<this.mes; /*Mês atual é menor que mês de aniversário?*/
        boolean bB = (myData.get(Calendar.MONTH)+1)==this.mes; /*Mês atual e mês de aniversário são iguais?*/
        boolean bC = (myData.get(Calendar.DAY_OF_MONTH)) < this.dia;/*Dia do mês é menor que dia do aniversário?*/
        if(bA || (bB && bC)){
            iIdade--; /*Desconta um ano da idade*/
        }        
        return iIdade;
    }
    
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

/**Exercicio: 3.14 (Classe Date). 
 * Crie unia classe chamada Date que inclua três variáveis de instância mês (tipo int), dia (tipo int) e ano (tipo int).
 * Forneça um construtor que inicializa as três variáveis de instância e suponha que os valores fornecidos estejam corretos.
 * Forneça um método set e um get para cada variável de instância. 
 * Forneça um método displayDate que exibe o mês, o dia e o ano separados por barras normais (/). 
 * Escreva um aplicativo de teste chamado DateTest que demonstra as capacidades da classe Date.
 * */