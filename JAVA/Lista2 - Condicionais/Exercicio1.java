import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));

        while (idade <= 0) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade maior que 0 campeão:"));
        }

        String resultado = "Com " + idade + " anos de idade você é considerado: ";

        if (idade <= 14) {
            resultado += "Criança";
        } else if (idade >= 14 && idade <= 17) {
            resultado += "Adolescente";
        } else if (idade >= 18 && idade < 30) {
            resultado += "Adulto Jovem";
        } else {
            resultado += "Adulto";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
