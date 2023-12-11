
import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        double numero = 0;
        double incremento = 0;
        boolean n = false;
        String numeros = "";

        JOptionPane.showMessageDialog(null,
                "Vamos fazer um contador que somando um incremento vai de 0 até o número que você informar."+ 
                "\nExemplo: Número = 20"+ 
                "\nIncremento = 5"+
                 "\nSaída = 0, 5, 10, 15, 20.");

        while (true) {
            n = false;
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog("Informe o número:"));
                incremento = Double.parseDouble(JOptionPane.showInputDialog("Informe o incremento:"));
            } catch (Exception e) {
                System.out.println("ERRO - Voce deve digitar algum valor!");
                n = true;
            }
            if (n == false) {
                break;
            }
        }

        for (int i = 0; i <= numero; i += incremento) {

            numeros += "\n" + i;
            JOptionPane.showMessageDialog(null,
                    "Está é a sequencia:\n" + numeros);

        }
    }
}
