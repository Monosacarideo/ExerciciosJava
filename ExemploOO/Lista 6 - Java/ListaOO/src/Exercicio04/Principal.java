package Exercicio04;

import javax.swing.JOptionPane;



public class Principal {

    public static void main(String[] args) {

        ListaTarefas L = new ListaTarefas();
        int opcao;

        do {
            opcao = EntradaSaida.escolherOpcaoMenu();

            switch (opcao) {
                case 1:
                    Tarefa T = new Tarefa(); // sempre precisamos criar um novo objeto peca
                    T.descricao = EntradaSaida.solicitarDescricao("descrição");
                    T.prazo = EntradaSaida.solicitarPrazo("o prazo:");
                    T.status = EntradaSaida.solicitarStatus("o status");
                    T.tipo = EntradaSaida.solicitarTipo("o tipo");

                    L.adicionarTarefa(T);
                    break;

                case 2:

                //"2- Ver todas as tarefas\n" +
               
                    break;

                case 3:
              
               // "3- Ver somente as tarefas em aberto\n" +
               
                    break;
                case 4:

               // "4- Ver somente as tarefas concluídas\n" +
             
                    break;
                case 5:
               
                //"5- Alterar status de uma tarefa\n" +
               
                    break;
                case 6:
            
                //"6- Excluir uma tarefa\n" +
             
                    break;
                case 7:
               
                //"7- Ver todos os tipos de tarefa existente\n" +

                    break;

                case 8:
                    System.exit(0);
                    break;

            }
        } while (opcao != 5);

    }
}
