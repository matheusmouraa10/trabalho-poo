package trabalho;

// 3° Questão do Trabalho de POO

public class PessoaFisica {
		
	protected String cpf;
	
	protected String sobrenome;
	
public void setCpf (String cpf) {
	this.cpf = cpf;
}

public String getCpf() {
	return cpf;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}

public String getSobrenome() {
	return sobrenome;
}

@Override
public String toString() {
	return "PessoaFisica [cpf=" + cpf + ", sobrenome=" + sobrenome + "]";
}

}
