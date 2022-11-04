/* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : Invoice
 * @author      : Emiliano Costa
 * @date        : 3 de mar. de 2022
 * ....................................................................................................................
 * Bibliografia : Java como programar, Deitel, 8º edição 
 * Capitulo     : 3 Introdução a classe e objetos
 * Exercicio    : 3.13 Classe Invoice - (descrição no fim do arquivo)
  * ....................................................................................................................
 * Descrição    : Simula uma fatura de loja de informática
 * %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Exer_03_12;

public class Invoice{
/*Private:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private String numero;
    private String descrição;
    private int quantidade;
    private double preço;
/*Public::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    
    /*construtor*/
    public Invoice(String numero, String descrição, int quantidade, double preço){
        this.numero = numero;
        this.descrição = descrição;
        this.quantidade = quantidade;
        this.preço = preço;
    }

    /*GET*/
    
    public String getNumero(){
        return numero;
    }

    public String getDescrição(){
        return descrição;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getPreço(){
        return preço;
    }

    /*SET*/
    
    public void setNumero(String numero){
        this.numero = numero;
    }
  
    public void setDescrição(String descrição){
        this.descrição = descrição;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setPreço(double preço){
        this.preço = preço;
    }

    /*Outros métodos*/
    
    public double getinvoiceAmount(){
        if (this.getQuantidade() < 0)
            return 0.0;
        if (this.getPreço() < 0)
            return 0.0;
        
        return this.getPreço() * this.getQuantidade();
    }
  
}/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

/* Exercicio 3.13 (Classe Invoice) 
 * Crie unia classe chamada Invoice para que uma loja de suprimentos de informática possa utilizá-la para representar 
uma fatura de um item vendido na loja. 

 * Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância:
    o número (String),
    a descrição (String),
    a quantidade comprada de um item (int) 
    e o preço por item (double). 
 
 * Sua classe deve ter um construtor que inicializa as quatro variáveis de instância. 
     * Se a quantidade não for positiva, ela deve ser configurada como 0. 
     * Se o preço por item não for positivo, ele deve ser configurado como 0.0. 
 
 * Forneça um método set e um get para cada variável de instância. 
 
 * Além disso, forneça um método chamado [getinvoiceAmount] que calcula a quantidade de fatura (isto é, multiplica a 
quantidade pelo preço por item), e depois retorna a quantidade como um valor double. 

 * Escreva um aplicativo de teste chamado invoiceTest que demonstra as capacidades da classe Invoice.*/