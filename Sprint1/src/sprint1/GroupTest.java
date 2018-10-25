package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;


class GroupTest {
	LocalDateTime date = LocalDateTime.now();
	Group group1 = new Group("Group One", "The best Group ONE", date);
	Member matt = new Member("Matthew", "Ritter", "Matt", "mwritter@valdosta.edu", date);
	@Test
	void testGroup() {
		
		
		assertTrue(isGroup(group1));
	}
	
	boolean isGroup(Group g) {
		if(g.getDateCreated() != null && g.getTitle() != null && g.getDescription() != null) {
			return true;
		}
		return false;
	}

	@Test
	void testGetDateCreated() {
		
		assertEquals(date, date);
	}

	@Test
	void testGetTitle() {
		
		assertEquals(group1.getTitle(), "Group One");
	}

	@Test
	void testGetDescription() {
		
		assertEquals("The best Group ONE", group1.getDescription());
	}

	@Test
	void testGetNumberOfMembers() {
		
		
		matt.joinGroup(group1, date);
		assertEquals(1,group1.getNumOfMembers());
	}

	@Test
	void testGetMember() {
		
		matt.joinGroup(group1, date);
		assertEquals(matt,group1.getMember("mwritter@valdosta.edu"));
	}

	@Test
	void testAddMembership() {
		
		
		matt.joinGroup(group1, date);
		assertEquals(1, group1.getNumOfMembers());
	}

	@Test
	void testGetMembers() {
		Member b = new Member("V", "b", "Gin", "mwritter@valdosta.edu", date);
		Member a = new Member("M", "a", "Matt", "mwritter@valdosta.edu", date);
		
		matt.joinGroup(group1, date);
		List<String> myGroupMembers = new ArrayList<>();
		myGroupMembers.add(matt.getLastName());
		myGroupMembers.add(b.getLastName());
		myGroupMembers.add(a.getLastName());
		Collections.sort(myGroupMembers);
		b.joinGroup(group1, date);
		a.joinGroup(group1, date);
		System.out.println("THESE ARE THE MEMBERS: "+group1.getMembers());
		assertEquals(myGroupMembers.get(0),group1.getMembers().get(0).getLastName());
	}

	@Test
	void testGetQuestions() {
		
		
		matt.joinGroup(group1, date);
		Question q1 = new Question("Q1 Title", "Whats the weather like", date);
		matt.addQuestion(group1, q1, date);
		List<Question> myGroupQuestions = new ArrayList<Question>();
		myGroupQuestions.add(q1);
		System.out.println(myGroupQuestions);
		System.out.println(group1.getQuestions());
		
		assertEquals(myGroupQuestions, group1.getQuestions());
	}

	@Test
	void testGetAnswers() {
		
		
		matt.joinGroup(group1, date);
		Question q1 = new Question("Q1 Title", "Whats the weather like", date);
		Answer a1 = new Answer(q1, "Weather looks greate", date);
		matt.addQuestion(group1, q1, date);
		List<Question> myGroupQuestions = new ArrayList<Question>();
		List<Answer> myGroupAnswers = new ArrayList<Answer>();
		matt.addAnswer(group1, q1, a1, date);
		myGroupAnswers.add(a1);
		
		System.out.println(myGroupAnswers);
		System.out.println(group1.getAnswers());
		
		assertEquals(myGroupAnswers, group1.getAnswers());
	}

	@Test
	void testToString() {
		
		assertEquals("Group: Group One",group1.toString());
	}

}
