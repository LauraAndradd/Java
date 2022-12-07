package Ex05;

import java.util.Scanner;

public class Ex05 {
    
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        float pesoIdeal, altura;
        char sexo;

        System.out.println("Informe a altura: ");
        altura = scan.nextFloat();

        System.out.println("Informe o sexo (f/m): ");
        sexo = scan.next().charAt(0);

        if (sexo == 'f') 
        {
            pesoIdeal = (float)((62.1 * altura) - 44.7);
            System.out.println("O seu peso ideal é " +pesoIdeal+ " Kg.");
        }
        if (sexo == 'm')
        {
            pesoIdeal = (float)((62.1 * altura) - 44.7);
            System.out.println("O seu peso ideal é " +pesoIdeal+ " Kg.");
        }
            
        else {

            System.out.println("Acho que você digitou errado. Tente escrever no sexo apenas f ou m em letras minúsculas.");
            
        }
            scan.close();
    }

}
