package view;

import model.ItemVenda;
import model.Product;
import model.Venda;

public class Main {
	 public static void main(String[] args) {
	        try {
	            Product arroz = new Product("Arroz", 25.00);
	            Product feijao = new Product("Feijão", 10.00);

	            ItemVenda itemArroz = new ItemVenda(2, arroz);
	            ItemVenda itemFeijao = new ItemVenda(3, feijao);

	            Venda venda = new Venda();
	            
	            venda.adicionarItem(itemArroz);
	            venda.adicionarItem(itemFeijao);

	            System.out.println("Valor total da compra: R$" + venda.getValorTotal());
	        } catch (Exception e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	    }
}
