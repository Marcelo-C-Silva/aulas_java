
package com.carneiro.logicanumeroreal;

import java.util.Scanner;


public class LogicaNumeroReal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro Número inteiro");
        int primeiroNumeroInteiro = scan.nextInt();
        
        System.out.println("Agora digite o segundo Número inteiro:");
        int segundoNumeroInteiro = scan.nextInt();
        
        System.out.println("Agora digite um Número real");
        double numeroReal = scan.nextDouble();
        
        int primeiraFormula = (primeiroNumeroInteiro*2)+(segundoNumeroInteiro/2);
        System.out.println("O produto do dobro do primeiro com a metade do segundo é: "+primeiraFormula);
        
        double segundaFormula = (primeiroNumeroInteiro*3)+numeroReal;
        System.out.println("A soma do triplo do primeiro com o terceiro: " + segundaFormula);
        
        double terceiraFormula = Math.pow(numeroReal, 3);
        System.out.println("O terceiro numero elevado ao cubo: " + terceiraFormula);
    }
}
