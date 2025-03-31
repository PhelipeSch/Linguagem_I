
public class Aluno {

    private String codigo;
    private String nome;
    private int ano_nasc;
    private int mes_nasc;
    private int dia_nasc;
    private double nota1;
    private double nota2;
    //Data Referência: 01/04/2025

    public Aluno(String codigo, String nome, int ano_nasc, int mes_nasc, int dia_nasc, double nota1, double nota2) {
        this.codigo = codigo;
        this.nome = nome;
        this.ano_nasc = ano_nasc;
        this.mes_nasc = mes_nasc;
        this.dia_nasc = dia_nasc;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int calcAnos() {
        int anos;
        if (this.mes_nasc <= 4) {
            anos = (2025 - this.ano_nasc);
        } else {
            anos = (2024 - this.ano_nasc);
        }
        return anos;
    }

    public int calcMeses() {
        int ano_ref = 2025;
        int mes_ref = 4;

        int ano_meses = (ano_ref - ano_nasc) * 12;
        int dif_meses = mes_ref - mes_nasc;

        return ano_meses + dif_meses;
    }

    public double calcMedia(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public void write() {
        System.out.println(
                "Codigo: " + codigo
                + "\nNome: " + nome
                + "\nAno do nascimento: " + ano_nasc
                + "\nMes do nascimento: " + mes_nasc
                + "\nDia do nascimento: " + dia_nasc
                + "\nNota 1: " + nota1
                + "\nNota 2: " + nota2
                + "\nAnos de vida: " + calcAnos()
                + "\nMeses de vida: " + calcMeses()
                + "\nMedia: " + calcMedia(nota1, nota2) + "\n");
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAno_nasc() {
        return this.ano_nasc;
    }

    public int getMes_nasc() {
        return this.mes_nasc;
    }

    public int getDia_nasc() {
        return this.dia_nasc;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno_nasc(int ano_nasc) {
        this.ano_nasc = ano_nasc;
    }

    public void setMes_nasc(int mes_nasc) {
        this.mes_nasc = mes_nasc;
    }

    public void setDia_nasc(int dia_nasc) {
        this.dia_nasc = dia_nasc;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

}
