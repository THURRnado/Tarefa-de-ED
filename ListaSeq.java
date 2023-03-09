package atvidadeDeEstruturaDeDados;

public class ListaSeq {
	
	private int[] dados;
	private int tamMax;
	private int tamAtual;
	
	public ListaSeq() {
		tamMax = 100;
		tamAtual = 0;
		dados = new int[tamMax];
	}
	
	public boolean vazia() {
		if(tamAtual == 0) return true; else return false;
	}
	
	public boolean cheia() {
		if(tamAtual == tamMax) return true; else return false;
	}
	
	public int tamanho() {
		return tamAtual;
	}
	
	public int elemento(int pos) {
		int dado;
		
		if((pos > tamAtual) || (pos <= 0)) return -1;
		
		dado = dados[pos - 1];
		return dado;
	}
	
	public int posição(int dado) {
		for(int i = 0 ; i < tamAtual ; i++) {
			if(dados[i] == dado) {
				return (i + 1);
			}
		}
		return -1;
	}
	
	public boolean insere(int pos, int dado) {
		if(cheia() || (pos > tamAtual+1)	|| (pos <= 0)) {
			return false;
		}
		
		for(int i = tamAtual ; i >= pos ; i--) {
			dados[i] = dados[i-1];
		}
		
		dados[pos-1]=dado;
		tamAtual++;
		return true;
	}
	
	public int remove(int pos) {
		int dado;
		if((pos > tamAtual) || (pos < 1)) {
			return -1;
		}
		dado = dados[pos-1]; 
		for(int i = pos-1 ; i < tamAtual - 1 ; i++) {
			dados[i] = dados[i + 1];
		}
		tamAtual--;
		return dado;
	}
	
	public static void main(String[] args) {
		
		//Criação de lista vazia
		ListaSeq l = new ListaSeq();
		
		//Verificando se a lista está vazia
		System.out.println("A lista está vazia? " + l.vazia());
		
		//Verificando se a lista está cheia
		System.out.println("A lista está cheia? " + l.cheia());
		
		//Obtendo o tamanho da lista
		System.out.println("Qual o tamanho da lista? " + l.tamanho());
		
		//Modificando o valor de uma determinada posição da lista
		l.insere(1, 5);
		System.out.print("Lista modificada:");
		for(int i = 0 ; i < l.tamAtual ; i++) {
			System.out.print(" " + l.elemento(i + 1));
		}
		
		System.out.println();
		
		//Removendo um elemento
		l.remove(1);
		System.out.print("Lista com o elemento removido:");
		for(int i = 0 ; i < l.tamAtual ; i++) {
			System.out.print(" " + l.elemento(i + 1));
		}
		
	 }
	}


