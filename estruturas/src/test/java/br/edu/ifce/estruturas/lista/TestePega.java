package br.edu.ifce.estruturas.lista;

public class TestePega {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista . adicionaNoMeio ( 0, " Rafael " );
		lista . adicionaNoMeio(1, "Paulo"); 
		lista . adicionaNoMeio ( 2, " wanessa " );
		lista . adicionaNoMeio(3, "Pablo"); 
		
		System.out.println(lista);
		System.out.println(lista.pega(2));
		
	}

}