package br.edu.ifce.estruturas.vetor;

public class TestePega {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		Vetor lista = new Vetor();
				
		lista.adicionaMeio(0, a2);
		lista.adicionaMeio(1, a1);
		lista.adicionaMeio(2, a3);
		
		System.out.println(lista);
		
		//lista.pega(1);
		//lista.pega(2);
		
		System.out.println(lista.pega(2));
		
	}

}

