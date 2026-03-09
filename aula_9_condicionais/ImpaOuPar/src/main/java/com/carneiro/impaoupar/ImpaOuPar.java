
package com.carneiro.impaoupar;

import java.util.Scanner;

public class ImpaOuPar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero e vamos ver se é impar ou par");
        
        double numero = scan.nextDouble();
        
        if(numero%2==0){
            System.out.println("O numero é par");
        }else{
            System.out.println("o numero é ímpar");
        }
    }
}
