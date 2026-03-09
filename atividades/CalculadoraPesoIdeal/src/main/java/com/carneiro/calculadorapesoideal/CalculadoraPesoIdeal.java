package com.carneiro.calculadorapesoideal;

import java.util.Scanner;

public class CalculadoraPesoIdeal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nome = scan.next();
        
        System.out.println("Digite seu peso");
        double peso = scan.nextDouble();
        
        System.out.println("Digite sua altura");
        double altura = scan.nextDouble();
        
        double imc = peso /(altura*altura);
        
        if(imc < 18.5){
            System.out.println(nome+ ", seu IMC é: " + imc);
            System.out.println("Abaixo do peso");
        }else if(imc<=24.9){
            System.out.println(nome+ ", seu IMC é: " + imc);
            System.out.println("Peso normal");
        }else if(imc<=29.9){
            System.out.println(nome+ ", seu IMC é: " + imc);
            System.out.println("Sobrepeso");
        }else{
            System.out.println(nome+ ", seu IMC é: " + imc);
            System.out.println("Obesidade");
        }
        
  
    }
}
