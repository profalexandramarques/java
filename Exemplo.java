import java.util.Scanner;


public class Exemplo{
    //Método principal que inicia a execução do aplicativo Java
    public static void main(String args[]){

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome ");  
        String nome = ler.next();//"Abner";
        
        System.out.println("Olá Mundo!");  
        System.out.println("Boa Tarde "+nome+"!");  
    }
}
