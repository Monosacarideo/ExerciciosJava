import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exericio1Revisao {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("R$#,###.00");
       // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String nome = JOptionPane.showInputDialog("Informe seu nome:");
        String sobreNome = JOptionPane.showInputDialog("Informe seu sobrenome:");
        String data = JOptionPane.showInputDialog("Informe sua data de nascimento: ex.: 10/10/2000");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua pretensão salarial?:"));
        
        String[] escolaridades = {"Superior", "Fundamental"};
        String respostaEscolaridade = JOptionPane.showInputDialog(null,"Selecione sua escolaridade","",JOptionPane.PLAIN_MESSAGE,null,escolaridades,0).toString();

        String cargo = JOptionPane.showInputDialog("Qual o seu cargo pretendido?:");
        String cnh = JOptionPane.showInputDialog("Possui CNH do tipo B?:");

        JOptionPane.showMessageDialog(null, "Confirme as informações:\n Nome: " + nome + "\n" + //
                "Sobrenome: " + sobreNome + "\n" + //
                "Data de Nascimento: " +data + "\n" + //
                "Salário Pretendido: " + df.format(salario) + "\n" + //
                "Escolaridade: " + respostaEscolaridade + "\n" + //
                "Cargo Pretendido: " + cargo + "\n" + //
                "CNH: " + cnh);

    }
}
