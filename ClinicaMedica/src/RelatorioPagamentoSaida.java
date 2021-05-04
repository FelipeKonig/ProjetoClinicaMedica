
public class RelatorioPagamentoSaida{
	private String data,hora;
	private Fornecedor Pagamento;
	private Fornecedor fornecedor;
	
	public RelatorioPagamentoSaida(String data, String hora) {
		super();
		this.data = data;
		this.hora = hora;
	}

	public String getData() {
		return data;
	}

	public String getHora() {
		return hora;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public Fornecedor getPagamento() {
		return Pagamento;
	}
	
}