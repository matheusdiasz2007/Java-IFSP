/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4;

/**
 *
 * @author mathe
 */
    
    import java.util.Scanner;

public class A04ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nome: Matheus Dias Pereira

        System.out.print("1. Qual seu prato preferido? ");
        String prato = scanner.nextLine().toLowerCase();

        if (prato.contains("lasanha") || prato.contains("pizza") || prato.contains("churrasco")) {
            System.out.println("Eu adoro isso!");
        } else {
            System.out.println("Disso eu nao gosto muito!");
        }

        System.out.print("2. Qual seu esporte preferido? ");
        String esporte = scanner.nextLine().toLowerCase();

        if (esporte.contains("futebol") || esporte.contains("volei") || esporte.contains("basquete")) {
            System.out.println("Esse esporte e muito legal!");
        } else {
            System.out.println("Nao acompanho muito esse esporte!");
        }

        System.out.print("3. Qual seu animal preferido? ");
        String animal = scanner.nextLine().toLowerCase();

        if (animal.contains("cachorro") || animal.contains("gato") || animal.contains("coelho")) {
            System.out.println("Que fofo, eu gosto muito desse animal!");
        } else {
            System.out.println("Esse animal nao esta no meu dicionario!");
        }

        scanner.close();
    }
}
