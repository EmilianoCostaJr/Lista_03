/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       :   HealthProfile
 * @author      :   Emiliano Costa
 * @date        :   4 de nov. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   3 Introdução a classes, objetos, métodos e strings
 * Seção        :   Exercício 3.17 (Computadorização dos registros de saúde)
 * ___________________________________________________________________________________________________________________
 * Descrição    :   (No final do arquivo)
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Exer_03_17;

import _Exer_03_14.Data;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class HealthProfile {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::ATRIBUTOS:::::::::*/    
    private String nome;
    private String sobrenome;
    private Data aniversario;/*Usando classe Data, exercicio 14*/
    private double altura;
    private double peso; 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::MÉTODOS:::::::::*/

    public HealthProfile(String nome, String sobrenome, Data aniversario, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.aniversario = aniversario;
        this.altura = altura;
        this.peso = peso;
    }
    
    /*..............................................................................................Get e Set.........*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Data getAniversario() {
        return aniversario;
    }

    public void setAniversario(Data aniversario) {
        this.aniversario = aniversario;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
/*....................................................................................................................*/
    
    public int calculaIdade(){
        return this.aniversario.idade();
    }
    
    public int freqCardiacaMaxima(){
        return (220 - aniversario.idade());
    }
    
    public double freqCardiacaAlvo(){
        return (double)((220 - aniversario.idade()) * 0.7);
    }

    public double calcula_IMC(){
        return (this.getPeso()/Math.pow(this.getAltura(), 2.00));
    }
    
    public String display_IMC(){
      double imc;
      String output = "";
      imc = this.calcula_IMC();
        if (imc < 18.5)
            output = "O IMC indica: Esta abaixo do peso: menos de 18,5";
        if(imc >= 18.5 && imc < 24.9)
            output = "O IMC indica: Esta normal: entre 18.5 e 24.5";
        if(imc >= 24.9 && imc < 30)    
            output = "O IMC indica: Esta acima do peso: entre 24.5 e 29.9";
        if(imc >=30)
            output = "O IMC indica: Esta obeso: acima de 30";
      return output;
    }
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM:::::::::*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/


/**(Computadorização dos registros de saúde).
Uma questão relacionada à assistência médica discutida ultimamente nos veículos de comunicação é a computadorização 
dos registros de saúde. Essa possibilidade está sendo abordada de maneira cautelosa por causa de preocupações quanto 
à privacidade e à segurança de dados sigilosos, entre outros motivos. [Iremos discutir essas preocupações em exercícios
posteriores.] A computadorização dos registros de saúde pode facilitar que pacientes compartilhem seus perfis e 
históricos de saúde entre vários profissionais de saúde. Isso talvez aprimore a qualidade da assistência médica, 
ajude a evitar conflitos e prescrições erradas de medicamentos, reduza custos em ambulatórios e salve vidas. 

Neste exercício, você projetará uma classe HealthProfile “inicial” para uma pessoa. 
Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento 
(consistindo em atributos separados para mês, dia e ano de nascimento), altura (em metros) e peso (em quilogramas) 
da pessoa. Sua classe deve ter um construtor que receba esses dados.

Para cada atributo, forneça métodos set e get. 

A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos, intervalo de frequência 
cardíaca máxima e frequência cardíaca alvo (veja o Exercício 3.16), além de índice de massa corporal (IMC; veja
o Exercício 2.33). 

Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para
ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e 
peso da pessoa ––, e então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e 
frequência cardíaca alvo. 

Ele também deve exibir o gráfico de valores IMC do Exercício 2.33.*/