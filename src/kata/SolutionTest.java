package kata;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
class SolutionTest {

	@Test
	void test() {
		assertEquals("dlrow", Kata.solution("world"));
		assertEquals("word", Kata.solution("drow"));
	}

}
