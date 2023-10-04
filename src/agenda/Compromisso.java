package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Compromisso {

	public Compromisso(String nome, String hora, String data, String local, String descricao) {

	}

	public static void main(String[] args) {

		// git é magico
		
		Integer opSelecionada = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		ArrayList<Compromisso> compromissos = new ArrayList<>();

		while (opSelecionada != 0) {

			System.out.println("- MENU -");
			System.out.println("1. CADASTRAR");
			System.out.println("2. EDITAR");
			System.out.println("3. EXCLUIR");
			System.out.println("4. VISUALIZAR ");
			System.out.println("5. SAIR ");

			opSelecionada = Integer.valueOf(sc.nextLine());

			switch (opSelecionada) {

			case 1: {
				System.out.println("Digite o nome do compromisso:");
				String nome = sc.nextLine();
				System.out.println("Digite a hora do compromisso:");
				String hora = sc.nextLine();
				float Hora = Float.valueOf(hora);
				System.out.println("Digite a data do compromisso: ");// como fazer data?
				String data = sc.nextLine();
				// conversao de tipo
				float Data = Float.valueOf(data);
				System.out.println("Digite a localizaçao do compromisso: ");
				String local = sc.nextLine();
				System.out.println("Digite a descricao do compromisso: ");
				String descricao = sc.nextLine();

				Compromisso c = new Compromisso(nome, hora, data, local, descricao);
				compromissos.add(c);
				break;

			}

			case 2: {
				System.out.println("Digite o ID para fazer a edicao:");

				// para verificar se existe precisa de um if para receber novas informaçoes
				// finalizar codigo
				break;
			}
			case 3: {
				System.out.println("Digite o ID para fazer a exclusao:");
				// precisa de um if para verificar se existe?
				// confirmar a exclusão e remover do armazenamento.
				// finalizar codigo
				break;
			}
			case 4: {
				// Saida de dados (output)
				System.out.println("Lista dos titulos dos compromissos: ");
				for (Compromisso compromisso : compromissos) {
					System.out.println("Nome: " + compromisso.getNome());
					break;
				}
			}
			case 5: {
				System.out.println("Programa Encerrado!");
				break;
			}
			default: {
				System.out.println("Opcao invalida!Tente novamente");
			}
			}
		}

		sc.close();

	}

	private String getNome() {
		return getNome();
	}

}
