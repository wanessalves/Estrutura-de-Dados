package br.edu.ifce.estruturas.vetor;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("carla");
		a2.setNome("Marcos");
		a3.setNome("wanessa");
		
		a1.setIdade(18);
		a2.setIdade(17);
		a3.setIdade(20);
		
		a1.setMatricula(1233444);
		a2.setMatricula(74638739);
		a3.setMatricula(7939362);
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	}

}

