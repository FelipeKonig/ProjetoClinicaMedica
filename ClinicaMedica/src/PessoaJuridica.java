
public class PessoaJuridica extends Pessoa{
	private String cnpj;

	public PessoaJuridica(String nome, String telefone, String email, Endereco endereco, String cnpj) {
		super(nome, telefone, email, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	
}
