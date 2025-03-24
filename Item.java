public class Item {
    //atributos privados
    private String codigo;
    private String descricao;
    private int quantidade;
    private double preco_unitario;
    private double desconto;
    
    //métodos públicos
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
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public double getPreco_Unitario(){
        return this.preco_unitario;
    }
    
    public double getDesconto(){
        return this.desconto;
    }
    
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public void setPreco_Unitario(int preco_unitario){
        this.preco_unitario = preco_unitario;
    }
    
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }
}