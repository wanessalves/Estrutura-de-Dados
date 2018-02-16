package br.edu.ifce.estruturas.vetor;

public class Aluno {

	
	String nome;
	int matricula;
	int idade;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + "]";
	}
	 @Override
	    public boolean equals(Object obj) {
	    	// TODO Auto-generated method stub
	    	 
	    	 
	    	return super.equals(obj);
	
	 }
}
