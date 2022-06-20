package bytebank;

public class TesteDeReferencia {
	 public static void main(String[] args) {
		 Conta primeiraConta = new Conta();
		 primeiraConta.deposita(300);
		 
		 //System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		 System.out.println("Saldo primeira conta: " + primeiraConta.getSaldo());
		 
		 Conta segundaConta = primeiraConta;
		 //System.out.println("Saldo segunda conta: " + segundaConta.saldo);
		 System.out.println("Saldo segunda conta: " + segundaConta.getSaldo());
		 
		 //segundaConta.saldo += 100;
		 segundaConta.deposita(100);
		 
		 //System.out.println("Novo saldo segunda conta: " + segundaConta.saldo);
		 //System.out.println("Primeira conta: " + primeiraConta.saldo);
		 System.out.println("Novo saldo segunda conta: " + segundaConta.getSaldo());
		 System.out.println("Primeira conta: " + primeiraConta.getSaldo());
		 
		 if(primeiraConta == segundaConta) {
			 System.out.println("são a mema coisa");
		 }
		 
		 System.out.println(primeiraConta);
		 System.out.println(segundaConta);
	}
}
