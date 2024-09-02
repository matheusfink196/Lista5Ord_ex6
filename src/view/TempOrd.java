package view;
import br.edu.fateczl.ord.BubbleCont;
import br.edu.fateczl.ord.MergeCont;
import br.edu.fateczl.ord.quickCont;

public class TempOrd {
	public static void main(String[] args) {
		quickCont quick = new quickCont();
		BubbleCont bubble = new BubbleCont();
		MergeCont merge = new MergeCont();
		
		
		int[] vetor = new int[1500];
		
		for(int i=0;i<=vetor.length-1;i++) {
			vetor[i] = vetor.length -1 - i;
		}
		int[] vetorbubble = vetor.clone(); 
		double tempoinicio =  System.nanoTime();
		vetorbubble = bubble.bordenacao(vetorbubble);
		double tempofim = System.nanoTime();
		double tempobubble = (tempofim - tempoinicio)/Math.pow(10, 9);
		
		int[] vetormerge = vetor.clone(); 
		tempoinicio =  System.nanoTime();
		vetormerge = merge.mordenacao(vetormerge, 0, vetormerge.length-1);
		tempofim = System.nanoTime();
		double tempomerge = (tempofim - tempoinicio)/Math.pow(10, 9);
		
		int[] vetorquick = vetor.clone(); 
		tempoinicio =  System.nanoTime();
		vetorquick = quick.quickSort(vetorquick, 0, vetorquick.length-1);
		tempofim = System.nanoTime();
		double tempoquick = (tempofim - tempoinicio)/Math.pow(10, 9);
	
		System.out.println("Tempo do bubblesort: "+tempobubble+"\nTempo do mergesort: "+tempomerge+"\nTempo do quicksort: "+tempoquick);
	}
}