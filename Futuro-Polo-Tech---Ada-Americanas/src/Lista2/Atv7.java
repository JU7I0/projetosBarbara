package Lista2;

import java.util.Scanner;

public class Atv7 {
		
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in); 

	    String[] nomes = new String[5]; 
	    int[] idades = new int[5]; 
	    int idadeTotal = 0; 

	    
	    for (int i = 0; i < 5; i++) {
	      System.out.print("Informe o nome da pessoa " + (i+1) + ": ");
	      nomes[i] = scanner.nextLine();

	      System.out.print("Informe a idade da pessoa " + (i+1) + ": ");
	      idades[i] = scanner.nextInt();
	      scanner.nextLine(); 

	      idadeTotal += idades[i]; 
	    }

	    
	    int indiceMaisNovo = 0;
	    int indiceMaisVelho = 0;
	    for (int i = 1; i < 5; i++) {
	      if (idades[i] < idades[indiceMaisNovo]) {
	        indiceMaisNovo = i;
	      }
	      if (idades[i] > idades[indiceMaisVelho]) {
	        indiceMaisVelho = i;
	      }
	    }

	    
	    double mediaIdade = (double) idadeTotal / 5;

	    
	    System.out.println("A pessoa mais nova é " + nomes[indiceMaisNovo] + " com " + idades[indiceMaisNovo] + " anos.");
	    System.out.println("A pessoa mais velha é " + nomes[indiceMaisVelho] + " com " + idades[indiceMaisVelho] + " anos.");
	    System.out.println("A média de idade é " + mediaIdade + " anos.");
	  }
	}
