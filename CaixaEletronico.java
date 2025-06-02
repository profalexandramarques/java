import javax.swing.*;

public class CaixaEletronico{
    //Deposito na conta
    public static double depositar(double saldo, 
                             double valor){
       return saldo = saldo + valor; 
    }
    //Saque da conta
    public static double sacar(double saldo, 
                       double valor){
      if ((saldo - valor) >=0){
        saldo = saldo - valor;  
      }
      else{
        JOptionPane.showMessageDialog(null,
                    "Saldo insuficiente!");
      }
      return saldo;
    }
    //Método principal que inicia a execução do aplicativo Java
    public static void main(String args[]){
       //Dados do cliente
       //nome,  senha, 
       //operação: 1 - depositar ou 2 - sacar
       //ou 3 - Mostrar o saldo
       double saldo = 500;
       //Chama a função
       saldo = depositar(saldo, valor);

    }
}