/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2;

/**
 *
 * @author mathe
 */
public class A02ex03 {
    public static void main(String[] args) {

        // Verifica se foram passados dois valores
        if (args.length != 2) {
            System.out.println("Informe exatamente dois valores.");
            return;
        }

        // Converte de String para número
        double valor1 = Double.parseDouble(args[0]);
        double valor2 = Double.parseDouble(args[1]);

        // Cálculos
        double resto = valor1 % valor2;
        double produto = valor1 * valor2;
        double media = (valor1 + valor2) / 2;

        // Exibe resultados
        System.out.println("Resto da divisão: " + resto);
        System.out.println("Produto: " + produto);
        System.out.println("Média: " + media);
    }
}
