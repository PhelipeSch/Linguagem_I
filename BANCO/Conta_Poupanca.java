
public class Conta_Poupanca extends Conta {

    private double juros;

    public Conta_Poupanca(int numero, String dono, double saldo, double juros) {
        super(numero, dono, saldo);
        this.juros = juros;
    }
    
    public double calcJuros (){
        double juros = getJuros();
        saldo += juros;
        return saldo;
    }

    public double getJuros() {
        return this.juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
