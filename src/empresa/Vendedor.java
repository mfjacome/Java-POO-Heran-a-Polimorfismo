package empresa;

public class Vendedor extends Funcionario {
	private String setor;
	
	public Vendedor(String nome, int matricula, String setor) {
		super(nome, matricula);
		this.setor = setor;
	}
	
	public Vendedor() {}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void visualizar() {
		System.out.println("Seu nome: " + getNome() + 
				" ,sua matrícula: " + getMatricula() +
				" ,seu setor de atuação: " + getSetor());
	}
}
