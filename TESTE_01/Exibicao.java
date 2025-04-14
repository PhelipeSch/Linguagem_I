
import java.util.Scanner;

public class Exibicao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeros[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Digite um numero inteiro para sabermos sua tabuada ate o 10: ");
        int num = leitor.nextInt();

        Tabuada teste = new Tabuada(num, numeros);

        System.out.println(teste.tipoTab());
        teste.tab();
        teste.write();
    }

}
