package ExemploMetodos;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // pedir os numeros
        double numero = EntradaSaida.pedirNumero("1º");
        double numero2 = EntradaSaida.pedirNumero("2º");
        int opcao = EntradaSaida.pedirOperacao();
        double resultado = 0;

        // calcular de acordo com a operação escolhida
       do{
             switch (opcao) {
            case 1:
                resultado = Calculo.somar(numero, numero2); 
                break;

                case 2:
                  resultado = Calculo.subtrair(numero, numero2);
                break;
                case 3:
                resultado = Calculo.multiplicar(numero, numero2);
                break;
                case 4:
                if (numero2 != 0) {
                    resultado = Calculo.dividir(numero, numero2);
                }else{
                    EntradaSaida.mostrarMsgDivisao(null);
                }
                
                break;
                default:

                break;
        
        }
        } while (opcao > 4 || opcao < 1 );
              
        
      
       
      
        
        

        // mostrar o valor do cálculo
        JOptionPane.showMessageDialog(null, resultado);
    }
}
