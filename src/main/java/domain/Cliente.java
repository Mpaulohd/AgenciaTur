package domain;

public class Cliente {
	private int Id;
	private String nomeCliente;
	private String endereco;
	private double valorCompra;
	
	
	public Cliente(){

}


	public Cliente(int id, String nomeCliente, String endereco, double valorCompra) {
		super();
		Id = id;
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.valorCompra = valorCompra;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public double getValorCompra() {
		return valorCompra;
	}


	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	
	
	
}

	