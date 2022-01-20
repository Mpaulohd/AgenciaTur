package desafioBecaMarcosOliveira;

public class Cliente {
	
	String nomeCliente;
	String endereco;
	double valorCompra;
	
	
	public Cliente(){

}


	public Cliente(String nomeCliente, String endereco, double valorCompra) {
		super();
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.valorCompra = valorCompra;
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

	