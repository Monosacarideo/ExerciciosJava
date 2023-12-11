import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        double saldo = 0;
        boolean n = false;
        int quantidadePositivo = 0;
        int quantidadeNegativo = 0;

        JOptionPane.showMessageDialog(null,
                "Vamos verificar de acordo com o saldo de algumas pessoas, se há risco para o banco.");

        int pessoas = Integer
                .parseInt(JOptionPane.showInputDialog("Informe quantas pessoas você gostaria de verificar o saldo:"));

        for (int i = 0; i < pessoas; i++) {
            while (true) {
            n = false;
            try {
                saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo da " + (i + 1) + "º pessoa:"));
            } catch (Exception e) {
                System.out.println("ERRO - Voce deve digitar algum valor!");
                n = true;
            }
            if (n == false) {
                break;
            }
        }
         if (saldo > 0) {
                quantidadePositivo++;
            } else {
                quantidadeNegativo++;
            }
        }

        if (quantidadePositivo >= pessoas * 0.5) {
            JOptionPane.showMessageDialog(null,
                "Nenhum risco para o banco.");
        }else{
             JOptionPane.showMessageDialog(null,
                "Risco para o banco.");
        }
        

        }
    }

