
public class Homem extends Pessoa_IMC {

    public Homem(double peso, double altura, String nome, String dataNascimento) {
        super(peso, altura, nome, dataNascimento);
    }

    public String resultIMC(double peso, double altura) {
        double imc = calculaIMC(altura, peso);
        if (imc < 20.7) {
            return "Abaixo do peso ideal";
        } else {
            if (imc > 26.4) {
                return "Acima do peso ideal";
            } else {
                return "Peso ideal";
            }
        }
    }
}
