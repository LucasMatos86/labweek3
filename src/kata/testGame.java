package kata;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class testGame {
	private Game game = new Game();
	@Test
	void test() {
		assertEquals("small deck", "Steve wins 2 to 1",
				game.winner(new String[] { "A", "9", "8" }, new String[] { "K", "5", "9" }));

		assertEquals("small deck", "Tie", game.winner(new String[] { "T" }, new String[] { "T" }));
	}
}
