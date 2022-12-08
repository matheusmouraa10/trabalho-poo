package trabalho;

// 3° Questão do Trabalho de POO

 public class Pessoa {
	
	protected String nome;
	
	
	public Pessoa (String nome) {
		this.nome = nome;                
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome; 
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
	
	
	
}
