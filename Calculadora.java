import java.util.Scanner;

public class Calculadora{
    //Método principal que inicia a execução do aplicativo Java
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a operação: +: Soma, -: Subtração, *: Multiplicação e /: Divisão  ");  
        String operacao = ler.next();               
        Double a, b, resultado;
        System.out.println("Digite o primeiro número: "); 
        a = ler.nextDouble();
        System.out.println("Digite o segundo número: "); 
        b = ler.nextDouble();
        switch(operacao) {
         case "+":
            resultado = a + b;
            System.out.println("A soma é "+resultado);
         break;
         case "-":
            resultado = a - b;
            System.out.println("A subtração é "+resultado);
         break;
         case "*":
            resultado = a * b;
            System.out.println("A multiplicação é "+resultado);
         break;
         case "/":
            if(b > 0){
               resultado = a / b;
            }else{
                resultado = 0.0;
            }
            System.out.println("A divisão é "+resultado);
         break;
         default:
          System.out.println("Operação inválida"); 
        }


    }
}