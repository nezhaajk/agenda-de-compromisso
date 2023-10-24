package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	private ArrayList<Compromisso> compromissos = new ArrayList<>();

	public void adicionarCompromisso(Compromisso compromisso) {
		compromissos.add(compromisso);
		System.out.println("Compromisso adicionado com sucesso!");
	}

	public void editarCompromisso(int indice, Compromisso novoCompromisso) {
		if (indice >= 0 && indice < compromissos.size()) {
			compromissos.set(indice, novoCompromisso);
			System.out.println("Compromisso editado com sucesso!");
		} else {
			System.out.println("Índice inválido. Nenhum compromisso foi editado.");
		}
	}

	public void excluirCompromisso(int indice) {
		if (indice >= 0 && indice < compromissos.size()) {
			compromissos.remove(indice);
			System.out.println("Compromisso excluído com sucesso!");
		} else {
			System.out.println("Índice inválido. Nenhum compromisso foi excluído.");
		}
	}

	public void visualizarCompromissos() {
		if (compromissos.isEmpty()) {
			System.out.println("A agenda está vazia.");
		} else {
			for (int i = 0; i < compromissos.size(); i++) {
				System.out.println("Compromisso #" + (i + 1) + ":\n" + compromissos.get(i));

			}
		}
	}

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Adicionar compromisso");
			System.out.println("2. Editar compromisso");
			System.out.println("3. Excluir compromisso");
			System.out.println("4. Visualizar compromissos");
			System.out.println("5. Encerrar programa");
			System.out.print("Escolha uma opção: ");

			int escolha = scanner.nextInt();
			scanner.nextLine();

			switch (escolha) {
			case 1:
				System.out.print("Nome: ");
				String nome = scanner.nextLine();
				System.out.print("Data: ");
				String data = scanner.nextLine();
				System.out.print("Hora: ");
				String hora = scanner.nextLine();
				System.out.print("Descrição: ");
				String descricao = scanner.nextLine();
				System.out.print("Localização: ");
				String localizacao = scanner.nextLine();

				Compromisso novoCompromisso = new Compromisso(nome, data, hora, descricao, localizacao);
				agenda.adicionarCompromisso(novoCompromisso);
				break;

			case 2:
				agenda.visualizarCompromissos();
				System.out.print("Digite o índice do compromisso que deseja editar: ");
				int indiceEditar = scanner.nextInt();
				scanner.nextLine();

				System.out.print("Nome: ");
				nome = scanner.nextLine();
				System.out.print("Data: ");
				data = scanner.nextLine();
				System.out.print("Hora: ");
				hora = scanner.nextLine();
				System.out.print("Descrição: ");
				descricao = scanner.nextLine();
				System.out.print("Localização: ");
				localizacao = scanner.nextLine();

				novoCompromisso = new Compromisso(nome, data, hora, descricao, localizacao);
				agenda.editarCompromisso(indiceEditar - 1, novoCompromisso);
				break;

			case 3:
				agenda.visualizarCompromissos();
				System.out.print("Digite o número do compromisso que deseja excluir: ");
				int indiceExcluir = scanner.nextInt();
				scanner.nextLine();

				agenda.excluirCompromisso(indiceExcluir - 1);
				break;

			case 4:
				agenda.visualizarCompromissos();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;

			case 5:
				System.out.println("Encerrando o programa.");
				scanner.close();
				System.exit(0);

			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		}
	}

}
