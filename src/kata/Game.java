package kata;

public class Game {
	public String winner(String[] deckSteve, String[] deckJosh) {
		int steveScore = 0;
		int joshScore = 0;

		for (int i = 0; i < deckSteve.length; i++) {
			String steveCard = deckSteve[i];
			String joshCard = deckJosh[i];

			int comparison = compareCards(steveCard, joshCard);
			if (comparison > 0) {
				steveScore++;
			} else if (comparison < 0) {
				joshScore++;
			}
		}

		if (steveScore > joshScore) {
			return "Steve wins " + steveScore + " to " + joshScore;
		} else if (steveScore < joshScore) {
			return "Josh wins " + joshScore + " to " + steveScore;
		} else {
			return "Tie";
		}
	}

	private int compareCards(String card1, String card2) {
		String rankOrder = "23456789TJQKA";
		return rankOrder.indexOf(card1) - rankOrder.indexOf(card2);
	}

}
