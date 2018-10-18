package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnswerTest {

	Date date = new Date();
	Question q = new Question("Question One", "This is a question?", date);
	Answer a = new Answer(q, "This is an answer!", date);
	
	
	@Test
	void testAnswer() {
		String expected = "Answer: This is an answer! for question Question One";
		assertTrue(a.toString().equals(expected));
	}

	@Test
	void testGetQuestion() {
		String expected = a.getQuestion().getText();
		assertEquals(expected, q.getText());
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
