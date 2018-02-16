package br.edu.ifce.estruturas.lista;

public class TesteRemoveFim {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
	    
	    lista.adicionaNoComeco("Rafael");
	    lista.adicionaNoComeco("Paulo");
	    lista.adicionaNoComeco("Camila");
	    
	    System.out.println(lista);
	    
	    lista.removeDoFim();
	    
	    System.out.println(lista);

	}

}