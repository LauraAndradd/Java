package Ex11;

import java.util.Scanner;

public class Ex11 {
    public static void main(String [] args)
    {
        String senha, nome;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        nome = teclado.next();

        System.out.println("Informe a senha: ");
        senha = teclado.next();

        while(nome.equals(senha)){
            System.out.println("A senha não pode ser igual ao nome");

            System.out.println("Informe o nome: ");
            nome = teclado.next();

            System.out.println("Informe a senha: ");
            senha = teclado.next();

        }
        teclado.close();


    }
}
