package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class QuestionTest {

	@Test
	void testQuestion() {
		Date date = new Date();
		Question q1 = new Question("Q1 title", "What time is it", date);
		
		assertFalse(q1 == null);
	}

	@Test
	void testGetTitle() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTitle() {
		fail("Not yet implemented");
	}

	@Test
	void testAddAnswer() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAnswers() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
