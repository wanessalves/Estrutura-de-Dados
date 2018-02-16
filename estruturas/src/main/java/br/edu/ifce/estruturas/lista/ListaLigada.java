package br.edu.ifce.estruturas.lista;

public class ListaLigada {

	public static void main(String[] args) {
		
	}
		private  Celula primeira;
		private  Celula ultima;
			
			 private  int totalDeElementos;
			
			 public  void  adicionaNoFim( Object  elemento ) {
				 if(this.totalDeElementos == 0) {
				 this.adicionaNoComeco(elemento);
				 }else {
					 Celula novoUltimo = new Celula(null, elemento);
					 this.ultima.setProxima(novoUltimo);
				     	this.ultima = novoUltimo;
						
				     	this.totalDeElementos++;
				}
				 
			 }
			
			 public void adicionaNoMeio(int  posicao, Object elemento) {
				 if(posicao == 0) {
						this.adicionaNoComeco(elemento);;			
					}else if(posicao == this.totalDeElementos) {
						this.adicionaNoFim(elemento);
					}else {
						Celula anterior = this.pega(posicao - 1);
						Celula nova = new Celula(anterior.getProxima(), elemento);
						anterior.setProxima(nova);
						this.totalDeElementos++;
					}	 
				 
			 }
				
			public void adicionaNoComeco(Object elemento ) {
				 Celula nova =  new Celula(this.primeira, elemento);
				 this.primeira = nova;
				
				 if ( this.totalDeElementos ==  0 ) {
					 this.ultima =  this.primeira;
		}
				 this.totalDeElementos++ ;
		}
			
			 public  Celula pega ( int  posicao ) {
				 Celula atual = primeira;
					for(int i = 0; i < posicao; i++) {
						atual = atual.getProxima();
					}
					return atual;
		}
			
			 public  void  removeDoMeio ( int  posicao ) {
				 if(posicao == 0) {
						this.removeDoComeco();
					}else if(posicao == this.totalDeElementos - 1) {
						this.removeDoFim();
					}else {
						Celula anterior = this.pega(posicao - 1);
						Celula atual = anterior.getProxima();
						Celula proximo = atual.getProxima();
						
			            anterior.setProxima(proximo);
			            
			            this.totalDeElementos--;
					}
				
				 
		}
			
			 public  void  removeDoComeco () {
				 this.primeira = this.primeira.getProxima();
					this.totalDeElementos--;
					
					
					if(this.totalDeElementos == 0) {
						this.ultima = null;
					}
		}
			
			 public  void  removeDoFim () {
				 if(totalDeElementos == 1) {
						this.removeDoComeco();
					}else {
						Celula penultimo = pega(totalDeElementos-1);
						penultimo.setProxima(null);
						this.ultima = penultimo;
						this.totalDeElementos--;
					}
		}
			
			 public  int  tamanho () {
				 return  this.totalDeElementos;
		}
			 
			 public  boolean  contem ( Object  elemento ) {
				 
				 Celula atual = this.primeira;
					
					while(atual != null) {
						if(atual.getElemento().equals(elemento)) {
							return true;
						}
						atual = atual.getProxima();
					}
					return false;
		}
			
			
			 public  String  toString () {
				
				 if ( this . totalDeElementos ==  0 ) {
					 return  " [] " ;
		}
				
				  StringBuilder construtor =  new StringBuilder ( " [ " );
				  Celula atual = primeira ;
				
				 // Percorrendo até o elemento penúltimo
				 for( int i =  0 ; i <  this . totalDeElementos - 1 ; i ++ ) {
					 construtor.append(atual . getElemento ());
					 construtor.append( " , " );
					 atual = atual.getProxima ();
		}
				
				 // último elemento
				 	construtor .append(atual . getElemento ());
				 	construtor.append( " ] " );
				
		 			return construtor.toString();
				 
		
		
	}
}

