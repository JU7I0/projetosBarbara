package Lista2;

import java.util.Scanner;

public class Atv2 {
	/*Escreva um programa que lê uma palavra e a escreve de volta ao contrário.*/
	
		  public static void main(String[] args) {
		    // Lê a palavra
		    Scanner scanner = new Scanner(System.in);
		    
		    System.out.print("Digite a palavra: ");
		    String palavra = scanner.nextLine();

		    // Cria uma nova string vazia para armazenar a palavra invertida
		    String palavraInvertida = "";

		    // A palavra de trás pra frente
		    for (int i = palavra.length() - 1; i >= 0; i--) {
		      // Adiciona o caractere atual à palavra invertida
		      palavraInvertida += palavra.charAt(i);
		    }

		    // Imprime a palavra invertida
		    System.out.println(palavraInvertida);
		  }
		
}
