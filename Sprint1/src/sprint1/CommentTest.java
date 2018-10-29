package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class CommentTest {

	@Test
	void testComment() {
		LocalDateTime date = LocalDateTime.now();
		Member m = new Member("matthew","ritter","matt", "mritter2283@gmail.com", date);
		Question q = new Question("Question", "What time is it?", date);
		Comment comment = new Comment("This is a comment", m, q);
		
		assertTrue(comment != null);
		
	}

	@Test
	void testGetText() {
		LocalDateTime date = LocalDateTime.now();
		Member m = new Member("matthew","ritter","matt", "mritter2283@gmail.com", date);
		Question q = new Question("Question", "What time is it?", date);
		Comment comment = new Comment("It depends on where you live.", m, q);
		String expected = "It depends on where you live.";
		assertEquals(expected, comment.getText());
	}

	@Test
	void testEditText() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCommentor() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPost() {
		fail("Not yet implemented");
	}

}
