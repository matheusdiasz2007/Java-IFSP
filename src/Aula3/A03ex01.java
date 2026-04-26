/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula3;

/**
 *
 * @author mathe
 */

    import java.util.Scanner;

public class A03ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a largura da parede em metros: ");
        double largura = scanner.nextDouble();

        System.out.print("Informe a altura da parede em metros: ");
        double altura = scanner.nextDouble();

        double area = largura * altura;
        double quantidadeTijolos = area * 20;

        System.out.println("Area da parede: " + area + " m2");
        System.out.println("Quantidade necessaria de tijolos: " + quantidadeTijolos);

        scanner.close();
    }
}
    
