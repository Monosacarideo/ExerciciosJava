package ExemploMetodos;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static double pedirNumero(String contador) {

        return Double.parseDouble(JOptionPane.showInputDialog("Informe o " + contador + "º número:"));

    }

    public static int pedirOperacao() {

        return Integer.parseInt(JOptionPane.showInputDialog(
                "Informe a operação desejada \n[1] - Soma \n[2] - Subtração \n[3] - Multiplicação \n[4] - Divisão"));
                

    }
    public static void mostrarMsgDivisao(String msg){
        JOptionPane.showMessageDialog(null,"A divisão não pode ser calculada");
    }
}
