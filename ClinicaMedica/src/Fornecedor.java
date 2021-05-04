
public class Fornecedor extends PessoaJuridica {
	private double pagamento;

	public Fornecedor(String nome, String telefone, String email, Endereco endereco, String cnpj, double pagamento) {
		super(nome, telefone, email, endereco, cnpj);
		this.pagamento = pagamento;
	}
	
	public Fornecedor(String nome, String telefone, String email, Endereco endereco, String cnpj) {
		super(nome, telefone, email, endereco, cnpj);
	}

	public double getPagamento() {
		return pagamento;
	}
}
