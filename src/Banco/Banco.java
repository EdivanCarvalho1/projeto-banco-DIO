package Banco;

import java.util.List;

public class Banco {
	private List<Conta> listaContas;
	private String nome;
	
	public List<Conta> getListaContas() {
		return listaContas;
	}
	public void setListaContas(List<Conta> listaContas) {
		this.listaContas = listaContas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
