
public class Relatorio {
	private String doenca;
	private String medicacao;
	private String data;
	private Medico medico;
	private Paciente paciente;
	private String hora;
	
	public Relatorio(String doenca, String medicacao, String data, Medico medico, Paciente paciente,String hora) {
		super();
		this.doenca = doenca;
		this.medicacao = medicacao;
		this.data = data;
		this.medico = medico;
		this.paciente = paciente;
		this.hora = hora;
	}
	
	
	public Relatorio(String doenca, String data, Medico medico, Paciente paciente,String hora) {
		super();
		this.doenca = doenca;
		this.data = data;
		this.medico = medico;
		this.paciente = paciente;
		this.hora = hora;
	}
	

	public Relatorio(String data, Medico medico, Paciente paciente,String hora) {
		super();
		this.data = data;
		this.medico = medico;
		this.paciente = paciente;
		this.hora = hora;
	}
	
	public String getHora() {
		return hora;
	}

	public String getDoenca() {
		return doenca;
	}
	public String getMedicacao() {
		return medicacao;
	}
	
	public String getData() {
		return data;
	}

	public Medico getMedico() {
		return medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}
	
}
