
public abstract class  PessoaFisica extends Pessoa {
	private String rg, cpf, dataNascimento;
	
	public PessoaFisica(String nome, String telefone, String email, Endereco endereco, String rg, String cpf,
			String dataNascimento) {
		super(nome, telefone, email, endereco);
		this.rg = rg;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public PessoaFisica(String nome, String telefone, Endereco endereco, String rg, String cpf, String dataNascimento) {
		super(nome, telefone, endereco);
		this.rg = rg;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public String getCpf() {
		return cpf;
	}
	
	

	public void setRg(String rg) {
		this.rg = rg;
	}

	public boolean setCpf(String cpf) {
		if(cpf.equals("00000000000") || cpf.equals("11111111111111") || cpf.equals("22222222222") 
			|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555") 
			|| cpf.equals("66666666666")|| cpf.equals("777777777777") || cpf.equals("88888888888")
			|| cpf.equals("99999999999") || (cpf.length() != 11)) {
			return false;
		}
		char posicao10, posicao11;
		int soma = 0, i, numero, peso = 10, resto;
		
		for (i = 0; i < 9; i++) {
			numero = (int)(cpf.charAt(i) - 48);
			soma = soma + (numero * peso);
			peso = peso - 1;
		}
		resto = 11 - (soma % 11);
		
		if((resto == 10) || (resto == 11))
			posicao10 = 0;
		else
			posicao10 = (char)(resto + 48);
		
		soma = 0; peso = 11;
		
		for (i = 0; i < 9; i++) {
			numero = (int)(cpf.charAt(i) - 48);
			soma = soma + (numero * peso);
			peso = peso - 1;
		}
		if((resto == 10) || (resto == 11))
			posicao11 = 0;
		else
			posicao11 = (char)(resto + 48);
		
		if((posicao10 == cpf.charAt(9)) && (posicao11 == cpf.charAt(10)))
			this.cpf = cpf;	
			return true;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}
		
}
