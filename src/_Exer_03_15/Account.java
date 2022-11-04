/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 * Classe       : Account
 * @author      : Emiliano Costa
 * @date        : 15 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia : Java como programar, Deitel, 10º edição
 * Capitulo     : 3.Introdução a classe, objetos, métodos e Strings
 * Exercicio    : 15 (Removendo código duplicado no método main)
 * ___________________________________________________________________________________________________________________
 * Descrição    : 
 * ___________________________________________________________________________________________________________________
 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/ 

package _Exer_03_15;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
public class Account {
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/*::::::ATRIBUTOS::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/    
    private String nomeCliente; /*Origem Figura 3.1*/
    private double saldo; /*Origem Figura 3.8*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/*::::::MÉTODOS::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::Construtores.......*/

    /**Construtor que inizializa apenas o nome do cliente*/
    public Account(String name) {/*Origem Figura 3.5*/
        this.nomeCliente = name;
    }
    
    /**Construtor que inizializa o nome do cliente e o saldo se esse conter um valor válido*/
    public Account(String name, double saldo) {/*Origem Figura 3.8*/
        this.nomeCliente = name;
        if(saldo > 0.0)
            this.saldo = saldo;
    }

/*.................................................................................................Gets e Sets........*/

    /**Procedimento para definir o nome do cliente*/
    public void setNomeCliente(String nomeCliente) {/*Origem Figura 3.1*/
        this.nomeCliente = nomeCliente;
    }

    /**Função para obter o nome do cliente*/
    public String getNomeCliente() {/*Origem Figura 3.1*/
        return nomeCliente;
    }
   
    /**Função retorna o saldo da conta
     * @return saldo da conta*/
    public double getSaldo() {/*Origem Figura 3.8*/
        return saldo;
    }

/*.................................................................................................Outros Métodos.....*/

    /**Procedimento que deposita (adiciona) apenas uma quantia válida no saldo*/
    public void deposit(double depositAmount){/*Origem Figura 3.8*/
        if(depositAmount > 0.0)
            this.saldo = this.saldo + depositAmount;
    }

    /**Procedimento retira dinheiro de uma Account*/
    public String withdraw(double debito){/*Origem Exercicio 3.11*/
        String sMensagem = "Débito realizado com sucesso";
        if(this.saldo < debito)
            sMensagem = "Valor de débito excedeu o saldo da conta";
        if(this.saldo >= debito)
            this.saldo = this.saldo - debito;
        return sMensagem;
    }

    
  
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/

