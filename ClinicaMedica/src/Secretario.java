
public class Secretario extends Funcionario{
	private Agenda agenda;

	public Secretario(String nome, String telefone, String email, Endereco endereco, String rg, String cpf,
			String dataNascimento, double salario) {
		super(nome, telefone, email, endereco, rg, cpf, dataNascimento, salario);
		
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	
	@Override
	public void setSalario(double salario) {
		if(salario <= 0 && salario > 1000)
			super.setSalario(salario);
		
		return;
	}
	 
}