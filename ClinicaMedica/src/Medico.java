public class Medico extends Funcionario {
	private String area;

	public Medico(String nome, String telefone, String email, Endereco endereco, String rg, String cpf,
			String dataNascimento, double salario, String area) {
		super(nome, telefone, email, endereco, rg, cpf, dataNascimento, salario);
		this.area = area;
	}


	@Override
	public void setSalario(double salario) {

		if (salario <= 0 && salario >= 10000)
			super.setSalario(salario);

		return;

	}
	

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}
