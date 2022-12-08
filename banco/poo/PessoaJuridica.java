package banco.poo;

public class PessoaJuridica extends Pessoa{

	protected String cnpj;
	
	protected String razaosocial;
	
	public PessoaJuridica(String nome, String sobrenome, int idade) {
		super(nome, sobrenome, idade);
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRazaoSocial() {
		return razaosocial;
	}
	
	public void setRazaoSocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}
	
	@Override
    public String toString() {
        return super.toString()+
        "\nPessoaJuridica:"+
        "\nCnpj: "+this.cnpj+
        "\nRazãoSocial: "+this.razaosocial+
        "\n-----------------\n";
    }

	
}
