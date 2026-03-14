package com.carneiro.coberturapormetroquadrado;

import java.util.Scanner;

public class CoberturaPorMetroQuadrado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho da area em metros quadrados:");
        double area = scan.nextDouble();

        double litros = area / 3;

        double latas = Math.ceil(litros / 18);

        double preco = latas * 80;

        System.out.println("Quantidade de latas: " + latas);
        System.out.println("Preço total: R$ " + preco);

        
    }
}
