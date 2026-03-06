package com.carneiro.farenheitparacelsius;

import java.util.Scanner;

public class FarenheitParaCelsius {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor que você quer converter");
        
        double farenheit = scan.nextDouble();
        double celsius = (5*(farenheit-32)/9);
        
        System.out.println("O ressultado da conversão é: " + celsius);
    }
}
