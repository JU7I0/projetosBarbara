package projetoModulo1;

import java.util.Scanner;

public class JogoDaVelha {
	private static final int DIMENSAO = 3;
	private char[][] tabuleiro;
	private char jogadorAtual;

	public JogoDaVelha() {
		tabuleiro = new char[DIMENSAO][DIMENSAO];
		jogadorAtual = 'X';
	}

	public boolean jogadaValida(int linha, int coluna) {
		if (linha < 0 || linha >= DIMENSAO || coluna < 0 || coluna >= DIMENSAO) {
			return false;
		}
		return tabuleiro[linha][coluna] == '\0';
	}

	public void efetuarJogada(int linha, int coluna) {
		tabuleiro[linha][coluna] = jogadorAtual;
		jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
	}

	public void imprimirTabuleiro() {
		for (int i = 0; i < DIMENSAO; i++) {
			for (int j = 0; j < DIMENSAO; j++) {
				System.out.print(tabuleiro[i][j] == '\0' ? ' ' : tabuleiro[i][j]);
				if (j < DIMENSAO - 1) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (i < DIMENSAO - 1) {
				System.out.println("---------");
			}
		}
	}

	public boolean testarFimDeJogo() {
		// Verifica se houve vitória nas linhas
		for (int i = 0; i < DIMENSAO; i++) {
			if (tabuleiro[i][0] != '\0' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
				return true;
			}
		}

		// Verifica se houve vitória nas colunas
		for (int i = 0; i < DIMENSAO; i++) {
			if (tabuleiro[0][i] != '\0' && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
				return true;
			}
		}

		// Verifica se houve vitória nas diagonais
		if (tabuleiro[0][0] != '\0' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
			return true;
		}
		if (tabuleiro[0][2] != '\0' && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
			return true;
		}

		// Verifica se o jogo empatou
		for (int i = 0; i < DIMENSAO; i++) {
			for (int j = 0; j < DIMENSAO; j++) {
				if (tabuleiro[i][j] == '\0') {
					return false;
				}
			}
		}

		return true;
	}
	
	public char getJogadorAtual() {
	    return jogadorAtual;
	  }
}
