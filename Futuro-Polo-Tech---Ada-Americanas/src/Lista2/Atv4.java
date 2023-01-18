package Lista2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> numeros = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.print("Insira um número: ");
			int numero = scanner.nextInt();
			numeros.add(numero);
		}
		
		int max = Collections.max(numeros);
		int min = Collections.min(numeros);
		
		int soma =0;
		for (int numero : numeros) {
			soma+= numero;
		}
		double media =(double) soma/ numeros.size();
		
		
	System.out.println("Número maior: "+ max);
	System.out.println("Número menor: "+ min);
	System.out.println("Média: "+ media);

	}

}
