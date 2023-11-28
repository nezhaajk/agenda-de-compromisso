package modelo;

import java.util.ArrayList;


public interface IAgendaDAO {
	
	public boolean inserir(Compromisso p);

	public boolean alterar(int indice, Compromisso novoCompromisso);

	public boolean excluir(int indice);

	public ArrayList<Compromisso> listarCompromissos();
}
