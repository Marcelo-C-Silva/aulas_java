package com.carneiro.celsiusparafarenheit;

import java.util.Scanner;

public class CelsiusParaFarenheit {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Coloque o numero que deseja converter");
        
        double celsius = scan.nextDouble();
        double farenheit = (celsius*1.8)+32;
        
        System.out.println("O valor convertido dá: " + farenheit);
        
    }
}
