package modelo;

public class Modelo {
	
	private String CPF;
	private String Nome;
	private String Endereco;
	
	public Modelo() {
		// TODO Auto-generated constructor stub
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	public String toString()
	{
		return CPF+"#"+Nome+"#"+Endereco;
	}
	
}
