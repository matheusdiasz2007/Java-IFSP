/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6;

/**
 *
 * @author matheus dias pereira
 */
public class A06ex02 {

    public static void mostrarMaior(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os dois números são iguais.");
        }
    }

    public static void main(String[] args) {
        mostrarMaior(10, 25);
    }
}

    

