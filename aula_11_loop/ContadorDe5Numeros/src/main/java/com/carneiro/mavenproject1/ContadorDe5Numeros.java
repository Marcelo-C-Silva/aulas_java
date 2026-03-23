package com.carneiro.mavenproject1;

import java.util.Scanner;

public class ContadorDe5Numeros {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int contador = 0;
        int soma = 0;
        
        while (contador < 5){
            System.out.println("Digite um numero");
            int numero = scan.nextInt();
            
            soma += numero;
            contador++;
        }
        System.out.println("A soma total é " + soma);
    }
}
