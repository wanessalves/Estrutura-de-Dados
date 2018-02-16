package br.edu.ifce.estruturas.lista;

public class TesteTamanho {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
	    
	    lista.adicionaNoComeco("Rafa");
	    lista.adicionaNoComeco("Paulo");
	    
	    System.out.println(lista.tamanho());
	    
	    lista.adicionaNoComeco("Wanessa");
	    lista.adicionaNoComeco("Carlos");
	    lista.adicionaNoComeco("Pablo");
	    
	    System.out.println(lista.tamanho());

	}

}
