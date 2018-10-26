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
		// Returns a list of all Members, sorted by last name, then first name
		public List<Member> getMembers() {
			if (memberList.size() < 1) {
				return memberList;
			}
			Collections.sort(memberList, new Comparator<Member>() {
				@Override
				public int compare(Member o1, Member o2) {
					int res = o1.getLastName().compareToIgnoreCase(o2.getLastName());
					if (res != 0)
						return res;
					return o1.getFirstName().compareTo(o2.getFirstName());
				}
			});
			return memberList;
		}
		// Returns a list of all Members where text (partially) matches any of
		// firstName, lastName,
		// screenName, emailAddress across all Members, sorted by last name, then first
		// name
		public List<Member> getMembers(String text) {
			List<Member> match = new ArrayList<>();
			for (Member Member : memberList) {
				if (Member.getFirstName().contains(text) || Member.getLastName().contains(text)
						|| Member.getScreenName().contains(text) || Member.getEmailAddress().contains(text)) {
					match.add(Member);
				}
			}
			Collections.sort(match, new Comparator<Member>() {
				@Override
				public int compare(Member o1, Member o2) {
					int res = o1.getLastName().compareToIgnoreCase(o2.getLastName());
					if (res != 0)
						return res;
					return o1.getFirstName().compareTo(o2.getFirstName());
				}
			});
			return match;
		}
}

