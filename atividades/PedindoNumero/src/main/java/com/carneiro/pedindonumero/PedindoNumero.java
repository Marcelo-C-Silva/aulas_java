package com.carneiro.pedindonumero;

import java.util.Scanner;

public class PedindoNumero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("digite um numero: ");
        int numero = scan.nextInt();
        System.out.println("o numero digitado foi: " + numero);
    }
}
