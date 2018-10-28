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
		public boolean addGroup(String title, String description, LocalDateTime dateCreated) {
			Group newGroup = new Group(title, description, dateCreated);
			for (int i = 0; i < groupList.size(); i++) {
				if (newGroup.equals(groupList.get(i))) {
					return false;
				}
			}
			groupList.add(newGroup);
			return true;
		}
		// Returns the Group corresponding to this title if it exists
		public Group getGroup(String title) {
			Group group = null;
			if (groupList.size() == 0) {
				return group;
			}
			for (int i = 0; i < groupList.size(); i++) {
				if (groupList.get(i).getTitle().equals(title)) {
					group = groupList.get(i);
					break;
				}
			}

			return group;
		}
		public List<Group> getGroups() {
			if (groupList.size() <= 1) {
				return groupList;
			}
			Collections.sort(groupList, new Comparator<Group>() {
				@Override
				public int compare(Group o1, Group o2) {
					return o1.getTitle().compareTo(o2.getTitle());
				}
			});
			return groupList;
		}
		// Returns a list of all Groups where text (partially) matches any of title or
		// description across all Groups, sorted by title
		public List<Group> getGroups(String text) {
			List<Group> match = new ArrayList<>();
			for (Group group : groupList) {
				if (group.getTitle().contains(text) || group.getDescription().contains(text)) {
					match.add(group);
				}
			}
			Collections.sort(match, new Comparator<Group>() {
				@Override
				public int compare(Group o1, Group o2) {
					return o1.getTitle().compareTo(o2.getTitle());
				}
			});
			return match;

		}
		// Returns a list of the n Groups that have the most members, sorted descending
		// on the number of members
		public List<Group> getPopularGroups(int n) {
			List<Group> popularGroups = new ArrayList<>();
			for (int i = 0; i < groupList.size(); i++) {
				popularGroups.add(groupList.get(i));
			}
			
			Collections.sort(popularGroups, new Comparator<Group>() {
				@Override
				public int compare(Group group1, Group group2) {
					
					if(group1.getNumOfMembers() > group2.getNumOfMembers()) {
						return 1;
					}else if(group1.getNumOfMembers() < group2.getNumOfMembers()) {
						return -1;
					}else {
						return 0;
					}
					
				}
			});

			for (int i = 0; i < popularGroups.size() - n; i++) {
				popularGroups.remove(i);
			}
			Collections.reverse(popularGroups);
			return popularGroups.subList(0, n);
		}
		
		// Returns a list of the n Groups that have the most questions and answers
		// combined, sorted descending on the total number of questions and answers
		public List<Group> getActiveGroups(int n) {
			List<Group> activeGroups = new ArrayList<>();
			for (int i = 0; i < groupList.size(); i++) {
				activeGroups.add(groupList.get(i));
			}
			Collections.sort(activeGroups, new Comparator<Group>() {
				@Override
				
				public int compare(Group group1, Group group2) {
					
					if(group1.getQuestions().size() + group1.getAnswers().size() > group2.getQuestions().size() + group2.getAnswers().size()) {
						return 1;
					}else if(group1.getQuestions().size() + group1.getAnswers().size() < group2.getQuestions().size() + group2.getAnswers().size()) {
						return -1;
					}else {
						return 0;
					}
					
				}
			});

			for (int i = 0; i < activeGroups.size() - n; i++) {
				activeGroups.remove(i);
			}
			Collections.reverse(activeGroups);
			return activeGroups.subList(0, n);
		}
		// Returns a list of the n Members that have the most questions and answers
		// across all the groups they are a member of, sorted descending on the total
		// questions and answers
		public List<Member> getActiveMembers(int n) {
			List<Member> activeMembers = new ArrayList<>();
			// for (int i=0; i< memberList.size(); i++) {//////////Unnecessary?///
			// activeMembers.add(memberList.get(i) );///////Unnecessary?/////
			// } ////////////////////////
			Map<Integer, Member> map = new TreeMap<>();
			for (Member Member : memberList) {
				int counter = 0;
				for (Membership Membership : Member.getMemberships()) {
					counter += (Membership.getQuestions().size() + Membership.getAnswers().size());

				}
				map.put((Integer) (counter), Member);
			}

			// put n-last members in Treemap into activeMembers
			for (int i = n; i > 0; i--) {
				activeMembers.add(map.get(i));
			}

			return activeMembers;
		}
	
}

