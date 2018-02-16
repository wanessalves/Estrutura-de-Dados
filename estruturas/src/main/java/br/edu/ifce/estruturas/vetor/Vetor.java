package br.edu.ifce.estruturas.vetor;

public class Vetor {
	
	private Aluno[] alunos = new Aluno[100];
	
	private int totalDeAlunos = 0;
	
	public void adicionaComeco(Aluno aluno){
		//implemetacao
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
		}
		
	public void adicionaMeio(int posicao, Aluno aluno) {
		this.alunos[posicao] = aluno;
		this.totalDeAlunos++; 
		
	}
	
	public Aluno pega(int posicao) {
		return this.alunos[posicao];
	}
	
    public void remove(int posicao) {
    	for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
    		this.alunos[i] = this.alunos[i + 1];
    		}
    		this.totalDeAlunos-- ;
    }
	
	public boolean contem(Aluno aluno){
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (aluno.equals(this.alunos[i])) {
			return true;
			}
		}
			return false;
	}
	
	public int tamanho(){
		return this.totalDeAlunos;
		
	}
	
	//toString
	public String toString() {
		if (this.totalDeAlunos == 0) {
		return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		System.out.println("");
		for (int i = 0; i < this.totalDeAlunos - 1; i++) {
		builder.append(this.alunos[i]);
		builder.append(", ");
		}
		builder.append(this.alunos[this.totalDeAlunos - 1]);
		builder.append("]");
		return builder.toString();
		}
	
	public void imprimeVetor() {
		
		System.out.print("{");
		
		for(int i=0; i < this.totalDeAlunos; i++) {
			System.out.print("[");
			System.out.print(this.alunos[i].nome + ",");
			System.out.print(this.alunos[i].idade + ",");
			System.out.print(this.alunos[i].matricula);
			System.out.print("]");
			
		}
		
		System.out.print("}");
		
	
	}



}
