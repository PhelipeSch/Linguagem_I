import java.util.Scanner;

public class Ensino {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Degite o nome do aluno: ");
        String nome = leitor.nextLine();
        
        System.out.println("Digite a matricula do aluno: ");
        String matricula = leitor.nextLine();
        
        System.out.println("Digite o curso do aluno: ");
        String curso = leitor.nextLine();
        
        System.out.println("Digite 3 disciplina do aluno: ");
        String disciplinas[] = new String[3];
        
        for (int i = 0; i < 3; i++) {
            String disciplina = leitor.nextLine();
            disciplinas[i] = disciplina;
        }
        
        System.out.println("Digite as notas da primeira disciplina");
        double notas1[] = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i+1));
            double nota = leitor.nextDouble();
            notas1[i] = nota;
        }
        System.out.println("Digite as notas da segunda disciplina");
        double notas2[] = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i+1));
            double nota = leitor.nextDouble();
            notas2[i] = nota;
        }
        System.out.println("Digite as notas da terceira disciplina");
        double notas3[] = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i+1));
            double nota = leitor.nextDouble();
            notas3[i] = nota;
        }
        
        Aluno estudante = new Aluno();
        
        estudante.setNome(nome);
        estudante.setMatricula(matricula);
        estudante.setCurso(curso);
        estudante.setDisciplinas(disciplinas);
        estudante.setNotas1(notas1);
        estudante.setNotas2(notas2);
        estudante.setNotas3(notas3);
        
        System.out.println("Cadastro do(a) estudante "+estudante.getNome());
        System.out.println("Nome:"+estudante.getNome());
        System.out.println("Matricula:"+estudante.getMatricula());
        
        for(int i =0; i < 3; i++){
            int ind = i+1;
            String sit = "";
            boolean res = estudante.returnSituacao(ind);
            System.out.println("Notas da disciplina de " + disciplinas[i]);
            
            for(int j =0; j < 4; j++){
                if(ind == 1){
                    System.out.println("Nota "+(j+1)+": "+notas1[j]);
                }else{
                    if(ind == 2){
                        System.out.println("Nota "+(j+1)+": "+notas2[j]);
                    }else{
                        System.out.println("Nota "+(j+1)+": "+notas3[j]);
                    }
                }
            }
            System.out.println("Media de "+disciplinas[i]+" :"+estudante.calcularMedia(ind));
            if(res == false){
                sit = "Reprovado(a)";
            }else{
                sit = "Aprovado(a)";
            }
            System.out.println("O (A) estudante esta " + sit);
        }
    }
}


