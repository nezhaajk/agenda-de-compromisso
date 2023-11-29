package modelo;

import java.util.ArrayList;

public interface IAgendaDAO {

	public boolean inserir(Compromisso p);//adiciona um compromisso a lista

	public boolean alterar(int indice, Compromisso novoCompromisso);//altera um compromisso na lista a partir do índice selecionado

	public boolean excluir(int indice); //exclui um compromisso na lista a partir do índice selecionado

	public ArrayList<Compromisso> listarCompromissos(); //retorna a lista de compromissos
}
