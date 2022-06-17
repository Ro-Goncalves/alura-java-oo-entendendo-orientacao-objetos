package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(conseguiuRetirar);
		System.out.println(contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("Tranfêrencia OK");
			System.out.println("Conta da Macela: " + contaDaMarcela.saldo);
			System.out.println("Conta do Paulo: " + contaDoPaulo.saldo);
		} else {
			System.out.println("Transfêrencia não OK");
		}
	}

}
