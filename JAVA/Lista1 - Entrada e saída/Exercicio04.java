import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "A partir de um número inteiro: \n Vamos verificar seu sucessor e antecessor.");
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));

        int sucessor = valor + 1;
        int antecessor = valor - 1;

        JOptionPane.showMessageDialog(null,
                "O número informado foi " + valor + ", o antecessor é " + antecessor + " e o sucessor é " + sucessor);
    }
}
