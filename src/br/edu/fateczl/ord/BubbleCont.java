package br.edu.fateczl.ord;

public class BubbleCont {

	public BubbleCont() {
		super();
	}
	public int[] bordenacao(int[] vetor) {
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho-1; j++) {
				if (vetor[j] > vetor[j+1]){
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					
				}
			}
		}
		return vetor;
	}
}
	
