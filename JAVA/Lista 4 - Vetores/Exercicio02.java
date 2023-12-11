
import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int maior = 0;
        int menor = 0;

        JOptionPane.showMessageDialog(null, "Preencha um vetor de 5 posições e iremos mostrar o maior e menor número.");

        for (int i = 0; i < vetor.length; i++) {
            int posicoes = Integer
                    .parseInt(JOptionPane.showInputDialog("Digite um valor para a posição " + (i + 1) + "º"));
            vetor[i] = posicoes;
        }

        // leitura do vetor
        for (int i = 0; i < vetor.length; i++) {
            // se existir no vetor o número digitado
            if (i == 0) {
                menor = vetor[i];
                maior = vetor[i];
            } else {
                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
                if (vetor[i] < menor) {
                    menor = vetor[i];
                }

            }

        }
        JOptionPane.showMessageDialog(null, "Maior número: " + maior + "\nMenor número: " + menor);
    }
}
