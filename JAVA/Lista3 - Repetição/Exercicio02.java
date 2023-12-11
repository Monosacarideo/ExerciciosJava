import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        int idadeAcima = 0;
        int alturaAcima = 0;
        int pesoAbaixo = 0;
        boolean n = false;

        for (int i = 0; i < 10; i++) {
            int idade = 0;
            int altura = 0;
            int peso = 0;

            while (true) {
                n = false;
                try {
                    idade = Integer
                            .parseInt(JOptionPane.showInputDialog("Informe a idade da " + (i + 1) + "º pessoa:"));
                    altura = Integer
                            .parseInt(JOptionPane.showInputDialog("Informe a altura da " + (i + 1) + "º pessoa: \nEscreva em cm, exemplo: 160cm."));
                    peso = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da " + (i + 1) + "º pessoa: \nEscreva em Kg, exemplo: 88kg."));
                } catch (Exception e) {
                    System.out.println("ERRO - Voce deve digitar algum valor!");
                    n = true;
                }
                if (n == false) {
                    break;
                }
            }

            if (idade > 50) {
                idadeAcima++;
            }
            if (altura > 160) {
                alturaAcima++;
            }
            if (peso < 60) {
                pesoAbaixo++;
            }
        }
        JOptionPane.showMessageDialog(null,
                        "Com as informações fornecidas sobre as 10 pessoas, temos:" +
                "\nA) Pessoas com idade acima de 50 anos: "+ idadeAcima+
                " \nB) Pessoas com altura acima de 1.60m: " + alturaAcima+
                "\nC) Pessoas com peso abaixo de 80kg: "+ pesoAbaixo);
       

    }
}