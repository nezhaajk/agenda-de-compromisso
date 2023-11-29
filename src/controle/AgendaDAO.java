package controle;

import java.util.ArrayList; //importa a classe array

import modelo.Compromisso;
import modelo.IAgendaDAO;

public class AgendaDAO implements IAgendaDAO {

	private static ArrayList<Compromisso> compromissos = new ArrayList<>();

	private static AgendaDAO instancia;

	public static AgendaDAO getInstancia() { //o método verifica se a instância já foi criada se não cria uma nova instância e retorna; se já existe, retorna a instância existente.

		if (instancia == null) {
			instancia = new AgendaDAO();
			compromissos = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Compromisso c) {
		compromissos.add(c);
		System.out.println("Compromisso cadastrado com sucesso!");
		return false;
	}

	@Override
	public boolean alterar(int indice, Compromisso novoCompromisso) {
		if (indice >= 0 && indice < compromissos.size()) {
			compromissos.set(indice, novoCompromisso);
			System.out.println("Compromisso editado com sucesso!");
			return true;
		} else {
			System.out.println("Índice inválido. Nenhum compromisso foi editado.");
			return false;
		}

	}

	@Override
	public boolean excluir(int indice) {
		if (indice >= 0 && indice < compromissos.size()) {
			compromissos.remove(indice);
			System.out.println("Compromisso excluído com sucesso!");
			return true;
		} else {
			System.out.println("Índice inválido. Nenhum compromisso foi excluído.");
			return false;
		}

	}

	@Override
	public ArrayList<Compromisso> listarCompromissos() {
		// TODO Auto-generated method stub
		return compromissos;
	}

}
