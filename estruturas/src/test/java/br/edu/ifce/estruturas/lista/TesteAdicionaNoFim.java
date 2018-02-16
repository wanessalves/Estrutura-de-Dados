package br.edu.ifce.estruturas.lista;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ListaLigada lista =  new ListaLigada ();
		 		
		 lista . adicionaNoFim( " Rafael " );
		 lista . adicionaNoFim( " Paulo " );
		 		
		 System.out.println(lista);
		 
		 lista . adicionaNoFim( " Rafa" );
		 
		 System.out.println(lista);
	}

}