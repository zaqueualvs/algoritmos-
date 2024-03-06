package com.alves;

import java.util.ArrayList;
import java.util.List;

public class TerceiroLogica {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("a) ");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                sb.append(i + ", ");
            }
        }
        sb.append("\n" + "b) ");
        for (int i = 1; i < 8; i++) {
            sb.append((int) Math.pow(2, i) + ", ");
        }
        sb.append("\n" + "c) ");
        for (int i = 1; i < 8; i++) {
            sb.append((int) Math.pow(i, 2) + ", ");
        }

        sb.append("\n" + "d) ");
        int aux = 12;
        int inicio = 4;
        for (int i = 1; i < 6; i++) {
            sb.append(inicio + ", ");
            inicio += aux;
            aux += 8;
        }

        sb.append("\n" + "e) ");
        int inicioFibonacci = 0;
        int proximo = 1;
        List<Integer> numerosFibonacci = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            inicioFibonacci = proximo - inicioFibonacci;
            proximo = proximo + inicioFibonacci;
            sb.append(inicioFibonacci + ", ");
        }

        sb.append("\n" + "f) ");
        /*a resposta seria 200*/
        sb.append("2, 10, 12, 16, 17, 18, 19, 200");


        System.out.println(sb);
    }
}
