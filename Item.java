public class Item {
    String codigo;
    String descricao;
    int quantidade;
    double preco_unitario;
    double desconto;
    
    public Item(String codigo, String descricao, int quantidade, double preco_unitario, double desconto){
       this.codigo = codigo;
       this.descricao = descricao;
       this.quantidade = quantidade;
       this.preco_unitario = preco_unitario;
       this.desconto = desconto;
    }
    
    public double CalculaValorTotal(){
        double total = (this.quantidade*this.preco_unitario);
        double Vdesconto = (this.desconto * total);
        double Vfinal = (total - Vdesconto);
        return Vfinal;
    }
}