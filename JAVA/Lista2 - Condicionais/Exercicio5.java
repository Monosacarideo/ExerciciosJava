import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        int estoqueAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade atual do estoque:"));
        int estoqueMax = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade máxima do estoque:"));
        int estoqueMin = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade mínima do estoque:"));
        double media = (estoqueMax + estoqueMin) / 2;

        if (estoqueAtual > media || estoqueAtual == media) {
            JOptionPane.showMessageDialog(null, "Estoque Atual: " + estoqueAtual + "\nEstoque Máximo: " + estoqueMax
                    + "\nEstoque Mínimo: " + estoqueMin + "\nQuantidade Média do Estoque: "+media+"\nNão efetuar compra.");
        } else {
            JOptionPane.showMessageDialog(null, "Estoque Atual: " + estoqueAtual + "\nEstoque Máximo: " + estoqueMax
                    + "\nEstoque Mínimo: " + estoqueMin + "\nQuantidade Média do Estoque: "+media+"\nO estoque precisa de reposição. Efetuar compra.");
        }
    }
}
