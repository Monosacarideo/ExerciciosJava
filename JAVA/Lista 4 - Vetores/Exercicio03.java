import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
             int[] vetor = new int[10];
        double soma = 0;
        double media = 0;
        String resultado = "Os valores do vetor são: \n";

        JOptionPane.showMessageDialog(null, "Preencha um vetor de 10 posições e iremos mostrar a soma dos valores e a média.");

        for (int i = 0; i < vetor.length; i++) {
            int posicoes = Integer
                    .parseInt(JOptionPane.showInputDialog("Digite um valor para a posição " + (i + 1) + "º"));
            vetor[i] = posicoes;
        }
        for (int i = 0; i < vetor.length; i++){
            if (i == 9) {
                resultado+=vetor[i]+".";
            }else{
                resultado+=vetor[i]+",";
            }
            soma = soma + vetor[i];
            media = soma / 10;
        }
        JOptionPane.showMessageDialog(null, resultado+"\nA soma dos valores: "+soma+"\nA média dos valores: "+media);
    }
}
