
public class Paciente extends PessoaFisica {
	private String status;

	public Paciente(String nome, String telefone, String email, Endereco endereco, String rg, String cpf,
			String dataNascimento, String status) {
		super(nome, telefone, email, endereco, rg, cpf, dataNascimento);
		this.status = status;
	}
	
	public Paciente(String nome, String telefone, Endereco endereco, String rg, String cpf, String dataNascimento,
			String status) {
		super(nome, telefone, endereco, rg, cpf, dataNascimento);
		this.status = status;
	}



	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
}
