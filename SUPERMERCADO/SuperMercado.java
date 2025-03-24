public class SuperMercado {
    public static void main(String[] args){
        
        Item i1 = new Item("001", "Kalzone quatro queijos", 1, 25.00, 0.05);
        
        Item i2 = new Item("002", "Caixa de Banana Prata", 1, 80.00, 0.02);
        
        Item i3 = new Item("003", "Refrigerante Pepsi Cola", 2, 12.00, 0.04);
        
        Item i4 = new Item("004", "Barraca de Camping", 1, 150.00, 0.10);
        
        double total = i1.CalculaValorTotal()+i2.CalculaValorTotal()+i3.CalculaValorTotal()+i4.CalculaValorTotal();
        
        System.out.println("CUPOM FISCAL");
        System.out.println("");
        System.out.println("Codigo"+"\t"+"Descricao"+"\t"+"\t"+ "Quantidade" + "\t" + "Valor Unitario" + "\t" + "Desconto"+ "\t" + "Valor Total");
        System.out.println(i1.getCodigo() +"\t"+ i1.getDescricao() +"\t"+"\t"+ i1.getQuantidade() +"\t"+ i1.getPreco_Unitario() +"\t"+"\t"+ i1.getDesconto() +"\t"+"\t"+i1.CalculaValorTotal());
        System.out.println(i2.getCodigo() +"\t"+ i2.getDescricao() +"\t"+"\t"+ i2.getQuantidade() +"\t"+ i2.getPreco_Unitario() +"\t"+"\t"+ i2.getDesconto()+"\t"+"\t"+i2.CalculaValorTotal());
        System.out.println(i3.getCodigo() +"\t"+ i3.getDescricao() +"\t"+"\t"+ i3.getQuantidade() +"\t"+ i3.getPreco_Unitario() +"\t"+"\t"+ i3.getDesconto()+"\t"+"\t"+i3.CalculaValorTotal());
        System.out.println(i4.getCodigo() +"\t"+ i4.getDescricao() +"\t"+"\t"+ i4.getQuantidade() +"\t"+ i4.getPreco_Unitario() +"\t"+"\t"+ i4.getDesconto()+"\t"+"\t"+i4.CalculaValorTotal());
        System.out.println("Valor Total: "+total);
        
       i1.setPreco_Unitario(35);
       i2.setPreco_Unitario(90);
       i3.setPreco_Unitario(22);
       i4.setPreco_Unitario(260);
       
       total = i1.CalculaValorTotal()+i2.CalculaValorTotal()+i3.CalculaValorTotal()+i4.CalculaValorTotal();
        
        System.out.println("CUPOM FISCAL ATUALIZADO");
        System.out.println("");
        System.out.println("Codigo"+"\t"+"Descricao"+"\t"+"\t"+ "Quantidade" + "\t" + "Valor Unitario" + "\t" + "Desconto"+ "\t" + "Valor Total");
        System.out.println(i1.getCodigo() +"\t"+ i1.getDescricao() +"\t"+"\t"+ i1.getQuantidade() +"\t"+ i1.getPreco_Unitario() +"\t"+"\t"+ i1.getDesconto() +"\t"+"\t"+i1.CalculaValorTotal());
        System.out.println(i2.getCodigo() +"\t"+ i2.getDescricao() +"\t"+"\t"+ i2.getQuantidade() +"\t"+ i2.getPreco_Unitario() +"\t"+"\t"+ i2.getDesconto()+"\t"+"\t"+i2.CalculaValorTotal());
        System.out.println(i3.getCodigo() +"\t"+ i3.getDescricao() +"\t"+"\t"+ i3.getQuantidade() +"\t"+ i3.getPreco_Unitario() +"\t"+"\t"+ i3.getDesconto()+"\t"+"\t"+i3.CalculaValorTotal());
        System.out.println(i4.getCodigo() +"\t"+ i4.getDescricao() +"\t"+"\t"+ i4.getQuantidade() +"\t"+ i4.getPreco_Unitario() +"\t"+"\t"+ i4.getDesconto()+"\t"+"\t"+i4.CalculaValorTotal());
        System.out.println("Valor Total: "+total);
    }
}
