import javax.swing.*;

public class ValeTransporte{
    //Método principal que inicia a execução do aplicativo Java
    public static void main(String args[]){
        //Ler da tela a qtde de créditos comprar
        //Pedir para usuário se é estudante ou normal
        //Caso seja estudante o valor unitário é
        //3.75 e Caso contrário 5.45
        //Calcular o valor total
        //Mostrar o valor a pagar
        double vlrTotal = 0.0;
        int creditos = Integer.parseInteger(
          JOptionPane.
          showInputDialog(null,
          "Digite a qtde de créditos que deseja comprar?"));
        int tipo = Integer.parseInteger(
            JOptionPane.
            showInputDialog(null,
            "[1] Escolar - 3,75 e [2] Cidadão - 5,45"));
        if (tipo == 1){
            vlrTotal = creditos * 3.75;
        } else{
            vlrTotal = creditos * 5.45;
        }
        JOptionPane.
          showmessageDialog(null,
          "O valor a pagar é "+vlrtotal);    
       
    }
}