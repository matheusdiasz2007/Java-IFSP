/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4;

/**
 *
 * @author mathe
 */
    
//Matheus Dias Pereira

    import java.util.Scanner;

public class A04ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        String textoSemVogais = texto.replaceAll("[aeiouAEIOU]", "");

        System.out.println("Texto sem vogais: " + textoSemVogais);

        scanner.close();
    }
}
