package com.mycompany.fibonacci;
import java.util.Scanner;

/**
 *
 * @author Laryssa
 */
public class Fibonacci {

    public static boolean fibonacci(int number) {
        int a = 0, b = 1;
        
        while (b < number) {
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return b == number || number == 0;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe o número que gostaria: ");
        int numero = leia.nextInt();
        
         if (fibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        leia.close();
    }
}
