import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        int golsA = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de gols do time A:"));
        int golsB = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de gols do time B:"));

        while (golsA < 0 || golsB < 0) {
            if (golsA < 0) {
                golsA = Integer
                        .parseInt(JOptionPane.showInputDialog("O saldo de gols tende a ser maior ou igual a 0.\n" + //
                                "Informe a quantidade de gols do time A:"));
            }

            if (golsB < 0) {
                golsB = Integer
                        .parseInt(JOptionPane.showInputDialog("O saldo de gols tende a ser maior ou igual a 0.\n" + //
                                "Informe a quantidade de gols do time B:"));
            }
        }

        String resultado = "No jogo entre time A e time B o resultado foi \n" + golsA + "x" + golsB
                + " respectivamente.\n ";

        if (golsA > golsB) {
            resultado += "O time A ganhou.";
        } else if (golsA < golsB) {
            resultado += "O time B ganhou.";
        } else {
            resultado += "Empate.";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
