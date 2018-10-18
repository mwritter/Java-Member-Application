package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;



class MemberTest {
	
	Date date = new Date();
	Member matt = new Member("Matthew", "Ritter", "Matt", "mritter2283@gmail.com", date);
	@Test
	void testMember() {
		assertTrue(matt.getFirstName() != null && matt.getEmailAddress() != null);

	}

	@Test
	void testGetEmailAddress() {
		assertEquals("mritter2283@gmail.com", matt.getEmailAddress());
	}

	@Test
	void testGetDateCreated() {
		assertEquals(date, date);
	}

	@Test
	void testGetFirstName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLastName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetScreenName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMemberships() {
		fail("Not yet implemented");
	}

	@Test
	void testJoinGroup() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNumGroups() {
		fail("Not yet implemented");
	}

	@Test
	void testGetGroup() {
		fail("Not yet implemented");
	}

	@Test
	void testGetGroups() {
		fail("Not yet implemented");
	}

	@Test
	void testAddQuestion() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDateJoined() {
		fail("Not yet implemented");
	}

	@Test
	void testAddAnswer() {
		fail("Not yet implemented");
	}

	@Test
	void testGetQuestions() {
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
