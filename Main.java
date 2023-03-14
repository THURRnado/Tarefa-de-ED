package atividadeListas;

public class Main {

	public static void main(String[] args) {
		
		//Criação de lista vazia
				ListaSequencial l = new ListaSequencial();
				
				//antes de tudo irei adicionar alguns elementos na lista
				l.insere(1, 1);
				l.insere(2, 2);
				l.insere(3, 3);
				
				System.out.print("Lista:");
				for(int i = 0 ; i < l.tamanho() ; i++) {
					System.out.print(" " + l.elemento(i + 1));
				}
				
				System.out.println();
				
				//Verificando se a lista está vazia
				System.out.println("A lista está vazia? " + l.vazia());
				
				//Verificando se a lista está cheia
				System.out.println("A lista está cheia? " + l.cheia());
				
				//Obtendo o tamanho da lista
				System.out.println("Qual o tamanho da lista? " + l.tamanho());
				
				//Modificando o valor de uma determinada posição da lista
				l.insere(1, 5);
				System.out.println("\nInserindo o elemento 5 na posição 1...\n");
				System.out.print("Lista modificada:");
				for(int i = 0 ; i < l.tamanho() ; i++) {
					System.out.print(" " + l.elemento(i + 1));
				}
				
				System.out.println();
				
				//Removendo um elemento
				l.remove(4);
				System.out.println("\nRemovendo o elemento contido na posição 4...\n");
				System.out.print("Lista com o elemento removido:");
				for(int i = 0 ; i < l.tamanho() ; i++) {
					System.out.print(" " + l.elemento(i + 1));
				}
				
	}
}


