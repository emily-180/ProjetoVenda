package model;

public class Product {
	private String name;
	private double valorUnitario;
	
	public Product (String name, double valorUnitario) throws Exception{
		setName(name);
		setValorUnitario(valorUnitario);
	}
		
	public void setName(String name) throws Exception{
		if(name.equals(""))	
			throw new Exception("Nome do produto nao pode ser nulo!");
		this.name = name;
	}

	public void setValorUnitario(double valorUnitario) throws Exception{
		if(valorUnitario<=0)	
			throw new Exception("Valor do produto nao pode ser negativo!");
		this.valorUnitario = valorUnitario;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}
			
}
