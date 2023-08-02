import java.util.Scanner;

public class Exercicio06b {

    public static void main (String[] args)
    {
        int a = 0;
        int b = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número ");
        int n = scan.nextInt(); 

        if (n%2 == 0) {
            
            a = n; 
            System.out.println(a +" é par");
            
        } else {

            b = n;
            System.out.println(b +" é ímpar");
        }
        scan.close();
    }
    
}
