package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import dao.ChamadoDAO;
import model.Chamado;
import model.Fila;

public class ChamadoService {
	ChamadoDAO dao;
	
	public ChamadoService(ChamadoDAO dao) {
		this.dao = dao;
	}
	
	public int novoChamado(Chamado chamado) throws IOException{
		chamado.setDataAbertura(new Date());
		chamado.setDataFechamento(null);
		chamado.setStatus(Chamado.ABERTO);
		
		return dao.inserirChamado(chamado);
	}
	
	public ArrayList<Chamado> listarChamadosAbertos(Fila fila) throws IOException{
		return dao.listarChamadosAbertos(fila);
	}
	//Array para listar os chamados
	public ArrayList<Chamado> listarChamados(Fila fila) throws IOException{
		return dao.listarChamados(fila);
	}
	
	public void fecharChamados(ArrayList<Integer> lista) throws IOException{
		dao.fecharChamados(lista);
	}

}
