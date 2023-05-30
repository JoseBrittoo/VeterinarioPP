package teste2;

public class DonoDoAnimal {
	private String nome;
	private String endereco;
	private String telefone;
	private boolean consulta;
	private boolean tratamento;
	private boolean consultaPaga;
	private boolean tratamentoPago;

	public DonoDoAnimal() {

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

	public boolean getConsultaPaga() {
		return consultaPaga;
	}

	public void setConsultaPaga(boolean consultaPaga) {
		this.consultaPaga = consultaPaga;
	}

	public boolean getTratamentoPago() {
		return tratamentoPago;
	}

	public void setTratamentoPago(boolean tratamentoPago) {
		this.tratamentoPago = tratamentoPago;
	}

	public void marcar_consulta() {
		consulta = true;
	}

	public void marcar_tratamento() {
		tratamento = true;
	}

	public void pagar_consulta() {

		consultaPaga = true;
	}

	public void pagar_tratamento() {
		tratamentoPago = true;

	}

}
