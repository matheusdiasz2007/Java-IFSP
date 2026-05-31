/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula9;

/**
 *
 * @author mathe
 */

    import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class FeriasFuncionario {

    public static void main(String[] args) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            String inicioTexto = JOptionPane.showInputDialog(
                    "Digite a data de inicio das ferias: \nExemplo: 01/07/2026"
            );

            String terminoTexto = JOptionPane.showInputDialog(
                    "Digite a data de termino das ferias: \nExemplo: 30/07/2026"
            );

            LocalDate dataInicio = LocalDate.parse(inicioTexto, formato);
            LocalDate dataTermino = LocalDate.parse(terminoTexto, formato);

            if (dataTermino.isBefore(dataInicio)) {
                JOptionPane.showMessageDialog(null,
                        "A data de termino nao pode ser antes da data de inicio.");
                return;
            }

            String lista = "Periodo de ferias:\n\n";
            int numeroDia = 1;

            while (!dataInicio.isAfter(dataTermino)) {
                lista += "Dia " + numeroDia + " - " + dataInicio.format(formato) + "\n";

                dataInicio = dataInicio.plusDays(1);
                numeroDia++;
            }

            JOptionPane.showMessageDialog(null, lista);

        } catch (DateTimeParseException erro) {
            JOptionPane.showMessageDialog(null,
                    "Data invalida! Digite no formato dd/MM/yyyy.");
        }
    }
}