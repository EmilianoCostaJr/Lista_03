/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   Empregado
 * @author      :   Emiliano Costa
 * @date        :   3 de mar. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   3 Introdução a classes, objetos, métodos e strings
 * Exercicio    :   3.13 (Classe Employee) - (descrição do exercício no fim do arquivo)
 * ___________________________________________________________________________________________________________________
 * Descrição    :   Ficha com informações de empregado de uma empresa
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Exer_03_13;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Empregado{
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/*Private:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private String nome;
    private String sobrenome;
    private double salario;
/*Public::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    
    /*Construtor*/
    public Empregado(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    //GET-----------------------------------------------------------    
    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public double getSalario(){
        return salario;
    }
    
    //SET--------------------------------------------------------------
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setSalario(double dSalario){
        if(dSalario <= 0)
            this.salario = 0;
        if(dSalario > 0)
            this.salario = dSalario;
    }
    
}/*Fim classe Empregado:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/


/** Exercicio 3.14 (Testa Classe Employee). 
 * Escreva um aplicativo de teste chamado EmployeeTest que demonstra as capacidades da classe Employee. 
 * Crie dois objetos Employee e exiba o salário anual de cada objeto. 
 * Entào de a cada Employee um aumento de 10% e exiba novamente o salário anual de cada Employee.
*/