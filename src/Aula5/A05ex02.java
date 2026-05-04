/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5;

/**
 *
 * @author mathe
 */

   import java.util.Scanner;

public class A05ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[8][8];
        int valor;

        System.out.println("Matriz original:");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = i * 8 + j + 1;
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nDigite um valor inteiro: ");
        valor = entrada.nextInt();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matriz[i][j] % 2 == 0) {
                    matriz[i][j] += valor;
                } else {
                    matriz[i][j] -= valor;
                }
            }
        }

        System.out.println("\nMatriz alterada:");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        entrada.close();
    }
}
