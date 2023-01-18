package Lista2;

public class Atv9 {

	public static void main(String[] args) {
		
		    double populacaoA = 80000; 
		    double taxaCrescimentoA = 0.03; 
		    double populacaoB = 200000; 
		    double taxaCrescimentoB = 0.015; 

		    int anos = 0; 

		    
		    while (populacaoA < populacaoB) {
		     
		      populacaoA += populacaoA * taxaCrescimentoA;
		      populacaoB += populacaoB * taxaCrescimentoB;
		      
		      anos++;
		    }

		    
		    System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a do país B.");
		  }
		

	}


