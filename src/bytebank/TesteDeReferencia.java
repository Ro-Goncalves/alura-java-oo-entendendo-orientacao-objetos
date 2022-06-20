package bytebank;

public class TesteDeReferencia {
	 public static void main(String[] args) {
		 Conta primeiraConta = new Conta();
		 primeiraConta.deposita(300);
		 
		 System.out.println("Saldo primeira conta: " + primeiraConta.pegaSaldo());
		 
		 Conta segundaConta = primeiraConta;
		 System.out.println("Saldo segunda conta: " + segundaConta.pegaSaldo());
		 
		 segundaConta.deposita(100);
		 System.out.println("Novo saldo segunda conta: " + segundaConta.pegaSaldo());
		 System.out.println("Primeira conta: " + primeiraConta.pegaSaldo());
		 
		 if(primeiraConta == segundaConta) {
			 System.out.println("são a mema coisa");
		 }
		 
		 System.out.println(primeiraConta);
		 System.out.println(segundaConta);
	}
}
