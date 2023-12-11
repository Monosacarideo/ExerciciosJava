import javax.swing.JOptionPane;
 
public class Exercicio03 {
    public static void main(String[] args){
        int quantidadeFans=0;
        int quantidadeOtimo = 0;
        int quantidadeBom = 0;
        int quantidadeRuim= 0;
        int opcao=1;
 
        while(true){
            quantidadeFans++;
            int opiniao=0;
            while(true){
                opiniao = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua opinião sobre o Filme: Wallace e Gromit: A batalha dos Vegetais"+"\n[1] - Ótimo"+"\n[2] - Bom"+"\n[3] - Ruim"));
                
                if(opiniao>=1 && opiniao<=3){break;}else{JOptionPane.showMessageDialog(null, "ERRO! Escolha uma opção entre 1 e 3.");}
            }
            if(opiniao==3){quantidadeOtimo++;}
            if(opiniao==2){quantidadeBom++;}
            if(opiniao==1){quantidadeRuim++;}
 
            while(true){
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Gostaria de avaliar novamente?"+"\n[1] - Sim"+"\n[2] - Não"));
                if(opcao>0 & opcao<3){break;}else{JOptionPane.showMessageDialog(null, "ERRO! Escolha uma opção entre 1 e 2.");}
            }
            if(opcao==2){break;}
        }
 
        double percentualOtimo = quantidadeOtimo/quantidadeFans;
        double percentualBom = quantidadeBom/quantidadeFans;
        double percentualRuim = quantidadeRuim/quantidadeFans;
 
        double average=(((3*quantidadeOtimo)+(2*quantidadeBom)+(1*quantidadeRuim))/quantidadeFans);
 
        JOptionPane.showMessageDialog(null,
        "Esta foi a quantidade de avaliações que o filme recebeu: "+quantidadeFans+"\n"+
        quantidadeOtimo+" responderam 'Ótimo'."+" This is "+percentualOtimo+"% of the total"+"\n"+
        quantidadeBom+" responderam 'Bom'."+" This is "+percentualBom+"% of the total"+"\n"+
        quantidadeRuim+" responderam 'Ruim'."+" This is "+percentualRuim+"% of the total"+"\n"+
        "The average is: "+average+" of "+quantidadeFans*3
        );
    }
}