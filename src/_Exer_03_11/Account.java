/**********************************************************************************************************************
 * Classe       :   Account
 * @author      :   Emiliano Costa
 * @date        :   15 de out. de 2022
 * ___________________________________________________________________________________________________________________
 * Bibliografia :   Java como programar, Deitel, 10º edição
 * Capitulo     :   3.Introdução a classe, objetos, métodos e Strings
 * Figura 3.8   :   Seção 3.5 A classe Account com um saldo; números de ponto flutuante
 * ___________________________________________________________________________________________________________________
 * Descrição    :   (Classe Account modificada) 
                    Modifique a classe Account (Figura 3.8) para fornecer um método chamado withdraw que retira 
                    dinheiro de uma Account. Assegure que o valor de débito não exceda o saldo de Account. 
                    Se exceder, o saldo deve ser deixado inalterado e o método deve imprimir uma mensagem que indica 
                    "Withdrawal amount exceeded account balance" [Valor de débito excedeu o saldo da conta].
                    Modifique a classe AccountTest (Figura 3.9) para testar o método withdraw.
**********************************************************************************************************************/ 
/*::::::IMPORTS:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
package _Exer_03_11;


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

    /**Exercicio 3.11.
    Procedimento retira dinheiro de uma Account
    Modifiquei o tipo de return, no original é pedido void, aqui fiz String, desse modo o método fica mais genérico e 
    pode ser aproveitado tanto para console como com caixa de dialogo*/
    public String withdraw(double debito){
        String sMensagem = "Débito realizado com sucesso";
        if(this.saldo >= debito)
            this.saldo = this.saldo - debito;
        if(this.saldo < debito)
            sMensagem = "Valor de débito excedeu o saldo da conta";
        return sMensagem;
    }

    
}/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::FIM*/
/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/