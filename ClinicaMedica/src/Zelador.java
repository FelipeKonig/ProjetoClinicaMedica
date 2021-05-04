
public class Zelador extends Funcionario {
	
	
	public Zelador(String nome, String telefone, Endereco endereco, String rg, String cpf, String dataNascimento,
			double salario) {
		super(nome, telefone, endereco, rg, cpf, dataNascimento, salario);
	}
	
	@Override
	public void setSalario(double salario) {
		if(salario <= 0 && salario > 10000)
			super.setSalario(salario);
		
		return;
	}
}
