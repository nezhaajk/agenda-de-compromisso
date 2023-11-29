package modelo;

public class Compromisso {

	private String nome;
	private String data;
	private String hora;
	private String localizacao;
	private String descricao;

	public Compromisso(String nome, String data, String hora, String localizacao,  String descricao) {
		this.nome = nome;
		this.data = data;
		this.hora = hora;
		this.localizacao = localizacao;
		this.descricao = descricao;
		
		//OS atributo tem get e set que permite acessar e modificar os atributos
		// this diferencia atributo e paramentro da classe
	}

	public Compromisso() {

	}

	public String getNome() {  //retorna valor de nome
		return nome;
	}

	public void setNome(String nome) { //define valor de nome
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocalizacao() {
		return localizacao;
	}
}
