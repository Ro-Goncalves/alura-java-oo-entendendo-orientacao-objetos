package bytebank;

public class TestaClasse {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.deposita(100);
		
		System.out.println("Saldo conta: " + conta.pegaSaldo());
	}
}
