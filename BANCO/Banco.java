
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /*
        System.out.println("Digite o codigo da conta que deseja cadastrar: ");
        int cod1 = leitor.nextInt();

        System.out.println("Digite o nome do Titular da conta:");
        String nome1 = leitor.next();

        System.out.println("Digite o saldo da conta do cliente " + nome1 + ": ");
        double saldo1 = leitor.nextDouble();

        Conta cliente_1 = new Conta(cod1, nome1, saldo1);

        System.out.println("Digite o codigo da conta que deseja cadastrar: ");
        int cod2 = leitor.nextInt();

        System.out.println("Digite o nome do Titular da conta:");
        String nome2 = leitor.next();

        System.out.println("Digite o saldo da conta do cliente " + nome2 + ": ");
        double saldo2 = leitor.nextDouble();

        Conta cliente_2 = new Conta(cod2, nome2, saldo2);

        System.out.println(cliente_1.getSaldo());
        System.out.println(cliente_2.getSaldo());

        System.out.println("Digite o valor que deseja sacar da conta do cliente " + cliente_1.getDono() + ": ");
        double saque = leitor.nextDouble();
        cliente_1.Sacar(saque);
        System.out.println("Digite o valor que deseja depositar na conta do cliente " + cliente_1.getDono() + ": ");
        double depos = leitor.nextDouble();
        cliente_1.Depositar(depos);

        System.out.println("Digite o valor que deseja sacar da conta do cliente " + cliente_2.getDono() + ": ");
        double saque2 = leitor.nextDouble();
        cliente_2.Sacar(saque2);
        System.out.println("Digite o valor que deseja depositar na conta do cliente " + cliente_2.getDono() + ": ");
        double depos2 = leitor.nextDouble();
        cliente_2.Depositar(depos2);

        cliente_1.write();
        cliente_2.write();
         */

        
        ContaCorrente c3 = new ContaCorrente(003, "Matheus", 1500, 70);
        System.out.println("Digite o valor para sacar da conta do cliente");
        double saque = leitor.nextDouble();
        c3.Sacar(saque);
        c3.write();
    }
}
