
public class Conta {

    protected int numero;
    protected String dono;
    protected double saldo;

    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getDono() {
        return this.dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Sacar(double saque) {
        if (saque <= this.saldo) {
            this.saldo -= saque;
        } else {
            System.out.println("Limite excedido");;
        }
    }

    public void Depositar(double deposito) {
        this.saldo += deposito;
    }

    public void write() {
        System.out.println(
                "Numero de Conta: " + numero + "\nNome: " + dono + "\nSaldo: R$" + saldo + "\n");
    }

}
