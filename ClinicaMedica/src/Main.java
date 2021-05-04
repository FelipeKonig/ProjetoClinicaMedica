import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Medico> medicos = new ArrayList<Medico>();
		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		ArrayList<Secretario> secretarios = new ArrayList<Secretario>();
		ArrayList<Relatorio> relatorios = new ArrayList<Relatorio>();
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		ArrayList<RelatorioPagamentoSaida> pagamentosSaida = new ArrayList<RelatorioPagamentoSaida>();
		ArrayList<Atestado> atetados = new ArrayList<Atestado>();
		ArrayList<Agenda> horarios = new ArrayList<Agenda>();
		Fornecedor fornecedor = null;
		
		Scanner teclado = new Scanner(System.in);
		
		

		Endereco endereco = new Endereco("rua1", "cidade1", "estado1", "bairro1");
		enderecos.add(endereco);
		
		Endereco endereco2 = new Endereco("rua2", "cidade2", "estado2", "bairro2");
		enderecos.add(endereco);
		
		Endereco endereco3 = new Endereco("rua3", "cidade3", "estado3", "bairro3");
		enderecos.add(endereco);
		
		Medico medico = new Medico("nome1", "telefone1", "email1", endereco, "rg1", "cpf1", "01\01\01", 12000,
				"MedicoGeral");
		medicos.add(medico);
		
		Paciente paciente = new Paciente("nomePaciente1","telefonePaciente1",endereco2,"rgPaciente1","cpfPaciente1","01-01-01","vivo");
		pacientes.add(paciente);
		
		Secretario secretario = new Secretario("nomeSecretario1","telefoneSecretario1","emailSecretario1",endereco3,"rgSecretario1","cpfSecretario1","02-02-02",2000);
		secretarios.add(secretario);
		
		while (true) {
			
			mostrarMenuPrincipal();
			
			int opcao = teclado.nextInt();

			if (opcao == 0) {
				break;
			}
			
			if(opcao == 1) {
				mostrarMenuListar();
				int opcaoL = teclado.nextInt();	
			
				if (opcaoL == 1) {
					imprimirMedico(medicos);
				}
				if (opcaoL == 2) {
					imprimirPaciente(pacientes);
				}
				if(opcaoL == 3) {
					imprimirSecretario(secretarios);
				}
				if(opcaoL == 4) {
					imprimirFornecedor(fornecedores);
				}
				if(opcaoL == 5) {
					imprimirPessoaFisica(medico);
				}
			
			}
			if(opcao == 2) {
				mostrarMenuCadastro();
				int opcaoC = teclado.nextInt();
				
				if(opcaoC == 1) {
					medico = cadastrarMedico(teclado, medico);
					medicos.add(medico);
				}
				if(opcaoC == 2) {
					secretario = cadastrarSecretario(teclado, secretario);
					secretarios.add(secretario);
				}
				if(opcaoC == 3) {
					fornecedor = cadastrarFornecedor(teclado, fornecedor);
					fornecedores.add(fornecedor);
				}
				if(opcaoC == 4) {
					paciente = cadastrarPaciente(teclado, paciente);
					pacientes.add(paciente);
				}
			}
			
			if(opcao == 3) {
				
			}
		}
	}
	
	public static void mostrarMenuListar(){
		
		System.out.println("Digite 1 para listar os medicos");
		System.out.println("Digite 2 para listar os pacientes");
		System.out.println("Digite 3 para listar os secretarios");
		System.out.println("Digite 4 para listar os fornecedores");
		System.out.println("Digite 5 para listar as pessoas fisicas");
	}
	
	public static void mostrarMenuPrincipal(){
		System.out.println("Digite 0 para sair");
		System.out.println("Digite 1 para listas");
		System.out.println("Digite 2 para cadastros");
	}
	
	public static void mostrarMenuCadastro() {
		System.out.println("Digite 1 para cadastrar medico");
		System.out.println("Digite 2 para cadastrar seretario");
		System.out.println("Digite 3 para cadastrar fornecedor");
		System.out.println("Digite 4 para cadastrar paciente");
	}
	
	public static void mostrarMenuBuscar() {
		System.out.println("Digite 1 para buscar medico");
		System.out.println("Digite 2 para buscar seretario");
		System.out.println("Digite 3 para buscar fornecedor");
		System.out.println("Digite 4 para buscar paciente");
	}
	
	private static Medico cadastrarMedico(Scanner teclado, Medico medico) {
		System.out.println("Digite o nome: ");
		String nome = teclado.next().trim();

		System.out.println("Digite o telefone: ");
		String telefone = teclado.next().trim();
		
		System.out.println("Digite o email: ");
		String email = teclado.next().trim();
		
		System.out.println("Digite o RG: ");
		String rg = teclado.next().trim();
		
		System.out.println("Digite o CPF: ");
		String cpf = teclado.next();
		
		System.out.println("Digite a data de nascimento: ");
		String dataNascimento = teclado.next().trim();
		
		System.out.println("Digite o salario: ");
		double salario = teclado.nextDouble();
		
		System.out.println("Digite a area que atua: ");
		String area = teclado.next().trim();
		
		System.out.println("Endereco");
		System.out.println("Rua: ");
		String rua = teclado.next().trim();
		
		System.out.println("Cidade:");
		String cidade = teclado.next().trim();
		
		System.out.println("Estado:");
		String estado = teclado.next().trim();
		
		System.out.println("bairro:");
		String bairro = teclado.next().trim();
		
		Endereco endereco = new Endereco(rua, cidade, estado, bairro);
		
		medico = new Medico(nome, telefone, email, endereco, rg, cpf, dataNascimento, salario, area);
		
		return medico;
	}
	
	private static Secretario cadastrarSecretario(Scanner teclado, Secretario secretario) {
		System.out.println("Digite o nome: ");
		String nome = teclado.next().trim();

		System.out.println("Digite o telefone: ");
		String telefone = teclado.next().trim();
		
		System.out.println("Digite o email: ");
		String email = teclado.next().trim();
		
		System.out.println("Digite o RG: ");
		String rg = teclado.next().trim();
		
		System.out.println("Digite o CPF: ");
		String cpf = teclado.next().trim();
		
		System.out.println("Digite a data de nascimento: ");
		String dataNascimento = teclado.next().trim();
		
		System.out.println("Digite o salario: ");
		double salario = teclado.nextDouble();
		
		System.out.println("Endereco");
		System.out.println("Rua: ");
		String rua = teclado.next().trim();
		
		System.out.println("Cidade:");
		String cidade = teclado.next().trim();
		
		System.out.println("Estado:");
		String estado = teclado.next().trim();
		
		System.out.println("bairro:");
		String bairro = teclado.next().trim();
		
		Endereco endereco = new Endereco(rua, cidade, estado, bairro);
		secretario = new Secretario(nome, telefone, email, endereco, rg, cpf, dataNascimento, salario);
		
		return secretario;
	}
	
	private static Fornecedor cadastrarFornecedor(Scanner teclado, Fornecedor fornecedor) {
		System.out.println("Digite o nome: ");
		String nome = teclado.next().trim();

		System.out.println("Digite o telefone: ");
		String telefone = teclado.next().trim();
		
		System.out.println("Digite o email: ");
		String email = teclado.next().trim();

		System.out.println("Digite o CNPJ: ");
		String cnpj = teclado.next().trim();
		
		System.out.println("Endereco");
		System.out.println("Rua: ");
		String rua = teclado.next().trim();
		
		System.out.println("Cidade:");
		String cidade = teclado.next().trim();
		
		System.out.println("Estado:");
		String estado = teclado.next().trim();
		
		System.out.println("bairro:");
		String bairro = teclado.next().trim();
		
		Endereco endereco = new Endereco(rua, cidade, estado, bairro);
		fornecedor = new Fornecedor(nome, telefone, email, endereco, cnpj);
		
		return fornecedor;
	}
	
	private static Paciente cadastrarPaciente(Scanner teclado,Paciente paciente) {
		System.out.println("Digite o nome: ");
		String nome = teclado.next().trim();

		System.out.println("Digite o telefone: ");
		String telefone = teclado.next().trim();
		
		System.out.println("Digite o RG: ");
		String rg = teclado.next().trim();
		
		System.out.println("Digite o CPF: ");
		String cpf = teclado.next().trim();
		
		System.out.println("Digite a data de nascimento: ");
		String dataNascimento = teclado.next().trim();
		
		System.out.println("Digite o status do paciente: ");
		String status = teclado.next().trim();
		
		System.out.println("Endereco");
		System.out.println("Rua: ");
		String rua = teclado.next().trim();
		
		System.out.println("Cidade:");
		String cidade = teclado.next().trim();
		
		System.out.println("Estado:");
		String estado = teclado.next().trim();
		
		System.out.println("bairro:");
		String bairro = teclado.next().trim();
		
		Endereco endereco = new Endereco(rua, cidade, estado, bairro);
		paciente = new Paciente(nome, telefone, endereco, rg, cpf, dataNascimento, status);
		
		return paciente;
	}
	
	private static void imprimirEndereco(Endereco endereco) {
		System.out.println("Endereco: Rua: " + endereco.getRua()); 
		System.out.println(" Bairro: " + endereco.getBairro());
		System.out.println(" Cidade: " + endereco.getCidade());
		System.out.println(" Estado: " + endereco.getEstado());
	}

	private static void imprimirPessoa(Pessoa pessoa){
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("Email: " + pessoa.getEmail());
		imprimirEndereco(pessoa.getEndereco());
 }
	private static void imprimirMedico(ArrayList<Medico> medico) {
		System.out.println("-----------------------------");
		System.out.println("Medicos cadastrados: ");
		
		for (int indMedico = 0; indMedico < medico.size(); indMedico++) {
			System.out.println("Medico " + indMedico);
			imprimirPessoa(medico.get(indMedico));
			System.out.println("Area: " + medico.get(indMedico).getArea());
			System.out.println("CPF: " + medico.get(indMedico).getCpf());
			System.out.println("salario: " + medico.get(indMedico).getSalario());
		}	
	}
	
	private static void imprimirPaciente(ArrayList<Paciente> paciente) {
		System.out.println("------------------------------");
		System.out.println("Pacientes cadastrados: ");
		
		for (int indPaciente = 0; indPaciente < paciente.size(); indPaciente++) {
			System.out.println("Paciente " + indPaciente);
			imprimirPessoa(paciente.get(indPaciente));
			System.out.println("Status: " + paciente.get(indPaciente).getStatus());
			
		}
	}
	
	private static void imprimirSecretario(ArrayList<Secretario> secretario) {
		System.out.println("-----------------------------");
		System.out.println("Medicos cadastrados ");
		for (int indSecretario = 0; indSecretario < secretario.size(); indSecretario++) {
			System.out.println("Secretario " + indSecretario);
			imprimirPessoa(secretario.get(indSecretario));
			System.out.println("-----------------------------");
		}
	}
	
	private static void imprimirFornecedor(ArrayList<Fornecedor> fornecedor) {

		System.out.println("-------------------------------");
		System.out.println("Fornecedores cadastrados ");
		for (int indFornecedor = 0; indFornecedor < fornecedor.size(); indFornecedor++) {
			System.out.println("Fornecedor " + indFornecedor);
			imprimirPessoa(fornecedor.get(indFornecedor));
			System.out.println("CNPJ: " + fornecedor.get(indFornecedor).getCnpj());
			System.out.println("Pagamento: " + fornecedor.get(indFornecedor).getPagamento());
			System.out.println("-----------------------------");
		}
	}
	
	private static void imprimirPessoaFisica(PessoaFisica pf) {
		System.out.println("nome: " + pf.getNome());
		System.out.println("telefone: " + pf.getTelefone());
		System.out.println("endereco: " + pf.getEndereco());
		System.out.println("rg: " + pf.getRg());
		System.out.println("cpf: " + pf.getCpf());
	}

}