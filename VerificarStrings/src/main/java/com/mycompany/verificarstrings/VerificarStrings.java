package com.mycompany.verificarstrings;
import java.util.Scanner;

public class VerificarStrings {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
   
        System.out.print("Digite uma palavra: ");
        String input = leia.nextLine();
  
        int contador = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vez na palavra.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na palavra.");
        }

        leia.close();
    }
}
