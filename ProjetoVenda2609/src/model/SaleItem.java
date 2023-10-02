package model;

public class SaleItem {
	private Product product;
	private int amount;
	
	public SaleItem(Product p, int amount) {
		this.product = p;
		this.amount = amount;
	}

	public Product getProduct() {
		return product;
	}

	public int getAmount() {
		return amount;
	}
	
	public double getSaleItemSubTotal() {
		return amount * this.product.getPrice();
	}
}
