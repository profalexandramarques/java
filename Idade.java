import java.util.Scanner;

public class Idade{
    //Método principal que inicia a execução do aplicativo Java
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome ");  
        String nome = ler.next();//"Abner";       
        int anoAtual, anoNasc, idade;
        System.out.println("Digite o ano atual: "); 
        anoAtual = ler.nextInt();
        System.out.println("Digite o ano de nascimento: "); 
        anoNasc = ler.nextInt();
        //Cálculo da idade
        idade = anoAtual - anoNasc;
        System.out.println("Sua idade é "+idade);
        if(idade >= 18){
          System.out.println("Pode ter CNH!");  
        } else{
          System.out.println("Não pode dirigir!");   
        }
    }
}