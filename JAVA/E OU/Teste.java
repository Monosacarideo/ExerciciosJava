import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        int numeroDia = Integer.parseInt(JOptionPane
                .showInputDialog("Entre com um valor referente a um dia da semana \n Exemplo: 2 = Segunda "));

        String diaSemana = "O dia da semana é ";

        while (numeroDia < 1 || numeroDia > 7) {
            numeroDia = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor < 1 ou > 7 "));
        }

        switch (numeroDia) {
            case 1:
                diaSemana += "Domingo";
                break;

            case 2:
                diaSemana += "Segunda";
                break;
            case 3:
                diaSemana += "Terça    ";
                break;
            case 4:
                diaSemana += " Quarta   ";
                break;
            case 5:
                diaSemana += "  Quinta  ";
                break;
            case 6:
                diaSemana += "  Sexta  ";
                break;
            case 7:
                diaSemana += "  Sabádo  ";
                break;
        }
        JOptionPane.showMessageDialog(null, diaSemana);
    }
}