package atividadeListas;

public class ListaSequencial implements Lista{
	
	//Criação dos atributos
	private int[] dados;
	private int tamMax;
	private int tamAtual;
	
	//Construtor que implementa o tamanho máximo da lista como 100 e o atual 0
	public ListaSequencial() {
		tamMax = 100;
		tamAtual = 0;
		dados = new int[tamMax];
	}

	//Retorna true quando o tamanho atual for 0 
	@Override
	public boolean vazia() {
		if(tamAtual == 0) return true; else return false;
	}

	//Retorna true se o tamanho atual da lista for igual ao tamanho máximo
	@Override
	public boolean cheia() {
		if(tamAtual == tamMax) return true; else return false;
	}

	//Retorna o valor contido na variável tamAtual(que é o tamanho atual da lista)
	@Override
	public int tamanho() {
		return tamAtual;
	}
	
	//Verifica se a posição inserida é válida, se não, retorna -1, se sim, retorna o elemento contido naquela posição
	@Override
	public int elemento(int pos) {
		int dado;
		
		if((pos > tamAtual) || (pos <= 0)) return -1;
		
		dado = dados[pos - 1];
		return dado;
	}
	
	//Percorre a lista testando se o dado inserido coincide com algum contido no array, se não, retorna 1, se sim, retorna a posição do dado
	@Override
	public int posição(int dado) {
		for(int i = 0 ; i < tamAtual ; i++) {
			if(dados[i] == dado) {
				return (i + 1);
			}
		}
		return -1;
	}
	
	/*Verifica se a posição inserida é válida, se não, retorna false, se sim, continua
	 * Depois, sabendo a posição desejada, passa os dados contidos nessa posição e nas posições posteriores
	 * para a posição da frente, fazendo assim, a posição requerida ficar vazia.
	 * Por fim, insere o dado especificado na posição agora vazia, depois aumenta o tamanho atual da lista
	 */
	@Override
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

	/*Verifica se a posição inserida é válida, caso não, retorna -1, caso sim, então continua.
	 * Logo após, faz a variável dado, que tinha sido instanciada antes, receber o valor que estava na posição requerida
	 * depois faz os valores contidos à frente da posição removida voltarem uma casa.
	 * Por fim, diminui em 1 o tamanho atual e retorna a variável dado, onde está contido o elemento removido
	 */
	@Override
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

}
