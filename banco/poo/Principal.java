package banco.poo;

// 4° Questão do Trabalho de POO

public class Principal {
	public static void main(String[] args) {
		Pessoa jeova = new Pessoa("Jeová", "Tavares", 37);
		Conta c = new Conta(jeova);
		c.creditar(2000.0);
		c.debitar(100);
		
		Pessoa samuel = new Pessoa("Samuel", "Rodrigues", 37);
		ContaEspecial c2 =
			new ContaEspecial(samuel, 200);
		c2.debitar(500);
		
		ContaPoupanca c3 = new ContaPoupanca(
				new Pessoa("Agamenon", "Quinderé", 25), 
				10000);
		
		c3.rendeJuros();
		
		PessoaFisica Matheus = new PessoaFisica("Matheus", "Moura", 18);
		Matheus.setCpf("000.000.000-00");
		Matheus.setSobrenome("Moura");
		Conta c4 = new Conta(Matheus, 200);
		c4.creditar(3000.0);
		c4.debitar(500);

		PessoaJuridica Analice = new PessoaJuridica("Analice", "Romana", 19);
		Analice.setCnpj("000.000.000.111-22");
		Analice.setRazaoSocial("#######");
		Conta c5 = new Conta(Analice, 200);
		c5.creditar(1000.0);
		c5.debitar(100);
				
		System.out.println(c);

		System.out.println(c2);
		
		System.out.println(c3);
		
		System.out.println(Matheus + c4.toString());

		System.out.println(Analice + c5.toString());
	}
}
