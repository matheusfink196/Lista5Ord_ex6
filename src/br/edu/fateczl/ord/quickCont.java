package br.edu.fateczl.ord;

public class quickCont {
	public quickCont() {
		super();
	}
	public int[] quickSort(int[] vetor, int inicio, int fim) {
		if(fim>inicio) {
			int posicaoPivoFixo = dividir(vetor,inicio,fim);
			quickSort(vetor,inicio,posicaoPivoFixo-1);
			quickSort(vetor,posicaoPivoFixo+1,fim);
		}
		return vetor;
	}
	private int dividir(int[] vetor, int inicio, int fim ) {
		int ponteiroEsq = inicio + 1;
		int ponteiroDir = fim;
		int pivo = vetor[inicio];
		
		while(ponteiroEsq<=ponteiroDir) {
			while(ponteiroEsq <= ponteiroDir && vetor[ponteiroEsq]<=pivo ) {
				ponteiroEsq++;
			}
			while(ponteiroDir >= ponteiroEsq && vetor[ponteiroDir]>pivo) {
				ponteiroDir--;
			}
			if (ponteiroEsq < ponteiroDir) {
				trocar(vetor, ponteiroEsq, ponteiroDir);
				ponteiroEsq++;
				ponteiroDir--;
				
			}
		}
		trocar(vetor, inicio, ponteiroDir);
		return ponteiroDir;
	}
	private void trocar(int[] vetor, int i, int j) {
		int aux = vetor[j];
		vetor[j] = vetor[i];
		vetor[i] = aux;
		
		
	}
		
}
