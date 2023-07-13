package aula5Exercicio3;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<String, Integer> scores = new HashMap<>();
		scores.put("Time Branco", 25);
		scores.put("Time Preto", 65);
		scores.put("Time Amarelo", 35);
		scores.put("Time Verde", 28);
				
		String timeComMaiorPontuacao = getTeamWithHighestScore(scores);

		System.out.println("Equipe com a maior pontuação: " + timeComMaiorPontuacao);
	}
	
	/**
	 * 
	 * @param scores
	 * @return
	 */
	public static String getTeamWithHighestScore(Map<String, Integer> scores) {
		String teamWithHighestScore = null;
		int highestScore = Integer.MIN_VALUE;

		for (Map.Entry<String, Integer> entry : scores.entrySet()) {
			String team = entry.getKey();
			int score = entry.getValue();

			if (score > highestScore) {
				teamWithHighestScore = team;
				highestScore = score;
			}
		}
		return teamWithHighestScore;
	}
}
