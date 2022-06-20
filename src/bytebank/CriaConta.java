package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		//primeiraConta.saldo = 200;
		primeiraConta.deposita(200);
		//System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);	
		//System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Primeira conta tem: " + primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(50);
		//System.out.println("Segunda conta tem: " + segundaConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.getSaldo());
		
		//System.out.println(primeiraConta.agencia);
		//System.out.println(primeiraConta.titular);
		System.out.println(primeiraConta.getAgencia());
		//System.out.println(primeiraConta.titular);
		System.out.println(primeiraConta.getTitular());
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mema coisa");
		}else {
			System.out.println("Desmema coisa");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
