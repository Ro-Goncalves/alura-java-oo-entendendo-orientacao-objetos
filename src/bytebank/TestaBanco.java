package bytebank;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		//paulo.nome = "Paulo Silveira";
		//paulo.cpf = "222.222.222-22";
		//paulo.profissao = "Programador";
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222-22");
		paulo.setProfissao("Programador");

		Conta contaDoPaulo = new Conta();
		
		//contaDoPaulo.saldo += 100
		contaDoPaulo.deposita(100);

		//contaDoPaulo.titular = paulo;
		contaDoPaulo.setTitular(paulo);
		//System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.getTitular().getNome());
	}

}
