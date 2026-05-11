/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6;

/**
 *
 * @author mathe
 */
public class A06ex04 {
    public static String nomeDiaSemana(int dia) {
        switch (dia) {
            case 1:
                return "segunda-feira";
            case 2:
                return "terça-feira";
            case 3:
                return "quarta-feira";
            case 4:
                return "quinta-feira";
            case 5:
                return "sexta-feira";
            case 6:
                return "sábado";
            case 7:
                return "domingo";
            default:
                return "Dia inválido";
        }
    }

    public static void main(String[] args) {
        int dia = 1;

        String nome = nomeDiaSemana(dia);

        System.out.println(nome);
    }
}

