package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class PostTest {


	@Test
	void testGetText() {
		Date date = new Date();
		Member matt = new Member("Matthew", "Ritter", "Matt", "mritter2283@gmail.com", date);
		Group group1 = new Group("Group One", "The best Group ONE", date);
		matt.joinGroup(group1, date);
		Question q1 = new Question("Q1 Title", "Whats the weather like", date);
		Answer a1 = new Answer(q1, "Weather looks greate", date);
		matt.addQuestion(group1, q1, date);
		matt.addAnswer(group1, q1, a1, date);
		
		
		
		assertEquals("Weather looks greate", a1.getText());
	}

	@Test
	void testGetDate() {
		Date date = new Date();
		Member matt = new Member("Matthew", "Ritter", "Matt", "mritter2283@gmail.com", date);
		Group group1 = new Group("Group One", "The best Group ONE", date);
		matt.joinGroup(group1, date);
		Question q1 = new Question("Q1 Title", "Whats the weather like", date);
		Answer a1 = new Answer(q1, "Weather looks greate", date);
		matt.addQuestion(group1, q1, date);
		matt.addAnswer(group1, q1, a1, date);
		
		assertEquals(date,date);
	}

	@Test
	void testSetText() {
		Date date = new Date();
		Member matt = new Member("Matthew", "Ritter", "Matt", "mritter2283@gmail.com", date);
		Group group1 = new Group("Group One", "The best Group ONE", date);
		matt.joinGroup(group1, date);
		Question q1 = new Question("Q1 Title", "Whats the weather like", date);
		Answer a1 = new Answer(q1, "Weather looks greate", date);
		matt.addQuestion(group1, q1, date);
		matt.addAnswer(group1, q1, a1, date);
		
		a1.setText("I reset the answer");
		
		assertEquals("I reset the answer", a1.getText());
	}

	@Test
	void testGetAuthor() {
		Date date = new Date();
		Member matt = new Member("Matthew", "Ritter", "Matt", "mritter2283@gmail.com", date);
		Group group1 = new Group("Group One", "The best Group ONE", date);
		matt.joinGroup(group1, date);
		Question q1 = new Question("Q1 Title", "Whats the weather like", date);
		Answer a1 = new Answer(q1, "Weather looks greate", date);
		matt.addQuestion(group1, q1, date);
		matt.addAnswer(group1, q1, a1, date);
		
		assertEquals(matt, a1.getAuthor());
	}

	@Test
	void testGetGroup() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMembership() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMembership() {
		fail("Not yet implemented");
	}

}
