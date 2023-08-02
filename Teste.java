import java.util.Scanner;

public class Teste 
{
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);    
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        teclado.close();
    }
}
