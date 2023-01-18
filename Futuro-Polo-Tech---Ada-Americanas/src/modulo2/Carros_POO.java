package modulo2;

import java.util.Scanner;

public class Carros_POO {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		//Meu carro
		String cor = "vermelho";
		String marca = "BMW";
		String modelo = "X5";
		boolean isLigado = true;
		int velocidade = 0;
		
		String cor2 = "vermelho";
		String marca2 = "BMW";
		String modelo2 = "X5";
		boolean isLigado2 = true;
		int velocidade2 = 0;
		
		int escolha;
		
		while (isLigado) {
			System.out.println();
			System.out.println("Escolha uma operação:");
			System.out.println("1- Acelerar");
			System.out.println("2 - Frear");
			System.out.println("3- Estado Atual");
			System.out.println("0 - Desligar");
			System.out.printf("Operação");
			System.out.println();
			
			escolha = scan.nextInt();
			
			if (escolha == 0) {
				isLigado = false;
			}else if(escolha == 1){
				velocidade += 10; //velocidade= velocidade + 10
				
				System.out.printf("Você acelerou e sua velocidade atual é de %dkm/h", velocidade);
			} else if (escolha == 2) {
				velocidade -=10;
				System.out.printf("Você freou e sua velocidade atual é de %dkm/h", velocidade);
			}else if (escolha == 3) {
				System.out.println("");
			}
		}

	}

}
