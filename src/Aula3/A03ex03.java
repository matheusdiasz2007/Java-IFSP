/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula3;

/**
 *
 * @author mathe
 */
    import javax.swing.JOptionPane;

public class A03ex03 {
    public static void main(String[] args) {
        String titulo = "Matheus";

        double largura = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Informe a largura da parede em metros:", titulo, JOptionPane.QUESTION_MESSAGE)
        );

        double altura = Double.parseDouble(
            JOptionPane.showInputDialog(null, "Informe a altura da parede em metros:", titulo, JOptionPane.QUESTION_MESSAGE)
        );

        double area = largura * altura;
        double quantidadeTijolos = area * 20;

        String classificacao;

        if (altura < 3.0) {
            classificacao = "baixa";
        } else if (altura <= 3.5) {
            classificacao = "media";
        } else {
            classificacao = "alta";
        }

        String mensagem = "Area da parede: " + area + " m2\n"
                + "Quantidade necessaria de tijolos: " + quantidadeTijolos + "\n"
                + "Classificacao da parede: " + classificacao;

        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}


