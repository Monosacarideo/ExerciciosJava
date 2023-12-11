import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Vamos fazer todos os cálculos matemáticos a partir de 2 números.");
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1ª número: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2ª número: "));

        double soma = n1 + n2;
        double sub = n1 - n2;
        double mult = n1 * n2;
        double div = n1 / n2;
        double pow = Math.pow(n1, n2);
        double resto = n1 % n2;
 
        String stringn2=null;
        stringn2=""+div;
        String divValue=(n2!=0)?stringn2:"A divisão não poderá ser realizada.";

        JOptionPane.showMessageDialog(null, "Estes são os resultados das operações:\n Soma: " + soma + "\n" + //
                "Subtração: " + sub + "\n" + //
                "Multiplicação: " + mult + "\n" + //
                "Divisão: " + divValue + "\n" + //
                "Potenciação: " + pow + "\n" + //
                "Resto da divisão: " + resto);
    }
}
