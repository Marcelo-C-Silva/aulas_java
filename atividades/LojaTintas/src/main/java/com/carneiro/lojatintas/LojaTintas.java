package com.carneiro.lojatintas;
import java.util.Scanner;
public class LojaTintas {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho da area em metros quadrados:");
        double area = scan.nextDouble();

        area = area * 1.1; 

        double litros = area / 6;

        double latas = Math.ceil(litros / 18);
        double precoLatas = latas * 80;

        double galoes = Math.ceil(litros / 3.6);
        double precoGaloes = galoes * 25;

        double latasMix = Math.floor(litros / 18);
        double resto = litros - (latasMix * 18);

        double galoesMix = Math.ceil(resto / 3.6);

        double precoMix = (latasMix * 80) + (galoesMix * 25);

        System.out.println("\nComprar apenas latas:");
        System.out.println("Latas: " + latas);
        System.out.println("Preço: R$ " + precoLatas);

        System.out.println("\nComprar apenas galoes:");
        System.out.println("Galoes: " + galoes);
        System.out.println("Preço: R$ " + precoGaloes);

        System.out.println("\nMisturando latas e galoes:");
        System.out.println("Latas: " + latasMix);
        System.out.println("Galoes: " + galoesMix);
        System.out.println("Preço: R$ " + precoMix);

    }
}
