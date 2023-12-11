import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio01 {
  public static void main(String[] args) {
    int[] vetor = new int[10];
    Random random = new Random();

    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = random.nextInt(100);
      System.out.println(vetor[i]);
    }
    JOptionPane.showMessageDialog(null, "Vamos criar um vetor com números aleatórios e procurar o número que você informar.");
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor informe um número inteiro entre 1 e 100:"));
    while (numero > 100 || numero < 1) {
      numero = Integer.parseInt(JOptionPane.showInputDialog(
          "O número precisa estar dentro do intervalo. \nPor favor informe um número inteiro entre 1 e 100:"));
    }

    // leitura do vetor
    for (int i = 9; i >= 0; i--) {
      // se existir no vetor o número digitado
      if (vetor[i] == numero) {
        JOptionPane.showMessageDialog(null, "A posição do número digitado é " + (i + 1) + "º");
        System.exit(0);
      }
    }
    JOptionPane.showMessageDialog(null, "Número não encontrado no vetor");
  }
}