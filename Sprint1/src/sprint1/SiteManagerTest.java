package sprint1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class SiteManagerTest {
	static int index = 0;
	int random;
	static SiteManager sm = new SiteManager();
	static LocalDateTime dateCreated = LocalDateTime.now();
	
	@BeforeAll
	static void startText(){
		while(index < 100) {
			sm.addMember("Member-" + index, "lastname", ""+index, index + "@gmail.com", dateCreated);
			if(index % 10 == 0) {
				sm.addGroup("Group-" + index/10, index/10+" is great", dateCreated);
			}
			index++;
		}
		
	}
	
	@Test
	void testSiteManager() {
		assertTrue(sm != null);
		
	}

	@Test
	void testAddMember() {
		sm.addMember("Matthew", "Ritter", "Matt", "mritter2283@gmail.com", dateCreated);
		Member matt = new Member("Matthew", "Ritter", "Matt", "mritter2283@gmail.com", dateCreated);
		assertTrue(sm.getMember("mritter2283@gmail.com").getFirstName().equals(matt.getFirstName()));
		
	}

	@Test
	void testGetMember() {
		assertTrue(sm.getMember("1@gmail.com").getFirstName().equals("Member-1"));
	}

	@Test
	void testGetMembers() {
		assertTrue(sm.getMembers().size() == 101);
		assertTrue(sm.getMembers().get(0).getFirstName().equals("Member-0"));
	}

	@Test
	void testGetMembersString() {
		fail("Not yet implemented");
	}

	@Test
	void testAddGroup() {
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
	void testGetGroupsString() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPopularGroups() {
		fail("Not yet implemented");
	}

	@Test
	void testGetActiveGroups() {
		fail("Not yet implemented");
	}

	@Test
	void testGetActiveMembers() {
		fail("Not yet implemented");
	}

}
