package Ex06;

import java.util.Scanner;

public class Ex06 
{

    public static void main (String[] args)
    {
        float peso, excesso, multa; 
        Scanner scan = new Scanner(System.in);

        System.out.println("Peso do peixe em kg: ");
        peso = scan.nextFloat();

        if(peso > 50){
            
            excesso = peso - 50;
            multa = excesso * 4;
            System.out.println("Você pagará R$" +multa);

        }
        else{
            System.out.println("O peso é " +peso);
        }
        scan.close();

    }

    
}

