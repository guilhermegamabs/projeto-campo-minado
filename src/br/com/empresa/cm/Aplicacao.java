package br.com.empresa.cm;

import br.com.empresa.cm.model.*;
import br.com.empresa.cm.view.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}
}
