package domain;

public class Venda {
	private int Id;
	private double valorVenda;
	private String servico;
	private String NomeVendedor;
	

	
	public Venda() {
		
	}



	public Venda(int id, double valorVenda, String servico, String nomeVendedor) {
		super();
		Id = id;
		this.valorVenda = valorVenda;
		this.servico = servico;
		NomeVendedor = nomeVendedor;
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public double getValorVenda() {
		return valorVenda;
	}



	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}



	public String getServico() {
		return servico;
	}



	public void setServico(String servico) {
		this.servico = servico;
	}



	public String getNomeVendedor() {
		return NomeVendedor;
	}



	public void setNomeVendedor(String nomeVendedor) {
		NomeVendedor = nomeVendedor;
	}



	
	
	
}
