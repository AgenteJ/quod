/**
 * @author Gladson Souza de Ara�jo
 * @author Paulo Victor Ribeiro da Silva
 * 
 */

package game.main;

import javax.swing.JFrame;

public class QuodGame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	/*
	 * Construtor
	 */
	public QuodGame() {
		mainScreen();
	}
	
	/*
	 * Configura��es da Tela
	 */
	public void mainScreen() {
		setTitle("Quod - The Game");
		setSize(640, 480);
		add(new MainMenuScreen());
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		
	}
	
	/*
	 * M�todo Principal
	 */
	public static void main(String[] args) {
		new QuodGame();
	}
}
