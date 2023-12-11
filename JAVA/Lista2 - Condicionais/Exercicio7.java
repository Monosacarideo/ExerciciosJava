import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        String questao1 = "Quem é o melhor amigo de Irmão do Jorel? \nA) Lara \nB)Steve Magal \nC)Nico ";
        String correta1 = "A";

        String questao2 = "Qual é o nome do diretor da escola Princesa Isabel? \nA) Marceline \nB)Professora Adelaide \nC)Gisele ";
        String correta2 = "B";

        JOptionPane.showMessageDialog(null,
                "Você terá opção de escolher entre 2 perguntas para responder. \nTema: Irmão do Jorel \n3 tentativas para responder");

        int escolhaQuestao = Integer.parseInt(
                JOptionPane.showInputDialog("Qual questão você deseja responder? \n[1] - Questão 1 \n[2] - Questão 2"));

        while (escolhaQuestao != 1 && escolhaQuestao != 2) {
            escolhaQuestao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Por favor escolha entre 1 ou 2. \nQual questão você deseja responder? \n[1] - Questão 1 \n[2] - Questão 2"));
        }

        int i = 0;

        switch (escolhaQuestao) {
            case 1:
                do {
                    String resposta1 = (JOptionPane.showInputDialog(null, questao1));
                    resposta1 = resposta1.toUpperCase();
                    i++;
                    while (!resposta1.equals("A") && !resposta1.equals("B") && !resposta1.equals("C")) {
                        resposta1 = (JOptionPane.showInputDialog(null,
                                "Por favor escolha entre A, B ou C. \n" + questao1));
                    }
                    if (resposta1.equals("A")) {

                        JOptionPane.showMessageDialog(null,
                                "Resposta: " + correta1
                                        + "\nVocê acertou, pode retirar seu bônus na Shostners and Shostners.");
                        break;
                    }
                    if (i == 3) {
                        int opcao = Integer.parseInt(
                                JOptionPane.showInputDialog("Você não acertou. \n" + //
                                        "Gostaria de tentar novamente? \n[1] - Sim \n[2] - Não"));
                        while (opcao != 1 && opcao != 2) {
                            opcao = Integer.parseInt(
                                    JOptionPane
                                            .showInputDialog("Por favor escolha entre 1 ou 2. \nVocê não acertou. \n" + //
                                                    "Gostaria de tentar novamente? \n[1] - Sim \n[2] - Não"));
                        }
                        if (opcao == 1) {
                            i = 0;
                        }
                    }
                } while (i < 3);

                break;
            case 2:
                do {
                    String resposta2 = (JOptionPane.showInputDialog(null, questao2));
                    resposta2 = resposta2.toUpperCase();
                    i++;
                    while (!resposta2.equals("A") && !resposta2.equals("B") && !resposta2.equals("C")) {
                        resposta2 = (JOptionPane.showInputDialog(null,
                                "Por favor escolha entre A, B ou C. \n" + questao2));
                    }
                    if (resposta2.equals("B")) {

                        JOptionPane.showMessageDialog(null,
                                "Resposta: " + correta2
                                        + "\nVocê acertou, pode retirar seu bônus na Shostners and Shostners.");
                        break;
                    }
                    if (i == 3) {
                        int opcao = Integer.parseInt(
                                JOptionPane.showInputDialog(
                                        "Você não acertou. \nGostaria de tentar novamente? \n[1] - Sim \n[2] - Não"));
                        while (opcao != 1 && opcao != 2) {
                            opcao = Integer.parseInt(
                                    JOptionPane
                                            .showInputDialog("Por favor escolha entre 1 ou 2. \nVocê não acertou. \n" + //
                                                    "Gostaria de tentar novamente? \n[1] - Sim \n[2] - Não"));
                        }
                        if (opcao == 1) {
                            i = 0;
                        }
                    }
                } while (i < 3);
                break;
        }
    }
}
