package bytebank;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(100, 20);
		
		//conta está inconsistente
		conta.setAgencia(-50);
		conta.setNumero(-100);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(100, 22);
		Conta conta3 = new Conta(100, 30);
		
		System.out.println("Total: " + Conta.getTotal());
	}

}
