package com.alves;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SegundoFibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();

        int inicio = 0;
        int proximo = 1;
        List<Integer> numerosFibonacci = new ArrayList<>();
        while (inicio <= numero) {
            numerosFibonacci.add(inicio);
            inicio = proximo - inicio;
            proximo = proximo + inicio;
        }

        if(numerosFibonacci.contains(numero)){
            System.out.println("Numero da sequencia de Fibonacci");
        }else {
            System.out.println("Numero não pertence a sequencia de Fibonacci");
        }
    }
}
