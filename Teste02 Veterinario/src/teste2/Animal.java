package teste2;

public class Animal {
	private String nome;
	private String sexo;
	private Integer idade;
	private String especie;
	private boolean tratamento;
	
	//método construtor padrão
	public Animal(){
		
	}
	
	public void iniciar_tratamento() {
	tratamento = true;
	}
	
	public void finalizar_tratamento() {
		tratamento = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean getTratamento() {
		return tratamento;
	}

	public void setTratamento(boolean tratamento) {
		this.tratamento = tratamento;
	}

		
}


