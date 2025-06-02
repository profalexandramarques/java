import javax.swing.*;

public class Tabuada{
    //Método principal que inicia a execução do aplicativo Java
    public static void main(String args[]){
        int numero = Integer.parseInt(JOptionPane.
                showInputDialog(null,"Digite o número"));
        System.out.println("Tabuada do "+numero);
        for(int i = 0;i<=10;i++){
           int r = i * numero;
           System.out.println(i+" X "+numero+" = "+r);
        }        
       
    }
}
