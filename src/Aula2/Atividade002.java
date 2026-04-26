/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2;

/**
 *
 * @author mathe
 */

   

import java.util.Scanner;

public class Atividade002 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        String nome = "Matheus Dias Pereira";
        
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
        
