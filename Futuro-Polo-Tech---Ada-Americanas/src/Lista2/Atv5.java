package Lista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atv5 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		List<String> convidados = new ArrayList<>();
		
		for(int i=0; i< 5; i++) {
			System.out.print("Insira o nome do convidado na lista: ");
			String nome = scanner.nextLine();
			convidados.add(nome);
		}
		
		String nomeLongo= "";
		for (String nome: convidados){
			if(nome.length()> nomeLongo.length()) {
				nomeLongo = nome;
			}
		}
		
		System.out.println("O nome mais longo da lista é: "+ nomeLongo);
	}

}
