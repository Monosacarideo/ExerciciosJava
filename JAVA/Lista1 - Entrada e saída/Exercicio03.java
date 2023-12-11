    import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Exercicio03 {

    public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("R$#,###.00");

    JOptionPane.showMessageDialog(null, "A partir do valor da compra de uma mercadoria vamos calcular:\n O valor da venda e os impostos.");
    double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de compra de algum produto: "));

    double representante = valorCompra * 0.2;
    double impostos = valorCompra * 0.3;
    double valorVenda = valorCompra + representante + impostos; 

    JOptionPane.showMessageDialog(null, "Estes são os valores:\n Valor de venda: " + df.format(valorVenda) + "\n" + //
    "Representante: " + df.format(representante) + "\n" + //
    "Impostos: " + df.format(impostos));
    }
}

