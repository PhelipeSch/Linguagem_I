
public class Aluno_2 {

    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notas;

    public Aluno_2(String nome, String matricula, String curso, String[] disciplinas, double[][] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notas = notas;
    }

    public double calcularMedia(int disciplina) {
        double soma = 0;

        for (int i = 0; i < notas[disciplina].length; i++) {
            soma += notas[disciplina][i];
        }

        return soma / notas[disciplina].length;
    }

    public boolean returnSituacao(int disciplina) {
        double media = calcularMedia(disciplina);

        if (media >= 7.0) {
            return true;  // Aprovado
        } else {
            return false; // Reprovado
        }
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

}
