package view;

import controller.QuickSortController;

public class Principal {
	
	public static void main(String[] args) {
		QuickSortController qsc = new QuickSortController ();
		 int vetor[] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		 qsc.ordenarVetor(vetor);
		 imprimirVetor(vetor);
		 
	}
	
	private static void imprimirVetor(int[] vetor) {
	    for(int num : vetor) {
	      System.out.print(num + " ");
}
	}
}
