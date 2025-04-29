
public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        double dif = 0;
        dif = (this.valorCredito) - (this.valorDivida);
        return dif;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

}
