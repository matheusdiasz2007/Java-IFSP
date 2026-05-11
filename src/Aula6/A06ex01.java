/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6;

/**
 *
 * @author matheus dias pereira
 */

public class A06ex01 {
    

    public static String buscarNome(int codigo) {
        switch (codigo) {
            case 1:
                return "name1";
            case 2:
                return "name2";
            case 3:
                return "name3";
            case 4:
                return "name4";
            case 5:
                return "name5";
            default:
                return "Código não encontrado";
        }
    }

    public static void main(String[] args) {
        int codigo = 3;

        String nome = buscarNome(codigo);

        System.out.println("Nome: " + nome);
    }
}
