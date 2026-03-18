
package com.carneiro.numeroreverso;
import java.util.Arrays;
import java.util.Scanner;

public class NumeroReverso {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextInt();
        }

        Arrays.sort(numeros);
        for (int i = 2; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        scan.close();
    }
}