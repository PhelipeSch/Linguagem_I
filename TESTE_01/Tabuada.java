
public class Tabuada {

    private int numero;
    private int numeros[];

    public Tabuada(int numero, int[] numeros) {
        this.numero = numero;
        this.numeros = numeros;
    }

    public String tipoTab() {
        int num = getNumero();
        String res = "";

        if (num < 4) {
            res = "Tabuada de numeros pequenos";
        } else {
            if (num < 10) {
                res = "Tabuada de numeros medios";
            } else {
                res = "Tabuada de numeros grandes";
            }
        }
        return res;
    }

    public void tab() {
        int mult = getNumero();

        for (int i = 0; i < 10; i++) {
            numeros[i] = mult * (i + 1);
        }
    }

    public void write() {
        int mult = getNumero();
        for (int i = 0; i < 10; i++) {
            System.out.println("Resultado da operacao: " + (i + 1) + " x " + mult + " = " + numeros[i]);
        }
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int getNumero() {
        return numero;
    }

    public int[] getNumeros() {
        return numeros;
    }

}
