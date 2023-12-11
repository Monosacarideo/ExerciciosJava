import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "A partir de um horário: \n Vamos verificar este horário em segundos.");
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Informe as horas: "));
        int minuto = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos: "));
        int segundos = Integer.parseInt(JOptionPane.showInputDialog("Informe os segundos: "));

        int calculoMinutos = minuto * 60;
        int calculoHoras = (hora * 60) * 60;
        int segundosTotal = calculoHoras + calculoMinutos + segundos;

        JOptionPane.showMessageDialog(null, "O horário informado foi: " + hora + ":" + minuto + ":" + segundos + "\n" +
                "Em segundos: " + segundosTotal);
    }
}
