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

public class A03ex02 {
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

        String mensagem = "Area da parede: " + area + " m2\n"
                + "Quantidade necessaria de tijolos: " + quantidadeTijolos;

        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}

