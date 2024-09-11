package teste;

import java.util.Scanner;

public class Ex1 {
    int valor1 = 0;
    int valor2 = 1;

    public void fibonacci(int max) { // Método para imprimir a sequência de Fibonacci até um número máximo
        int a = valor1, b = valor2;
        System.out.print(a + " " + b);
        int next;
        while (true) {
            next = a + b;
            if (next > max) {
                break;
            }
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    public boolean isFibonacci(int number) { // Método para verificar se um número pertence à sequência de Fibonacci
        int a = valor1, b = valor2;
        if (number == a || number == b) {
            return true;
        }
        int next;
        while (b < number) {
            next = a + b;
            a = b;
            b = next;
            if (b == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int number = s.nextInt();

        System.out.println("A sequência de Fibonacci até o número " + number + " é: ");
        ex1.fibonacci(number);

        if (ex1.isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        s.close();
    }
}