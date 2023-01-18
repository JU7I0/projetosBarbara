package Lista2;

import java.util.Scanner;

public class Atv3 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		
		int[] numeros = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("Entre com um número "+ (i+1) + ": ");
			numeros[i] = leia.nextInt();
		}
		
		System.out.print("Numeros Impares: ");
		for (int numero: numeros) {
			if(numero %2 != 0) {
				System.out.print(numero+ " ");
			}
		}
		System.out.println();
		
		System.out.print("Numeros Pares: ");
		for (int numero: numeros) {
			if (numero %2 ==0) {
				System.out.print(numero+ " ");
			}
		}
	}

}
