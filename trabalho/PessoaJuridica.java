package trabalho;

// 3° Questão do Trabalho de POO

public class PessoaJuridica {

	protected String cnpj;
	
	protected String razaosocial;
	
	
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
	return "PessoaJuridica [cnpj=" + cnpj + ", razaosocial=" + razaosocial + "]";
}

}
