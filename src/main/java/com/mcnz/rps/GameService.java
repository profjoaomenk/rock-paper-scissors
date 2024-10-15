package com.mcnz.rps;

import java.util.HashMap;

public class GameService {
	HashMap<String, Integer> jogadas = new HashMap<String, Integer>() {{
		put("rock", 1);
		put("paper", 2);
		put("scissors", 3);
	}};

	private Integer modulo (int a, int b){
		return ((a % b) + b) % b;
	}

	public GameSummary playRoshambo(String clientGesture) {

		String result;
		int jogadaComputador = (int) Math.floor(Math.random() * jogadas.size());
		String valorJogadaComputador = jogadas.keySet().toArray(new String[0])[jogadaComputador];

		if((this.modulo(jogadas.get(clientGesture) - jogadas.get(valorJogadaComputador), jogadas.size()) % 2) == 1) {
			result = "win";
		}else if((jogadas.get(clientGesture) - jogadas.get(valorJogadaComputador)) == 0){
			result = "tie";
		}else{
			result = "lose";
		}

		GameSummary gameSummary = new GameSummary(clientGesture, valorJogadaComputador, result);
		return gameSummary;
	}

}  
  