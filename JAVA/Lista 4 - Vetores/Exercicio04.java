import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        String[] vetorDisciplinas = new String[4];
        int[] vetorCargas = new int[4];
        String[] vetorProfessor = new String[4];
        String nome;
        String disciplinas;
        String professor;
        int cargaHoraria = 0;
 
        for (int i = 0; i < 4; i++) {
            disciplinas = JOptionPane.showInputDialog("Informe a " + (i + 1) + "º Disciplina:");
            vetorDisciplinas[i] = disciplinas;
            cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horária da disciplina (em horas):"));
            vetorCargas[i] = cargaHoraria;
            nome = JOptionPane.showInputDialog("Informe o nome do professor dessa disciplina:");
            vetorProfessor[i] = nome;
        }
        

    }
}
