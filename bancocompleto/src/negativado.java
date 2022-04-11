
public class negativado {
	public static void main(String[] args) {
		conta conta1 = new conta();
		conta1.deposito(100);
		conta1.saca(200);
		System.out.println(conta1.getsaldo());
	}
}
