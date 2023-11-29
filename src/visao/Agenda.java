package visao;

import java.util.List;
import java.util.Scanner;

import controle.AgendaDAO;
import modelo.Compromisso;

public class Agenda {
	private static AgendaDAO aDAO = AgendaDAO.getInstancia();
	static int i;

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("----------------------------------------");
			System.out.println("Menu:");
			System.out.println("1. Adicionar compromisso");
			System.out.println("2. Editar compromisso");
			System.out.println("3. Excluir compromisso");
			System.out.println("4. Visualizar compromissos");
			System.out.println("5. Encerrar programa");
			System.out.print("Escolha uma opção: \n");
			System.out.println("----------------------------------------");

			int escolha = scanner.nextInt();
			scanner.nextLine();

			switch (escolha) {
			case 1:
				System.out.println("----------------------------------------");
				System.out.print("Nome: ");
				String nome = scanner.nextLine();
				System.out.print("Data: ");
				String data = scanner.nextLine();
				System.out.print("Hora: ");
				String hora = scanner.nextLine();
				System.out.print("Localização: ");
				String localizacao = scanner.nextLine();
				System.out.print("Descrição: ");
				String descricao = scanner.nextLine();
				System.out.println("----------------------------------------");

				Compromisso novoCompromisso = new Compromisso(nome, data, hora, localizacao, descricao);
				aDAO.inserir(novoCompromisso);
				System.out.println("Compromisso cadastrado com sucesso!");
				break;

			case 2:
				i = 0;
				List<Compromisso> compromissos = aDAO.listarCompromissos();

				for (Compromisso compromisso : compromissos) {
					System.out.println("\nCompromisso - " + i + ":");
					System.out.println(compromisso.getNome());
					System.out.println(compromisso.getData());
					System.out.println(compromisso.getHora());
					System.out.println(compromisso.getLocalizacao());
					System.out.println(compromisso.getDescricao());
					i++;
				}

				System.out.print("Digite o número do compromisso que deseja editar: ");
				int indiceEditar = scanner.nextInt();
				scanner.nextLine();

				if (indiceEditar >= 0 && indiceEditar < compromissos.size()) {
					System.out.println("----------------------------------------");
					System.out.print("Alterar nome: ");
					nome = scanner.nextLine();
					System.out.print("Alterar data: ");
					data = scanner.nextLine();
					System.out.print("Alterar hora: ");
					hora = scanner.nextLine();
					System.out.print("Alterar localização: ");
					localizacao = scanner.nextLine();
					System.out.print("Alterar descrição: ");
					descricao = scanner.nextLine();
					System.out.println("Compromisso editado com sucesso!");
					System.out.println("----------------------------------------");

					novoCompromisso = new Compromisso(nome, data, hora, localizacao, descricao);
					aDAO.alterar(indiceEditar, novoCompromisso);
				} else {
					System.out.println("Índice inválido. Nenhuma alteração realizada.");
				}
				break;

			case 3:
				aDAO.listarCompromissos();
				System.out.print("Digite o número do compromisso que deseja excluir: ");
				int indiceExcluir = scanner.nextInt();
				scanner.nextLine();

				if (indiceExcluir >= 0 && indiceExcluir < aDAO.listarCompromissos().size()) {
					aDAO.excluir(indiceExcluir);
					System.out.println("Compromisso excluído com sucesso!");
				} else {
					System.out.println("Índice inválido.");
				}
				break;

			case 4:
				aDAO.listarCompromissos();
				i = 0;
				for (Compromisso compromisso : aDAO.listarCompromissos()) {
					System.out.println("----------------------------------------");
					System.out.println("Compromisso - " + i + "");
					System.out.println(compromisso.getNome());
					System.out.println(compromisso.getData());
					System.out.println(compromisso.getHora());
					System.out.println(compromisso.getLocalizacao());
					System.out.println(compromisso.getDescricao());
					System.out.println("----------------------------------------");
					i++;

				}
				break;

			case 5:
				System.out.println("Encerrando o programa...");
				scanner.close();
				System.exit(0);

			default:
				System.out.println("OPÇÃO INVÁLIDA! Tente novamente.");
				break;
			}
		}
	}

}
