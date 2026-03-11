
package com.carneiro.multaporexcesso;

import java.util.Scanner;

public class MultaPorExcesso {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Adicione o peso de Hoje");
        int peso = scan.nextInt();
        int limite = 50;
        int excedido = peso - limite;
        int excesso = excedido * 4;
        
        if(peso > limite){
            System.out.println("O peso excedeu "+ excedido +"Kg" + "\nO valor da multa a ser pago vai ser de: " + excesso);
        }else{
            System.out.println("Não excedeu.");
        }
        
    }
}
