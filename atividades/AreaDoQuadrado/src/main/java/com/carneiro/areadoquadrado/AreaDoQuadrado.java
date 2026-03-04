package com.carneiro.areadoquadrado;

import java.util.Scanner;

public class AreaDoQuadrado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Vamos calcular a área de um quadrado");
        System.out.println("Digite o numero:");
        double lado = scan.nextDouble();
        double area = Math.pow(lado, 2);
        
        System.out.println("O valor da área do seu quadrado é: " + area + "cm²");
        
        double dobroDaArea = area*2;
        System.out.println("Esse é o dobro da sua área: " + dobroDaArea + "cm²");
        
        
        
    }
}
