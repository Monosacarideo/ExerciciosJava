import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        int destino = Integer.parseInt(
                JOptionPane.showInputDialog("Para onde deseja viajar?: \n" + //
                        " [1] - Maceió \n" + //
                        " [2] - Porto de Galinhas"));

        while (destino <= 0 || destino > 2) {
            destino = Integer.parseInt(
                    JOptionPane.showInputDialog("O número tende a ser 1 ou 2. \n Para onde deseja viajar?: \n" + //
                            " [1] - Maceió \n" + //
                            " [2] - Porto de Galinhas"));
        }
        int refeicao = Integer.parseInt(JOptionPane.showInputDialog("Com almoço/janta incluso?: \n" + //
                " [1] - Sim \n" + //
                " [2] - Não"));

        while (refeicao <= 0 || refeicao > 2) {
            refeicao = Integer.parseInt(
                    JOptionPane.showInputDialog("O número tende a ser 1 ou 2. \n Para onde deseja viajar?: \n" + //
                            " [1] - Maceió \n" + //
                            " [2] - Porto de Galinhas"));
        }
        double valorFinal;

       

        if (destino == 1 && refeicao == 1) {
            valorFinal = (3000 * 1) + 3000;
        } else if (destino == 1 && refeicao == 2) {
            valorFinal = (3000 * 0.85) + 3000;
        } else if (destino == 2 && refeicao == 1) {
            valorFinal = (3000 * 0.60) + 3000;
        }else {
            valorFinal = (3000 * 0.45) + 3000;
        }

        String fraseDestino=(destino == 1)?" Maceió":" Porto de Galinhas";
        String fraseRefeicao=(refeicao == 1)?" Sim":" Não";

         String resultado = "O destino da sua viagem é: "+fraseDestino+"\n Almoço/janta incluso:"+fraseRefeicao+"\n Valor total: R$"+valorFinal;
        JOptionPane.showMessageDialog(null, resultado);

    }
}
