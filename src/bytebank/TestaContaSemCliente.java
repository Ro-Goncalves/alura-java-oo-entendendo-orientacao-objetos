package bytebank;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		//System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaMarcela.getSaldo());
		
		//contaDaMarcela.titular.nome = "Marcela Da Silva";
		//System.out.println(contaDaMarcela.titular.nome);
		//contaDaMarcela.titular = new Cliente();
		contaDaMarcela.setTitular(new Cliente());
		//contaDaMarcela.titular.nome = "Marcela Da Silva";
		contaDaMarcela.getTitular().setNome("Marcela Da Silva");
		//System.out.println(contaDaMarcela.titular.nome);
		System.out.println(contaDaMarcela.getTitular().getNome());
	}

}
