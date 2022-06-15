package bytebank;

public class TesteDeReferencia {
	 public static void main(String[] args) {
		 Conta primeiraConta = new Conta();
		 primeiraConta.saldo = 300;
		 
		 System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		 
		 Conta segundaConta = primeiraConta;
		 System.out.println("Saldo segunda conta: " + segundaConta.saldo);
		 
		 segundaConta.saldo += 100;
		 System.out.println("Novo saldo segunda conta: " + segundaConta.saldo);
		 System.out.println("Primeira conta: " + primeiraConta.saldo);
		 
		 if(primeiraConta == segundaConta) {
			 System.out.println("são a mema coisa");
		 }
		 
		 System.out.println(primeiraConta);
		 System.out.println(segundaConta);
	}
}
