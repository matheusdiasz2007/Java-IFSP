/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6;

/**
 *
 * @author mathe
 */
    import javax.swing.JOptionPane;

public class Calendario {

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

    public static void nomeDiaSemana(int dia, int tipoMensagem) {
        String nomeDia = nomeDiaSemana(dia);

        if (tipoMensagem == 1) {
            System.out.println(nomeDia);
        } else if (tipoMensagem == 2) {
            JOptionPane.showMessageDialog(null, nomeDia);
        } else {
            System.out.println("Tipo de mensagem inválido");
        }
    }
}

