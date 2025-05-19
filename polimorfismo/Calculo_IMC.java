
import java.util.Scanner;

public class Calculo_IMC {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Digite [1] se voce quer criar um Homem");
            System.out.println("Digite [2] se voce quer criar uma Mulher");
            System.out.println("Digite [3] para sair");
            int op = leitor.nextInt();

            if (op == 3) {
                break;
            } else {
                if (op == 2) {
                    System.out.println("Digite os dados do objeto a ser gerado: ");
                    String vazia = leitor.nextLine();
                    System.out.println("Nome: ");
                    String nome = leitor.nextLine();
                    System.out.println("Data de nascimento: ");
                    String dataNasc = leitor.nextLine();
                    System.out.println("Altura (em metros): ");
                    double altura = leitor.nextDouble();
                    System.out.println("Peso (em Kg): ");
                    double peso = leitor.nextDouble();
                    Mulher m1 = new Mulher (peso, altura, nome, dataNasc);
                    m1.toString();

                } else {
                    System.out.println("Digite os dados do objeto a ser gerado: ");
                    String vazia = leitor.nextLine();
                    System.out.println("Nome: ");
                    String nome = leitor.nextLine();
                    System.out.println("Data de nascimento: ");
                    String dataNasc = leitor.nextLine();
                    System.out.println("Altura (em metros): ");
                    double altura = leitor.nextDouble();
                    System.out.println("Peso (em Kg): ");
                    double peso = leitor.nextDouble();
                }
            }

        }
    }
}
