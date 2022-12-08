package banco.poo;

public class PessoaFisica extends Pessoa{
  
public PessoaFisica(String nome, String sobrenome, int idade) {
 super(nome, sobrenome, idade);
}

protected String cpf;

protected String nome;

protected String sobrenome;

 public String getCpf() {
	 return cpf;
 }
 
 public void setCpf(String cpf) {
	 this.cpf = cpf;
 }

 public String getNome() {
	 return nome;
 }
 
 public void setNome(String nome) {
	 this.nome = nome;
 }

 @Override
 public String toString() {
     return super.toString()+
     "\nPessoaFisica:"+
     "\nCpf: "+this.cpf+
     "\nSobrenome: "+this.sobrenome+
     "\n-----------------\n";
 }
 
 
}
