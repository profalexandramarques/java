import java.util.Scanner;

public class DiaSemana{
    //Método principal que inicia a execução do aplicativo Java
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o dia da semana: "); 
        int diaSemana ler.nextInt();
        switch (diaSemana){
            case 1: 
            System.out.println("Domingo");
            break;
            case 2: 
            System.out.println("Segunda-Feira");
            break;
            default:
            System.out.println("Dia inválido");
        }
    }
}