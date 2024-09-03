// Exercicio 1

package teste.vaga;

import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int nmr = scanner.nextInt();

        if (eDaSequencia(nmr)) {
            System.out.println("O número " + nmr + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + nmr + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean eDaSequencia(int numero) {
        if (numero < 0) {
            return false;
        }
        
        int a = 0;
        int b = 1;

        while (a < numero) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        return a == numero || numero == 0;
    }
}

