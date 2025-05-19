
public class Mulher extends Pessoa_IMC {

    public Mulher(double peso, double altura, String nome, String dataNascimento) {
        super(peso, altura, nome, dataNascimento);
    }

    public String resultIMC(double peso, double altura) {
        double imc = calculaIMC(altura, peso);
        if (imc < 19) {
            return "Abaixo do peso ideal";
        } else {
            if (imc > 25.8) {
                return "Acima do peso ideal";
            } else {
                return "Peso ideal";
            }
        }
    }
}
