package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();		
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;		
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		
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
