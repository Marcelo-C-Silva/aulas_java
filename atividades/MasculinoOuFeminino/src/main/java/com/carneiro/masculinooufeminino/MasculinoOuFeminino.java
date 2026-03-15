
package com.carneiro.masculinooufeminino;

import java.util.Scanner;

public class MasculinoOuFeminino {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite F ou M \nF-Feminino\nM-Masculino");
        
        char letra = scan.next().toUpperCase().charAt(0); 
        
        if(letra == 'F'){
            System.out.println("Feminino");
        }else if(letra == 'M'){
            System.out.println("Masculino");
        }else{
            System.out.println("Indeterminado");
        }
        
    }
}
