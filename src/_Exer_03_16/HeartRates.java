/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   HeartRates
 * @author      :   Emiliano Costa
 * @date        :   28 de mar. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   3 Introdução a classes, objetos, métodos e strings
 * Seção        :
 * ___________________________________________________________________________________________________________________
 * Descrição    : 
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 


package _Exer_03_16;
import _Exer_03_14.Data;

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
public class HeartRates{
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private String nome;
    private String sobrenome;
    private Data nascimento;
/*............................................................................................Construtor..............*/

    public HeartRates(String nome, String sobrenome, Data nascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = nascimento;
    }

/*...........................................................................................Gets e Sets..............*/
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public Data getNascimento(){
        return nascimento;
    }

    public void setNascimento(Data nascimento)
    {
        this.nascimento = nascimento;
    }
/*........................................................................................Outros métodos..............*/
    
    public String displayMsg(){
        return String.format(
            "Nome : %s %s\nNiver: %s\nIdade: %s anos.", 
            this.nome, this.sobrenome, nascimento.displayDate(),nascimento.idade());
        
    }

    public int idade(){
        return nascimento.idade();
    }
    
    public int freqCardiacaMaxima(){
        return (220 - nascimento.idade());
    }
    
    public String freqCardiacaMaximaMsg(){
        return String.format("Frequencia cardiaca maxima: %d" , freqCardiacaMaxima());
    }
    
    public float freqCardiacaAlvo(){
        return (float)((220 - nascimento.idade()) * 0.7);
    }
    
    public String freqCardiacaAlvoMsg(){
        return String.format("Frequencia cardiaca alvo  : %.2f", freqCardiacaAlvo());
    }
    
}//Fim classe HeartRates
