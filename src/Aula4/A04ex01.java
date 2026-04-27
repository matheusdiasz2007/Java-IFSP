/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4;

/**
 *
 * @author mathe
 */
    // Matheus Dias Pereira
    import java.util.Scanner;

public class A04ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o valor final: ");
        int fim = scanner.nextInt();

        if (inicio <= fim) {
            System.out.println("Contador progressivo:");
            for (int i = inicio; i <= fim; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("O valor inicial deve ser menor ou igual ao valor final.");
        }

        scanner.close();
    }
}
    
