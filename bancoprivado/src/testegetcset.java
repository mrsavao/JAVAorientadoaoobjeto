
public class testegetcset {
	public static void main(String[] args) {
		conta conta1 = new conta();
		conta1.setNumero(777);
		System.out.println(conta1.getnumero());
		
		Cliente savio = new Cliente();
		
		savio.setNome("Sávio");
		conta1.setTitular(savio);
		
		System.out.println(conta1.getTitular().getNome());
	}
}
