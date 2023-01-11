package empresa;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vendedor:
		Vendedor vendedor1 = new Vendedor("Matheus", 25867, "informática");
		Vendedor vendedor2 = new Vendedor("Luiza", 26516, "eletrodomesticos");
				
		vendedor1.visualizar();
		vendedor2.visualizar();
				
		System.out.println("\n");
		
		//gerencia:
		Gerente gerente1 = new Gerente("Paulo", 10547, "Gerencia1");
		Gerente gerente2 = new Gerente("Diones", 63654, "Gerencia2");
				
		gerente1.visualizar();
		gerente2.visualizar();
	}

}
