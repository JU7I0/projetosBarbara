package Lista2;

import java.util.Scanner;

public class Atv6 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Insira uma palavra: ");
	String palavra = scanner.nextLine();
	
	for (int i=0; i< palavra.length(); i++) {
		char c = palavra.charAt(i);
		if (i % 2 == 1) {
			System.out.print(Character.toUpperCase(c));
		} else {
			System.out.print(c);
		}
	}

	}

}
