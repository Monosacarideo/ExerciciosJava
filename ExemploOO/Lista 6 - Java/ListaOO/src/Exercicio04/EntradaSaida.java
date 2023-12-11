package Exercicio04;
import java.time.LocalDate;

import javax.swing.JOptionPane;
public class EntradaSaida{

    public static int escolherOpcaoMenu() {
        return Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção: \n" +
                "1- Cadastrar uma nova tarefa\n" +
                "2- Ver todas as tarefas\n" +
                "3- Ver somente as tarefas em aberto\n" +
                "4- Ver somente as tarefas concluídas\n" +
                "5- Alterar status de uma tarefa\n" +
                "6- Excluir uma tarefa\n" +
                "7- Ver todos os tipos de tarefa existente\n" +
                "8- Sair do sistema"));
    }





    public static String solicitarDescricao(String string) {
        return null;
    }


    public static LocalDate solicitarPrazo(String string) {
        return null;
    }


    public static String solicitarStatus(String string) {
        return null;
    }


    public static String solicitarTipo(String string) {
        return null;
    }
}