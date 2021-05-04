
public class Atestado {
	private String dataTermino;
	private String dataInicio;
	private Paciente paciente;
	private Medico medico;

	public Atestado(String dataTermino, String dataInicio, Paciente paciente, Medico medico) {
		super();
		this.dataTermino = dataTermino;
		this.dataInicio = dataInicio;
		this.paciente = paciente;
		this.medico = medico;
	}

	public String getDataTermino() {
		return dataTermino;
	}
	

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Medico getMedico() {
		return medico;
	}

}
