import java.util.Scanner;

public class Calculadora {

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("0. Sair");

        while (true) {
            try {
                System.out.print("Digite o número da operação desejada: ");
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 0) {
                    break;
                }

                if (choice < 1 || choice > 4) {
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
                }

                System.out.print("Digite o primeiro número: ");
                double num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Digite o segundo número: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                if (choice == 1) {
                    System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                } else if (choice == 2) {
                    System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                } else if (choice == 3) {
                    System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                } else if (choice == 4) {
                    System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
