
import java.util.Scanner;

public class Ensino_2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();

        System.out.println("Digite a matrícula do aluno: ");
        String matricula = leitor.nextLine();

        System.out.println("Digite o curso do aluno: ");
        String curso = leitor.nextLine();

        String[] disciplinas = new String[3];
        System.out.println("Digite o nome de 3 disciplinas:");
        for (int i = 0; i < 3; i++) {
            disciplinas[i] = leitor.nextLine();
        }

        double[][] notas = new double[3][4];
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite as 4 notas da disciplina " + disciplinas[i] + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = leitor.nextDouble();
            }
        }

        Aluno_2 estudante = new Aluno_2(nome, matricula, curso, disciplinas, notas);

        System.out.println("\nCadastro do(a) estudante:");
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Matrícula: " + estudante.getMatricula());
        System.out.println("Curso: " + estudante.getCurso());
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("Disciplina: " + estudante.getDisciplinas()[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println("Nota " + (j + 1) + ": " + estudante.getNotas()[i][j]);
            }

            double media = estudante.calcularMedia(i);
            System.out.println("Média: " + media);

            boolean aprovado = estudante.returnSituacao(i);
            if (aprovado == true) {
                System.out.println("Situação: Aprovado(a)");
            } else {
                System.out.println("Situação: Reprovado(a)");
            }

            System.out.println();
        }

        leitor.close();
    }
}
