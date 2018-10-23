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
		Date date = new Date();
		Question q1 = new Question("Q1 title", "What time is it", date);
		
		assertEquals("Q1 title", q1.getTitle());
	}

	@Test
	void testSetTitle() {
		Date date = new Date();
		Question q1 = new Question("Q1 title", "What time is it", date);
		q1.setTitle("New Title");
		assertEquals("New Title", q1.getTitle());
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
