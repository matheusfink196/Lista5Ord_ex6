package br.edu.fateczl.ord;

public class MergeCont {

	public MergeCont() {
		super();
	}
	public int[] mordenacao(int[] vetor , int inicio, int fim ) {
		
		if (inicio<fim) {
			int meio = (inicio+fim)/2;
			mordenacao(vetor, inicio, meio); //Esquerda
			mordenacao(vetor, meio+1, fim); //Direita
			intercala(vetor,inicio,meio,fim);
		}
			return vetor;
				}
	private void intercala(int[] vetor, int inicio, int meio, int fim) {
		int[] nvoVetor = new int[vetor.length];
		
		for(int i = inicio; i <= fim; i++) {
			nvoVetor[i] = vetor[i];
		}
		int esq = inicio;
		int dir = meio+1;
		
		for(int cont = inicio; cont<=fim; cont++) {
			if(esq>meio) {
				vetor[cont] = nvoVetor[dir];
				dir++;
			} else if (dir>fim) {
				vetor[cont]= nvoVetor[esq];
				esq++;
			} else if (nvoVetor[esq]<nvoVetor[dir]) {
				vetor[cont] = nvoVetor[esq];
				esq++;
			} else {
				vetor[cont] = nvoVetor[dir];
				dir++;
			}
		}
			
		
	}
}