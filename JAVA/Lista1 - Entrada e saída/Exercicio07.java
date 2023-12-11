import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("R$#,###.00");

        JOptionPane.showMessageDialog(null,
                "Vamos verificar o salário do vendedor a partir dos seguintes dados: \n Nome, mês, número de carros vendidos e valor total das vendas.");

        String nome = JOptionPane.showInputDialog("Informe o nome");
        String mes = JOptionPane.showInputDialog("Informe o mês");
        int carros = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de carros vendidos:"));
        double valorVendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total das vendas: "));

        double salario = 1500 + (350 * carros) + (valorVendas * 0.00001);

        JOptionPane.showMessageDialog(null, "Vendedor: " + nome + "\n Mês escolhido: " + mes + "\n" + //
                "Número de carros vendidos: " + carros + "\n" + //
                "Valor total das vendas: " + df.format(valorVendas) + "\n" + //
                "Salário do respectivo mês: " + df.format(salario) + "\n" + //
                "Salário do mês = R$1500 + R$350 x Quantidade de carros vendidos + 0,001% do valor total das vendas. ");
    }
}
  