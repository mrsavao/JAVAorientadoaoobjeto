
public class testes {
	public static void main(String[] args) {
		Cliente savio = new Cliente();
		savio.Nome = "Sávio Santos Andrade";
		savio.CPF = "666.043.762-39";
		savio.Profissão = "Estudante";
		
		conta contaSavio = new conta();
		contaSavio.deposito(1500);
		
		//Associação
		contaSavio.titular = savio; 
		
		System.out.println(contaSavio.titular.Nome);
	}

}
