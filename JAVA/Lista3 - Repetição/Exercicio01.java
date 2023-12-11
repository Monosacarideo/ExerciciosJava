import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        int quantidadePar = 0;
        int quantidadeImpar = 0;
        int negativos = 0;
        int positivos = 0;
        boolean n = false;

        for (int i = 0; i < 10; i++) {
          int numeros = 0;
          while (true) {
            n = false;
             try {
              numeros = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º número:"));
            } catch (Exception e) {
                System.out.println("ERRO - Voce deve digitar algum valor!");
                n = true;
            }
            if (n == false) {
            break;
           }
          }
           

            if (numeros % 2 == 0) {
                quantidadePar++;
            } else {
                quantidadeImpar++;
            }

            if (numeros < 0) {
                negativos++;
            } else {
                positivos++;
            }
        }
        String opcao = (JOptionPane.showInputDialog(null, "Oque você deseja saber sobre os números informados?" +
                "\nA) Quantos números pares?" +
                " \nB)Quantos números ímpares?" +
                "\nC)Quantos números negativos?" +
                "\nD)Quantos números positivos? " +
                "\nE)Sair do programa. "));
        opcao = opcao.toUpperCase();

        while (!opcao.equals("A") && !opcao.equals("B") && !opcao.equals("C") && !opcao.equals("D")
                && !opcao.equals("E")) {
                    opcao = opcao.toUpperCase();
            opcao = (JOptionPane.showInputDialog(null, "Por favor escolha entre A, B, C, D ou E. \n " +
                    "Oque você deseja saber sobre os números informados?" +
                    "\nA) Quantos números pares?" +
                    " \nB)Quantos números ímpares?" +
                    "\nC)Quantos números negativos?" +
                    "\nD)Quantos números positivos? " +
                    "\nE)Sair do programa. "));
        }

        switch (opcao) {
            case "A":
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: " + opcao
                                + ".\n Quantidade de números pares: " + quantidadePar);
                break;
            case "B":
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: " + opcao
                                + ".\n Quantidade de números ímpares: " + quantidadeImpar);
                break;
            case "C":
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: " + opcao
                                + ".\n Quantidade de números negativos: " + negativos);
                break;
            case "D":
                JOptionPane.showMessageDialog(null,
                        "Opção Escolhida: " + opcao
                                + ".\n Quantidade de números positivos: " + positivos);
                break;
            case "E":
                System.exit(0);
                break;
        }

    }
}