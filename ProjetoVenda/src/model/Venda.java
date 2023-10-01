package model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private double valorTotal;
	private List<ItemVenda> itens;
	
	public Venda() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemVenda item) {
        this.itens.add(item);
        calcularValorTotal();
    }

    private void calcularValorTotal() {
        valorTotal = 0;
        for (ItemVenda item : itens) {
            valorTotal += item.getValorTotalProduct();
        }
    }
	
    public double getValorTotal() {
        return valorTotal;
    }
    
    public List<ItemVenda> getItens() {
        return itens;
    }
}
