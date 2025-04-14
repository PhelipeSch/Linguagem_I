
public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, String dono, double saldo, double limite) {
        super(numero, dono, saldo);
        this.limite = limite;
    }

    public void Sacar(double saque) {
        if(saque <= (this.saldo + this.limite)) {
            this.saldo -= saque;
        } else {
            System.out.println("Limite excedido");;
        }
    }
    
    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
