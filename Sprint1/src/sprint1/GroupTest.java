package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;


class GroupTest {

	@Test
	void testGroup() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDateCreated() {
		Date date = new Date();
		Group group1 = new Group("Group One", "The best Group ONE", date);
		assertEquals(date, date);
	}

	@Test
	void testGetTitle() {
		Date date = new Date();
		Group group1 = new Group("Group One", "The best Group ONE", date);
		assertEquals(group1.getTitle(), "Group One");
	}

	@Test
	void testGetDescription() {
		Date date = new Date();
		Group group1 = new Group("Group One", "The best Group ONE", date);
		assertEquals("The best Group ONE", group1.getDescription());
	}

	@Test
	void testGetNumberOfMembers() {
		Date date = new Date();
		Member matt = new Member("Matthew", "Ritter", "Matt", "mritter2283@gmail.com", date);
		Group group1 = new Group("Group One", "The best Group ONE", date);
		matt.joinGroup(group1, date);
		assertEquals(1,group1.getNumberOfMembers());
	}

	@Test
	void testGetMember() {
		Date date = new Date();
		Member matt = new Member("Matthew", "Ritter", "Matt", "mritter2283@gmail.com", date);
		Group group1 = new Group("Group One", "The best Group ONE", date);
		matt.joinGroup(group1, date);
		assertEquals(matt,group1.getMember("mritter2283@gmail.com"));
	}

	@Test
	void testAddMembership() {
		Date date = new Date();
		Member matt = new Member("Matthew", "Ritter", "Matt", "mritter2283@gmail.com", date);
		Group group1 = new Group("Group One", "The best Group ONE", date);
		matt.joinGroup(group1, date);
		assertEquals(1, group1.getNumberOfMembers());
	}

	@Test
	void testGetMembers() {
		Date date = new Date();
		Member matt = new Member("Matthew", "Ritter", "Matt", "mritter2283@gmail.com", date);
		Group group1 = new Group("Group One", "The best Group ONE", date);
		matt.joinGroup(group1, date);
		List<Member> myGroupMembers = new ArrayList<Member>();
		myGroupMembers.add(matt);
		
		assertEquals(myGroupMembers,group1.getMembers());
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
