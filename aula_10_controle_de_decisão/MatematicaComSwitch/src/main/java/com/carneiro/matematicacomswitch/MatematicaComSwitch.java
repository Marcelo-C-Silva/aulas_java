package com.carneiro.matematicacomswitch;

import java.util.Scanner;

public class MatematicaComSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bem vindo, vamos fazer seus calculos\nDIGITE O PRIMEIRO NÚMERO");
        double numero1 = scan.nextDouble();
        
        System.out.println("AGORA DIGITE O SEGUNDO NÚMERO");
        double numero2 = scan.nextDouble();
        
        System.out.println("AGORA ESCOLHA A OPEREÇÃO DESEJADA\n1-Soma\n2-Subtração\n3-Multiplicação\n4-divisão");
        int operacaoDesejada = scan.nextInt();
        
        switch(operacaoDesejada){
            case 1: System.out.println(numero1 + numero2);break;
            case 2: System.out.println(numero1 - numero2);break;
            case 3: System.out.println(numero1 * numero2);break;
            case 4: System.out.println(numero1 / numero2);break;
            default: System.out.println("Inválido");
        }
    }
}
