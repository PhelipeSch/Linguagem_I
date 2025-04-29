
public class SitemaPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Henrique", "Rua Campos Salles, 14", "2510-4099");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Endereco: " + p1.getEndereco());
        System.out.println("Telefone: " + p1.getTelefone());
        System.out.println("");

        p1.setNome("Pedro");
        p1.setEndereco("Rua America, 178");
        p1.setTelefone("3712-2691");

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Endereco: " + p1.getEndereco());
        System.out.println("Telefone: " + p1.getTelefone());
        System.out.println("");

        Fornecedor f1 = new Fornecedor("Maria", "Rua Getulio Vargas, 55", "3512-5544", 5000.00, 1500.00);

        System.out.println("Nome: " + f1.getNome());
        System.out.println("Endereco: " + f1.getEndereco());
        System.out.println("Telefone: " + f1.getTelefone());
        System.out.println("Credito: " + f1.getValorCredito());
        System.out.println("Divida: " + f1.getValorDivida());
        System.out.println("Saldo: " + f1.obterSaldo());
        System.out.println("");

        Empregado e1 = new Empregado("Jose", "Avenida Do Patrocinio, 799", "5231-7563", 23, 2500.00, 15.0);

        System.out.println("Nome: " + e1.getNome());
        System.out.println("Endereco: " + e1.getEndereco());
        System.out.println("Telefone: " + e1.getTelefone());
        System.out.println("Codigo do Setor:: " + e1.getCodigoSetor());
        System.out.println("Salario Base: " + e1.getSalarioBase());
        System.out.println("Imposto: " + e1.getImposto() + "%");
        System.out.println("Salario Final: " + e1.calcularSalario());

    }
}
