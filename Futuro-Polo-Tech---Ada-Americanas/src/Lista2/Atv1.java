package Lista2;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv1 {
 /*Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de
  *  compras. Ao final da entrada dos 5 itens, exiba a lista completa.*/
		  public static void main(String[] args) {
		    // Criamos uma lista vazia para armazenar as frutas
		    ArrayList<String> carrinhoDeCompras = new ArrayList<String>();

		    // Lêmos o nome de cada fruta e adicionamos à lista
		    Scanner scanner = new Scanner(System.in);
		    for (int i = 0; i < 5; i++) {
		      System.out.print("Informe o nome da fruta: ");
		      String nomeDaFruta = scanner.nextLine();
		      carrinhoDeCompras.add(nomeDaFruta);
		    }

		    // Exibimos a lista completa de frutas no carrinho de compras
		    System.out.println("Frutas no carrinho de compras:");
		    for (String fruta : carrinhoDeCompras) {
		      System.out.println(fruta);
		    }
		  }
}
