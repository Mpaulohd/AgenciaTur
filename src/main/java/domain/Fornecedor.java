package domain;

public class Fornecedor {
	
	private int Id;
	private String nomeFornecedor;
	private Double preco;
	
	
	public Fornecedor() {
		
	}


	public Fornecedor(int id, String nomeFornecedor, Double preco) {
		super();
		Id = id;
		this.nomeFornecedor = nomeFornecedor;
		this.preco = preco;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNomeFornecedor() {
		return nomeFornecedor;
	}


	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	
	

}

	