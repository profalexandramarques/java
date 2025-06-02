import javax.swing.*;

public class AreaTriangulo{
    //Método principal que inicia a execução do aplicativo Java
    public static void main(String args[]){
        //Leia da tela base e altura
        double base = Double.parseDouble(
          JOptionPane.
          showInputDialog(null,"Digite a base: "));
        double altura = Double.parseDouble(
          JOptionPane.
          showInputDialog(null,"Digite a altura: "));
        double area = (base*altura)/2
        JOptionPane.
          showmessageDialog(null,area);
    }
}