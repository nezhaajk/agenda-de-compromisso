package modelo;

public class Compromisso {
	
	private String nome;
	private String data;
	private String hora;
	private String descricao;
	private String localizacao;
	
	public Compromisso(String nome, String data, String hora, String descricao, String localizacao) {
		this.nome = nome;
		this.data = data;
		this.hora = hora;
		this.descricao = descricao;
		this.localizacao = localizacao;

	}
	public Compromisso() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
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
	
