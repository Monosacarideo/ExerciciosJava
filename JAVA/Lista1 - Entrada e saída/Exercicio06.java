import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "A partir de duas notas: \n Vamos verificar a média ponderada 40% nota1 e 60% nota2.");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota: "));
        double peso1 = 0.4;
        double peso2 = 0.6;
        double notaPeso1 = nota1 * peso1;
        double notaPeso2 = nota2 * peso2;
        double media = (notaPeso1 + notaPeso2) / (peso1 + peso2);

        JOptionPane.showMessageDialog(null, "A média do aluno é:" + media);
    }
}
