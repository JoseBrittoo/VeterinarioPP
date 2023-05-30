package teste2;

public class Veterinario {
	private String nome;
	private String endereco;
	private String telefone;
	private int numeroConselho;
	private boolean consulta;
	private boolean tratamento;
	
	public Veterinario(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getNumeroConselho() {
		return numeroConselho;
	}

	public void setNumeroConselho(int numeroConselho) {
		this.numeroConselho = numeroConselho;
	}
	
		
	public boolean getConsulta() {
		return consulta;
	}

	public void setConsulta(boolean consulta) {
		this.consulta = consulta;
	}

	public boolean getTratamento() {
		return tratamento;
	}

	public void setTratamento(boolean tratamento) {
		this.tratamento = tratamento;
	}

	public void efetuar_consulta(){
		consulta = true;
		
	}
	
	public void efetuar_tratamento(){
		tratamento = true;
		
	}
	
}
