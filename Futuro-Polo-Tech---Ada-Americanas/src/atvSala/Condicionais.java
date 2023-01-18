package atvSala;

import java.util.Scanner;


public class Condicionais {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Tempo tempo = new Tempo();
		
		System.out.println("Escreva o ano: ");
		var ano = scanner.nextInt();
		tempo.setAno(ano);
		
		System.out.println("Escreva o mês: ");
		var mes = scanner.nextInt();
		tempo.setMes(mes);
		
		System.out.println("Escreva o dia: ");
		var dia = scanner.nextInt();
		tempo.setDia(dia);
		
		System.out.println("Escreva o hora: ");
		var hora = scanner.nextInt();
		tempo.setHora(hora);
		
		System.out.println("Escreva o minuto: ");
		var minuto = scanner.nextInt();
		tempo.setMinuto(minuto);
		
		System.out.println("Escreva o segundo: ");
		var segundo = scanner.nextInt();
		tempo.setSegundo(segundo);

	}
}
