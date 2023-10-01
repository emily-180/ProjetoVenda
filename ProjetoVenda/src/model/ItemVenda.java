package model;

import java.util.List;

public class ItemVenda {
	private int quantProduct;
	private double valorTotalProduct;
	private Product product;
	
	public ItemVenda(int quantProduct,  Product product) throws Exception {
		setQuantProduct(quantProduct);
		this.product = product;
		calcularValorTotalProduct();
	}
	
	public double getValorTotalProduct() {
		return valorTotalProduct;
	}

	public int getQuantProduct() {
		return quantProduct;
	}

	public Product getProduct() {
		return product;
	}
	
	public void setQuantProduct(int quantProduct) throws Exception{
		if(quantProduct<=0)
			throw new Exception("Quantidade da unidade do produto invalido.");
		this.quantProduct = quantProduct;
	}
	
	 private void calcularValorTotalProduct() {
	       valorTotalProduct = product.getValorUnitario() * quantProduct;
	 }
	
	
}
