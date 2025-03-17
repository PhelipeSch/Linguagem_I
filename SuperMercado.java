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
        System.out.println(i1.codigo +"\t"+ i1.descricao +"\t"+"\t"+ i1.quantidade +"\t"+ i1.preco_unitario +"\t"+"\t"+ i1.desconto+"\t"+"\t"+i1.CalculaValorTotal());
        System.out.println(i2.codigo +"\t"+ i2.descricao +"\t"+"\t"+ i2.quantidade +"\t"+ i2.preco_unitario +"\t"+"\t"+ i2.desconto+"\t"+"\t"+i2.CalculaValorTotal());
        System.out.println(i3.codigo +"\t"+ i3.descricao +"\t"+"\t"+ i3.quantidade +"\t"+ i3.preco_unitario +"\t"+"\t"+ i3.desconto+"\t"+"\t"+i3.CalculaValorTotal());
        System.out.println(i4.codigo +"\t"+ i4.descricao +"\t"+"\t"+ i4.quantidade +"\t"+ i4.preco_unitario +"\t"+"\t"+ i4.desconto+"\t"+"\t"+i4.CalculaValorTotal());
        System.out.println("Valor Total: "+total);
    }
}
