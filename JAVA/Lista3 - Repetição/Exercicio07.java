import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        int maisPesado = 0;
        int maisAlto = 0;
        String nomePesado = "";
        String nomeAlto = "";
        String nome = "";
        boolean n = false;

        JOptionPane.showMessageDialog(null,
                "Dentre 6 pessoas verificaremos a mais alta e a mais pesada.");

        for (int i = 0; i < 6; i++) {

            int altura = 0;
            int peso = 0;

            while (true) {
                n = false;
                try {
                    nome = JOptionPane.showInputDialog("Informe o nome da " + (i + 1) + "º pessoa:");
                    altura = Integer
                            .parseInt(JOptionPane.showInputDialog(
                                    "Informe a altura da " + (i + 1) + "º pessoa: \nEscreva em cm, exemplo: 160cm."));
                    peso = Integer.parseInt(JOptionPane.showInputDialog(
                            "Informe o peso da " + (i + 1) + "º pessoa: \nEscreva em Kg, exemplo: 88kg."));
                } catch (Exception e) {
                    System.out.println("ERRO - Voce deve digitar algum valor!");
                    n = true;
                }
                if (n == false) {
                    break;
                }
            }
            if (i == 0) {
                nomePesado = nome;
                nomeAlto = nome;
                maisPesado = peso;
                maisAlto = altura;
            } else {
                if (altura >= maisAlto) {
                    maisAlto = altura;
                    nomeAlto = nome;
                }

                if (peso >= maisPesado) {
                    maisPesado = peso;
                    nomePesado = nome;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "A pessoa mais pesada é " + nomePesado + " com " + maisPesado + "Kg." +
                "\nA pessoa mais alta é " + nomeAlto + " com " + maisAlto + "Cm.");
    }
}
