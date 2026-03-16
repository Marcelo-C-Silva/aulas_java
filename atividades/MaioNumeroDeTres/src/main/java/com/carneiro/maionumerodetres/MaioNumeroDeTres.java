package com.carneiro.maionumerodetres;

import java.util.Scanner;

public class MaioNumeroDeTres {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva o Primeiro numero");
        double numero1 = scan.nextDouble();
        
        System.out.println("Escreva o Segundo numero");
        double numero2 = scan.nextDouble();
        
        System.out.println("Escreva o Terceiro numero");
        double numero3 = scan.nextDouble();
        
        double maior = numero1;
        double menor = numero1;
        
        if(numero2 > maior){
            maior = numero2;
        }
        if(numero3 > maior){
            maior = numero3;
        }
        if(numero2 < menor){
            menor = numero2;
        }
        if(numero3 < menor){
            menor = numero3;
        }
        System.out.println("O maior numero dos 3 é: " + maior);
        System.out.println("O menor numero dos 3 é: " + menor);

    }
}
