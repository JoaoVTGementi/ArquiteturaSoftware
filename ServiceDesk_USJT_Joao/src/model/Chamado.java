package model;

import java.util.Date; 

public class Chamado {
	private int numero;
	private String descricao;
	private String status;
	private Date dataAbertura;
	private Date dataFechamento;
	private Fila fila;
	//Declaração dos chamados Status aberto ou fechado
	public static String ABERTO = "aberto";
	public static String FECHADO = "fechado";
	//numero do chamado
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Descrição do chamado
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//Sattus do chamado
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	//data da abertura
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	//Data do fechamento
	public Date getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	public Fila getFila() {
		return fila;
	}
	public void setFila(Fila fila) {
		this.fila = fila;
	}
	
	
	

}
