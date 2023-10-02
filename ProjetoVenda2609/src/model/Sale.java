package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Sale {
	private Date date;
	private List<SaleItem> itens;
	
	public Sale() {
		this.date = Calendar.getInstance().getTime();
		this.itens = new ArrayList<>();
	}

	public Date getDate() {
		return date;
	}

	public List<SaleItem> getItens() {
		return itens;
	}
	
	public void addSaleItem(SaleItem item) {
		this.itens.add(item);
	}
	
	public double getTotal() {
		double total = 0;
		for(SaleItem saleItem : itens) {
			total += saleItem.getSaleItemSubTotal();
		}
		return total;
	}
}
