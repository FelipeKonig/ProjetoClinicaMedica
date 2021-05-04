
public class Agenda {

	private String data, hora;
	private Medico medico;
	private Paciente paciente;
	private double precoConsulta;
	
	public Agenda(String data, String hora, Medico medico, Paciente paciente, double precoConsulta) {
		super();
		this.data = data;
		this.hora = hora;
		this.medico = medico;
		this.paciente = paciente;
		this.precoConsulta = precoConsulta;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public double getPrecoConsulta() {
		return precoConsulta;
	}
	public void setPrecoConsulta(double precoConsulta) {
		this.precoConsulta = precoConsulta;
	}
	
	public void imprimirAgenda() {
		System.out.println("------------------------------");
		System.out.println("Agenda:");
		System.out.println("Data: " + getData() + "hora: " + getHora() + "do paciente " 
		+ paciente.getNome() + "e o preco da consulta é de " + getPrecoConsulta());
	}
}
