package empresa;

public class Gerente extends Funcionario {
	private String area;
	
	public Gerente(String nome, int matricula, String area) {
		super(nome, matricula);
		this.area = area;
	}
	
	public Gerente() {}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public void visualizar() {
		System.out.println("Seu nome: " + getNome() + 
				" ,sua matricula: " + getMatricula() +
				" ,area de atuação: " + getArea());
	}
	
}
