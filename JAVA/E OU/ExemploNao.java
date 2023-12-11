import javax.swing.JOptionPane;

public class ExemploNao {
    public static void main(String[] args) {
        double media = Double.parseDouble(JOptionPane.showInputDialog("Informe a méida:"));
        double frequencia = Double.parseDouble(JOptionPane.showInputDialog("Informe a frequencia:"));
        String resultado = "Com média "+media+" e frequencia "+frequencia+" o estudante está:";

        if (media >= 7 && frequencia >= 75) {
            resultado+=" Aprovado";            
        }else{
            resultado+=" Reprovado";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
