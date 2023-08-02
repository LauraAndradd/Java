import java.io.IOException;
import java.util.Scanner;
 
public class Salario {
 
    public static void main(String[] args) throws IOException {
        
        int funcionario, horasTrabalhadas; 
        float valorPorHora, salario; 
        Scanner teclado = new Scanner(System.in); 
        
        System.out.println("Informe o número do funcionário: ");
        funcionario = teclado.nextInt();
        
        System.out.println("Informe o número do de horas trabalhadas: ");
        horasTrabalhadas = teclado.nextInt();
        
        System.out.println("Informe o valor por hora: ");
        valorPorHora = teclado.nextFloat();
        
        salario = horasTrabalhadas * valorPorHora; 
        
        System.out.println("Number: "+ funcionario);
        System.out.println("Salary: "+ salario);
        
        teclado.close();
       
 
    }
 
}
