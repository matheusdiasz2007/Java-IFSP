/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula7;

/**
 *
 * @author matheus dias pereira
 */

public class Produto {
    String nome;
    String modelo;
    Fabricante fabricante;

    public Produto() {
    }

    public Produto(String nome, String modelo, Fabricante fabricante) {
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
}
    
