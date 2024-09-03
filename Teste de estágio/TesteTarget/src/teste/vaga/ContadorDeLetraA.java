// Exercicio 2

package teste.vaga;

import java.util.Scanner;

public class ContadorDeLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        int contador = contarLetrasA(entrada);

        if (contador > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece na string.");
        }
    }

    public static int contarLetrasA(String str) {
        int contador = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
