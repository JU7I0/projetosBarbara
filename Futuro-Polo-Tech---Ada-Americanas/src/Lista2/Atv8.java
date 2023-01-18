package Lista2;

import java.util.Scanner;

public class Atv8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] nome = new String[5];
		double[] altura= new double[5];
		double[] peso = new double[5];
		double imc=0;
		
		for (int i = 0; i < 5; i++) {
		      System.out.println("Informe o nome da pessoa " + (i+1) + ": ");
		      nome[i] = scanner.nextLine();

		      System.out.println("Informe o peso da pessoa " + (i+1) + ": ");
		      peso[i] = scanner.nextDouble();
		      scanner.nextLine();
		      
		      System.out.println("Informe a altura da pessoa " + (i+1) + ": ");
		      altura[i] = scanner.nextDouble();
		      scanner.nextLine();
		      
		      imc = peso[i]/ (altura[i] * altura[i]);
		      
		     
		      System.out.println();
		      
		      if (imc<18.5 || imc >25) {
		    	  
		    	  System.out.println("Você está fora do peso ideal!");
		    	  System.out.println();
		    
		      } else {
		    	  System.out.println("Você está dentro do peso ideal!");
		    	  System.out.println();
		      }
		}

	}
}
