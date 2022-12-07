package Ex01;
import java.util.Scanner;

public class Ex01 
{
    public static void main (String[] args)
    {
        //Variáveis
        int num1, num2, soma, multiplicacao; 
        Scanner teclado = new Scanner(System.in);        
        //Entradas
        System.out.println("Informe o primeiro número: ");
        num1 = teclado.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = teclado.nextInt();

        //Processamento
        soma = num1 + num2;
        multiplicacao = soma * num1;

        //Saída
        System.out.println("O resultado da soma é " + soma);
        System.out.println("O resultado da multiplicação é " + multiplicacao);

        teclado.close();
    }
}