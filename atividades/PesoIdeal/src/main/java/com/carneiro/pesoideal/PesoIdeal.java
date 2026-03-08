package com.carneiro.pesoideal;

import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ponha seu altura que calcularemos seu peso ideal: ");
        
        
        double altura = scan.nextDouble();
        double formula = (72.7*altura)-58;
        
        System.out.println("Seu peso ideal é: " + formula + "kg");
        
    }
}
