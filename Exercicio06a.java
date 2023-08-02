import java.util.Scanner;

public class Exercicio06a {
    
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor");
        int n = scanner.nextInt();
        
        if(n < 100 && n >= 0){
            System.out.println("O valor informado é " + n);

        }
        else{
            System.out.println("0");
        }

        scanner.close();
    } 
    
}
