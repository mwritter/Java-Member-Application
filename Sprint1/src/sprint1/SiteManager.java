package sprint1;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class SiteManager {
	private List<Member> memberList = new ArrayList<>();
	private List<Group> groupList = new ArrayList<>();

	// Constructor, no responsibilities
	public SiteManager() {
	}
	
	// Adds a new Member provided they dont already exist returning whether
		// successful or not
		public boolean addMember(String firstName, String lastName, String screenName, String emailAddress,
				LocalDateTime dateCreated) {
			Member newMember = new Member(firstName, lastName, screenName, emailAddress, dateCreated);
			for (int i = 0; i < memberList.size(); i++) {
				if (newMember.equals(memberList.get(i))) {
					return false;
				}
			}
			memberList.add(newMember);
			return true;

		}
		// Returns the Member corresponding to this emailAddress if they exist
		public Member getMember(String emailAddress) {
			Member member = null;
			if (memberList.size() == 0) {
				return member;
			}
			for (int i = 0; i < memberList.size(); i++) {
				if (memberList.get(i).getEmailAddress().equals(emailAddress)) {
					member = memberList.get(i);
					break;
				}
			}
			return member;
		}
}

