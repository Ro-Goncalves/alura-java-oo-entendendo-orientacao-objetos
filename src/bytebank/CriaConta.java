package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();		
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.pegaSaldo());
		
		primeiraConta.deposita(100);		
		System.out.println("Primeira conta tem: " + primeiraConta.pegaSaldo());
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(50);
		System.out.println("Segunda conta tem: " + segundaConta.pegaSaldo());
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.titular);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mema coisa");
		}else {
			System.out.println("Desmema coisa");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
