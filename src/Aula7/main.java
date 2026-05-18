/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula7;

/**
 *
 * @author matheus dias pereira
 */

public class main {
    public static void main(String[] args) {
        Fabricante logitech = new Fabricante("Logitech");
        Fabricante dell = new Fabricante("Dell");
        Fabricante samsung = new Fabricante("Samsung");

        Produto hd = new Produto("HD", "SSD 1TB", samsung);
        Produto mouse = new Produto("Mouse", "M170", logitech);
        Produto teclado = new Produto("Teclado", "KB216", dell);

        System.out.println("Nome: " + hd.nome);
        System.out.println("Modelo: " + hd.modelo);
        System.out.println("Fabricante: " + hd.fabricante.nome);
    }
}
