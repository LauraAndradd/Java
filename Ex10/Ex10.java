package Ex10;
import java.util.Scanner;

public class Ex10 {
    
    public static void main(String [] args){

        int valor, maior = -999, menor = 999, soma = 0;
        float media;        
        Scanner teclado = new Scanner(System.in);
        
        for(int i=0; i<10; i++)
        {
            System.out.println("Informe um valor: ");
            valor = teclado.nextInt();

            if(valor > 0)
            { 
                if(valor > maior)
                {
                    maior = valor;
                }
                if(valor < menor)
                {
                    menor = valor;
                }
                soma = soma + valor;
            }
            else
            {
                i--;
            }       
        }

        teclado.close();

        media = soma / 10;

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
        System.out.println("A média é " + media);

    }
}
