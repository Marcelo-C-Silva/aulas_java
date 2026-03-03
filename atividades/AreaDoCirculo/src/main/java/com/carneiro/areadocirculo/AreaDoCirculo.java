
package com.carneiro.areadocirculo;

import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Vamos calcular a area de um círculo.");
        System.out.println("Coloque o Raio do Círculo");
        
        double raio = scan.nextFloat();
        double pi = 3.14159;
        double area = pi*Math.pow(raio, 2);
        
        System.out.println("A área do seu círculo é: " + area);
        
    }
}
