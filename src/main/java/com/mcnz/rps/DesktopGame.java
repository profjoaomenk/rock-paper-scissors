package com.mcnz.rps;

import javax.swing.JOptionPane;

public class DesktopGame {
	public enum Gesture {rock,paper,scissors};

	public static void main(String[] args) {

		GameService gameService = new GameService();
		String prompt = "Will it be rock, paper or scissors?";
		Score score = new Score();
		java.util.Vector<GameSummary> history = new java.util.Vector<GameSummary>();

		while (true) {
			String input = JOptionPane.showInputDialog(prompt);

			GameSummary gs = gameService.playRoshambo(input);
			history.add(gs);

			JOptionPane.showMessageDialog(null, gs.getResult());
			System.out.println(score);
			for (GameSummary gameSummary : history) {
				System.out.println(gameSummary);
			}
			
		}
	}
}


