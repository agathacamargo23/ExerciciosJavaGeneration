package Exepolimorfismo;

//Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá/
//trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
//programa deverá atender as seguintes funcionalidades:
//Armazenar dados da List
//Remover dados da list;
//Atualizar dados da list.
//Apresentar todos os dados da list.

public class Exe03Loja {
	
	private String produtos;
	private int dados;
	
	
    public Exe03Loja(String produtos, int dados) {
		super();
		this.produtos = produtos;
		this.dados = dados;
	}
	
	
	public String getProdutos() {
		return produtos;
	}
	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	public int getDados() {
		return dados;
	}
	public void setDados(int dados) {
		this.dados = dados;
	}
	@Override
	public String toString() {
		return "Exe03Loja [produtos=" + produtos + ", dados=" + dados + "]";
	}

	
}
