import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitário do produto:"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade que deseja comprar:"));
        double valorFinal;

        while (valor < 0 || quantidade < 0) {
            if (valor < 0) {
                valor = Double.parseDouble(JOptionPane
                        .showInputDialog(
                                "O valor tende a ser maior ou igual a 0.\nInforme o valor unitário do produto:"));
            }

            if (quantidade < 0) {
                quantidade = Integer
                        .parseInt(JOptionPane.showInputDialog("A quantida tende a ser maior ou igual a 0.\n" + //
                                "Informe a quantidade que deseja comprar:"));
            }

        }

        if (quantidade <= 12) {
            valorFinal = quantidade * valor;
        } else {
            valorFinal = (quantidade * valor) * 0.9;
        }
        String resultado = "O valor unitário do produto é " + valor + ",\n você irá comprar " + quantidade
                + " unidades do produto. \n O valor final do produto é " + valorFinal + ".";
        JOptionPane.showMessageDialog(null, resultado);

    }
}
