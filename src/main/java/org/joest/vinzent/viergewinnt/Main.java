package org.joest.vinzent.viergewinnt;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Vier Gewinnt");
		JMenuBar menuBar = new JMenuBar();
		JMenu gameMenu = new JMenu("Spiel");
		JMenuItem newGameMenuItem = new JMenuItem("Neues Spiel");
		JMenuItem saveGameMenuItem = new JMenuItem("Spiel speichern");
        JMenuItem loadGameMenuItem = new JMenuItem("Spiel laden");
		gameMenu.add(newGameMenuItem);
        gameMenu.add(saveGameMenuItem);
        gameMenu.add(loadGameMenuItem);
		gameMenu.add(new JSeparator());
		JMenuItem quitGameMenuItem = new JMenuItem("Spiel beenden");
        gameMenu.add(quitGameMenuItem);
		menuBar.add(gameMenu);
		frame.add(menuBar);
		frame.setVisible(true);
		
		
	}

}
