

package com.carneiro.imprimaomaior;

import java.util.Scanner;


public class ImprimaOMaior {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        double numero1 = scan.nextDouble();
        System.out.println("digite o outro numero");
        double numero2 = scan.nextDouble();
        
        System.out.println("agora vou te dar o maior numero entre os dois");
        
        if(numero1 > numero2){
            System.out.println("O Numero " + numero1 + " é maior que o numero "+ numero2);
        }else{
            System.out.println("O Numero " + numero2 + " é maior que o numero "+ numero1);

        }
        
    }
}
