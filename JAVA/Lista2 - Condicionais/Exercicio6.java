import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {

        double numAleatorio = (int) (Math.random() * 100) + 1;

        int i = 0;
        do {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(
                    "X\nVocê tem 3 chances para acertar o número.\nChute algum número entre 1 e 100: \n Dica: "
                            + numAleatorio));
            i++;
            if (numero == numAleatorio) {

                JOptionPane.showMessageDialog(null, numAleatorio + "\nVocê acertou o número.");
                break;
            }
            if (i == 3) {
                int opcao = Integer.parseInt(JOptionPane.showInputDialog("Gostaria de tentar novamente? \n[1] - Sim \n[2] - Não"));
                if (opcao == 1) {
                    i = 0;
                }
            }
        } while (i < 3);

    }
}
