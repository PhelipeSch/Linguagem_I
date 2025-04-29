
public class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public double calcularSalario() {
        double ret = 0;
        ret = this.salarioBase - (this.salarioBase * (this.imposto/100));
        return ret;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
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

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getImposto() {
        return imposto;
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
