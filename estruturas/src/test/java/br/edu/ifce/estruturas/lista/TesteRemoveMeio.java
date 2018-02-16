package br.edu.ifce.estruturas.lista;

public class TesteRemoveMeio {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
	    
	    lista.adicionaNoComeco("Rafael");
	    lista.adicionaNoComeco("Paulo");
	    lista.adicionaNoComeco("Camila");
	    
	    System.out.println(lista);
	    
	    lista.removeDoMeio(1);
	    
	    System.out.println(lista);

	}

}
