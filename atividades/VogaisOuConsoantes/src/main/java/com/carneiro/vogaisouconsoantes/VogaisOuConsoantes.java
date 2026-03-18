package com.carneiro.vogaisouconsoantes;

import java.util.Scanner;

public class VogaisOuConsoantes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva uma letra e eu te falarei se é vogal ou consoante");

        char letra = scan.next().toUpperCase().charAt(0);
        /**if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
        System.out.println("É uma vogal");
        }else{
            System.out.println("É uma consoante");
            }**/
        switch (letra){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("É uma vogal");
                break;
                
            default:
              System.out.println("É uma consoante");  
        }
    }
}
