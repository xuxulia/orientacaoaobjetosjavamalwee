package br.com.senai.endereco;

public class Endereco extends Cidade {
	

	private String nomedaRua;
	private int numero;
	private String bairro;
	private String complemento;
	
	public String getNomedaRua() {
		return nomedaRua;
	}
	public void setNomedaRua(String nomedaRua) {
		this.nomedaRua = nomedaRua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	

	

}
