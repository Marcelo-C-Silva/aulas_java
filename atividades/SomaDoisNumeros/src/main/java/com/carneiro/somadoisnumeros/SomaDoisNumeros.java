package com.carneiro.somadoisnumeros;

import java.util.Scanner;

public class SomaDoisNumeros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("bem vindo");
        System.out.println("como podemos lhe chamar?");
        String nome = scan.next();
        
        System.out.println("certo " + nome + " vamos prosseguir");
        System.out.println("coloque o primeiro numero para a soma");
        int numero1 = scan.nextInt();
        
        System.out.println("coloque o segundo numero para a soma");
        int numero2 = scan.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("o resultado da soma é: " + resultado);
        
    }
}
