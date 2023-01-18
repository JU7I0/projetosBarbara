package projetoModulo1;

import java.util.Scanner;

public class MainJogoDaVelha {
	public static void main(String[] args) {
		JogoDaVelha jogo = new JogoDaVelha();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			jogo.imprimirTabuleiro();
			System.out.println();
			System.out.println(
					"Jogador " + jogo.getJogadorAtual() + ", escolha a linha e a coluna (0-2) para fazer sua jogada: ");
			int linha = scanner.nextInt();
			int coluna = scanner.nextInt();

			if (!jogo.jogadaValida(linha, coluna)) {
				System.out.println();
				System.out.println("Jogada inválida! Por favor, escolha uma posição válida.");
				System.out.println();
				continue;
			}

			jogo.efetuarJogada(linha, coluna);

			if (jogo.testarFimDeJogo()) {
				char vencedor = (jogo.getJogadorAtual() == 'X') ? 'O' : 'X';
				jogo.imprimirTabuleiro();
				System.out.println();
				System.out.println("O jogo acabou! O vencedor é o jogador " + vencedor + "!");
				break;
			}
		}
	}
}
