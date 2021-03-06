/**
 * @author Gladson Souza de Araújo
 * 
 * Classe utilitária para mecânicas e constantes
 * de parâmetros utilizadas no jogo.
 */

package game.component;

import java.io.File;

import javax.swing.ImageIcon;

import game.sound.Sound;

public final class Util {

	/* Variavel de controle do teclado*/
	public static boolean[] keyControl= new boolean[4];
	
	/* Variavel de Controle de Jogo */
	public static boolean PLAYING = true;
	public static boolean STOP = false;
	public static int SHOOT_COUNT = 0;
	
	/* Constantes dos Audios */
	public static Sound SOUND_PHASE = new Sound(new File("res\\sound\\phaseTheme.mp3"));

	public static boolean STATUS_SOUND = true;
	public static boolean STATUS_EFFECTS = true;

	/* Constante Geral Nula */
	public static final int NONE = 0;

	/* Tamanho da Tela */
	public static final int DEFAULT_SCREEN_WIDTH = 550;
	public static final int DEFAULT_SCREEN_HEIGHT = 650;

	/* Constantes de Velocidade */
	public static final int SPEED_HIGH = 15;
	public static final int SPEED_MEDIUM = 10;
	public static final int SPEED_SLOW = 5;

	/* Constantes do Tamanho da Nave do Player */
	public static final int PLAYER_POSITION_X = 240;
	public static final int PLAYER_POSITION_Y = 500;
	public static final int PLAYER_WIDTH = 100;
	public static final int PLAYER_HEIGHT = 100;

	/* Player dano */
	public static boolean hit;

	/* Constantes das imagens das Naves Inimigas */
	public static final String ENEMY_IMAGES[] = { "res\\ship\\EnemyShip\\EnemyShipSprite1.png",
			"res\\ship\\EnemyShip\\EnemyShipSprite2.png" };

	/* Imagem do status do Laser */
	public static final String LASER_CHARGE[] = { "res\\hud\\laserEmptyCharge.png", "res\\hud\\laser10Charge.png",
			"res\\hud\\laser20Charge.png", "res\\hud\\laser30Charge.png", "res\\hud\\laser40Charge.png",
			"res\\hud\\laser50Charge.png", "res\\hud\\laser60Charge.png", "res\\hud\\laser70Charge.png",
			"res\\hud\\laser80Charge.png", "res\\hud\\laser90Charge.png", "res\\hud\\laserFullCharge.png" };

	/* Imagem da vida do Boss */
	public static final String BOSS_LIFE[] = { "res\\hud\\bossLifeEmpty.png", "res\\hud\\bossLife_1.png",
			"res\\hud\\bossLifeHalf.png", "res\\hud\\bossLife_3.png", "res\\hud\\bossLifeFull.png" };

	/* Constantes do Tamanho das Naves Inimigas */
	public static final int ENEMY_POSITION = -100;
	public static final int ENEMY_WIDTH = 70;
	public static final int ENEMY_HEIGHT = 70;

	/* Tempo de Explosao */
	public static final int EXPLOSION_TIME = 55;

	// Fundo gamestart

	public static final ImageIcon backgroundMenu = new ImageIcon("res\\background\\menuBack.png");
	public static final ImageIcon backgroundMenu2 = new ImageIcon("res\\background\\menuBack2.png");
	public static final ImageIcon quodGame = new ImageIcon("res\\logo\\QuodGame.png");
	public static final ImageIcon backgroundGame = new ImageIcon("res\\background\\ground.png");

	/*
	 * Essa classe verifica se o objeto a colide com o objeto b
	 */
	public static boolean colision(GameObject a, GameObject b) {

		// Plano de colisao X
		int aColisionPanelWidth = a.getX() + a.getWidth();
		int bColisionPanelWidth = b.getX() + b.getWidth();

		// Plano de colisao Y
		int aColisionPanelHeight = a.getY() + a.getHeight();
		int bColisionPanelHeight = b.getY() + b.getHeight();

		// verifica se houve colisao
		if ((a.getX() >= b.getX() && a.getX() <= bColisionPanelWidth
				|| b.getX() >= a.getX() && b.getX() <= aColisionPanelWidth)
				&& (a.getY() >= b.getY() && a.getY() <= bColisionPanelHeight
						|| b.getY() >= a.getY() && b.getY() <= aColisionPanelHeight))
			return true;

		return false;
	}

}
