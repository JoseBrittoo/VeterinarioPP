package teste2;


	public class Principal {

	public static void main(String[] args) {
		
		DonoDoAnimal b = new DonoDoAnimal();
		b.setNome("Fulano");
		b.setEndereco("Rua xyz, casa 1000, Coroado");
		b.setTelefone("8230-5689");
		b.marcar_consulta();
		b.pagar_consulta();
		b.marcar_tratamento();
		b.pagar_tratamento();
		
		
		Animal a = new Animal();
		
		a.setEspecie("Poodle");
		a.setIdade(2);
		a.setNome("Gabb");
		a.setSexo("femea");
		
		// iniciar o tratamento
		a.iniciar_tratamento();
		
		Animal d = new Animal();
		
		d.setEspecie("Pastor Alemão");
		d.setIdade(3);
		d.setNome("Edu");
		d.setSexo("femea");
		d.iniciar_tratamento();
		
		Veterinario c = new Veterinario();
		c.setNome("Antonio Silva");
		c.setNumeroConselho(1223);
		c.setEndereco("Av. Darci Vagas, 214");
		c.setTelefone("98212-2323");
		
		c.efetuar_consulta();
		c.efetuar_tratamento();
		
		System.out.println("---------------DONO DO ANIMAL ---------------------");
		
		System.out.println("Nome do dono do animal: "+b.getNome());
		System.out.println("Endereço: "+b.getEndereco());
		System.out.println("Telefone: "+b.getTelefone());
		
		if ((b.getConsultaPaga()) && (b.getTratamentoPago())) {
			System.out.println("A consulta e o tratamento foi paga logo o animal sera curado");
		}else
		{
			System.out.println("O animal nao esta em tratamento");
		}	
		
		System.out.println("--------------- ANIMAL ---------------------");
		
		System.out.println("Nome do pet: "+a.getNome());
		System.out.println("Especie do animal: "+a.getEspecie());
		System.out.println("Idade do animal: "+a.getIdade());
		System.out.println("Sexo do animal: "+a.getSexo());
		
		if (a.getTratamento()){
			System.out.println("O animal esta em tratamento");
		}else
		{
			System.out.println("O animal nao esta em tratamento");
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println("Nome do pet: "+d.getNome());
		System.out.println("Especie do animal: "+d.getEspecie());
		System.out.println("Idade do animal: "+d.getIdade());
		System.out.println("Sexo do animal: "+d.getSexo());
		
		if (d.getTratamento()){
			System.out.println("O animal esta em tratamento");
		}else
		{
			System.out.println("O animal nao esta em tratamento");
		}
		
		System.out.println("--------------- VETERINARIO ---------------------");
		
		System.out.println("Nome do veterinario: "+c.getNome());
		System.out.println("Endereço: "+c.getEndereco());
		System.out.println("Telefone: "+c.getTelefone());
		
		
		if (c.getConsulta()){
			System.out.println("O medico consultou o animal logo esta em tratamento");
		}else
		{
			System.out.println("O animal nao esta em tratamento");
		}
		
}
	}


