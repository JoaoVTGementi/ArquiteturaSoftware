package model;

public class Fila {
	
	
	//*****PARAMETROS DA FILA, ID E NOME
	private int idfila;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdfila() {
		return idfila;
	}

	public void setIdfila(int idfila) {
		this.idfila = idfila;
	}
	
	@Override
	public String toString() {
		return "Fila [id= " + idfila +", nome=" + nome + "]";		
	}

	
}
