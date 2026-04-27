/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4;

/**
 *
 * @author mathe
 */
    // Matheus Dias Pereira 
    import java.text.DecimalFormat;
import java.util.Scanner;

public class A04ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Escolha a operacao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.println("5 - Resto da divisao");
        System.out.println("6 - Potencia");
        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = valor1 + valor2;
                System.out.println("Resultado: " + df.format(resultado));
                break;
            case 2:
                resultado = valor1 - valor2;
                System.out.println("Resultado: " + df.format(resultado));
                break;
            case 3:
                resultado = valor1 * valor2;
                System.out.println("Resultado: " + df.format(resultado));
                break;
            case 4:
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                    System.out.println("Resultado: " + df.format(resultado));
                } else {
                    System.out.println("Nao e possivel dividir por zero.");
                }
                break;
            case 5:
                if (valor2 != 0) {
                    resultado = valor1 % valor2;
                    System.out.println("Resultado: " + df.format(resultado));
                } else {
                    System.out.println("Nao e possivel calcular resto com divisor zero.");
                }
                break;
            case 6:
                resultado = Math.pow(valor1, valor2);
                System.out.println("Resultado: " + df.format(resultado));
                break;
            default:
                System.out.println("Opcao invalida.");
        }

        scanner.close();
    }
}

