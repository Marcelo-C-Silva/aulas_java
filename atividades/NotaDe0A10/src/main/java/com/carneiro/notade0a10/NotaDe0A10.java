package com.carneiro.notade0a10;

import java.util.Scanner;

public class NotaDe0A10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double numero;

        System.out.println("Escreva um numero entre 0 e 10:");
        numero = scan.nextDouble();

        while (numero < 0 || numero > 10) {
            System.out.println("Valor inválido! Digite novamente:");
            numero = scan.nextDouble();
        }

        System.out.println("Valor válido: " + numero);
    }
}