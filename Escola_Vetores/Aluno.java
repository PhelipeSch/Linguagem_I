public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String disciplinas[];
    private double notas1[];
    private double notas2[];
    private double notas3[];

    public Aluno() {
        this.nome = "";
        this.matricula = "";
        this.curso = "";
        this.disciplinas = new String[3];
        this.notas1 = new double[4];
        this.notas2 = new double[4];
        this.notas3 = new double[4];
    }

    public double calcularMedia(int disciplina) {
        double soma = 0;
        double media = 0;

        if (disciplina == 1) {

            for (int i = 0; i < notas1.length; i++) {
                soma += notas1[i];
            }
            media = soma / notas1.length;

        } else {

            if (disciplina == 2) {

                for (int i = 0; i < notas2.length; i++) {
                    soma += notas2[i];
                }
                media = soma / notas2.length;

            } else {
                for (int i = 0; i < notas3.length; i++) {
                    soma += notas3[i];
                }
                media = soma / notas3.length;
            }
        }

        return media;
    }

    public boolean returnSituacao(int disciplina) {
        boolean situacao = false;
        double media = calcularMedia(disciplina);

        if (media >= 7.0) {
            situacao = true;
        } else {
            situacao = false;
        }
        return situacao;
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

    public double[] getNotas1() {
        return notas1;
    }

    public double[] getNotas2() {
        return notas2;
    }

    public double[] getNotas3() {
        return notas3;
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

    public void setNotas1(double[] notas1) {
        this.notas1 = notas1;
    }

    public void setNotas2(double[] notas2) {
        this.notas2 = notas2;
    }

    public void setNotas3(double[] notas3) {
        this.notas3 = notas3;
    }

}
