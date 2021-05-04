
public abstract class Funcionario extends PessoaFisica {
	protected double salario;

	public Funcionario(String nome, String telefone, String email, Endereco endereco, String rg, String cpf,
			String dataNascimento, double salario) {
		super(nome, telefone, email, endereco, rg, cpf, dataNascimento);
		this.salario = salario;
	}
	
	public Funcionario(String nome, String telefone, Endereco endereco, String rg, String cpf, String dataNascimento,
			double salario) {
		super(nome, telefone, endereco, rg, cpf, dataNascimento);
		this.salario = salario;
	}

	
	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getSalario() {
		return salario;
	}
}
