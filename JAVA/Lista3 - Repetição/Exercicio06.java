import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        int numero = 0;
        boolean n = false;
        

        JOptionPane.showMessageDialog(null,
                "De acordo com um número inteiro informado iremos calcular sua tabuada, do 0 ao 10."+ 
                "\nExemplo: Número = 2"+ 
                 "\nSaída = 2x0 = 0"+
                 "\n 2x1 = 2"+
                 "\n 2x2 = 4"+
                 "\n ...");

        while (true) {
            n = false;
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número inteiro:"));
            } catch (Exception e) {
                System.out.println("ERRO - Voce deve digitar algum valor!");
                n = true;
            }
            if (n == false) {
                break;
            }
        }

        String numeros = "";
        
        for (int i = 0; i <= 10; i++) {

            numeros += "\n" + numero * i;
            JOptionPane.showMessageDialog(null,
                    "Está é a sequencia:\n" + numero+"x"+i+" = "+numeros);

        }
    }
}
