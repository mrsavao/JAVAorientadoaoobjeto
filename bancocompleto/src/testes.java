
public class testes {
	public static void main(String[] args) {
		Cliente savio = new Cliente();
		savio.Nome = "S�vio Santos Andrade";
		savio.CPF = "666.043.762-39";
		savio.Profiss�o = "Estudante";
		
		conta contaSavio = new conta();
		contaSavio.deposito(1500);
		
		//Associa��o
		contaSavio.titular = savio; 
		
		System.out.println(contaSavio.titular.Nome);
	}

}
