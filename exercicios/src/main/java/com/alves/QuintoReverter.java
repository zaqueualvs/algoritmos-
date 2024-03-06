package com.alves;

import java.util.Scanner;

public class QuintoReverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        String[] novaPalavra = palavra.split("");
        for(int i = palavra.length()-1; i > -1; i--){
            sb.append(novaPalavra[i]);
        }
        System.out.println(sb);
    }
}
