
abstract class Pessoa_IMC extends Pessoa {

    protected double peso;
    protected double altura;

    public Pessoa_IMC(double peso, double altura, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    public double calculaIMC(double altura, double peso) {
        double imc = peso / (Math.pow(altura, 2));
        return imc;
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "Data de Nascimento: " + dataNascimento
                + "\n" + "Peso: " + peso + "\n" + "Altura: " + altura+ "\n" + "Resultado IMC: " + resultIMC();
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
