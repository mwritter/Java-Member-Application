package sprint1;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;


public class Member {

	// instance variables
	private Date dateCreated;
	private String firstName;
	private String lastName;
	private String screenName; // emailAddress & screenName must be unique
	private String emailAddress;
<<<<<<< HEAD:Member.java
	private List<Membership> memberships = new ArrayList<>();
	

=======
    
	private List<Membership> memberships = new ArrayList<>();
	


>>>>>>> dacdc6f67d3ba5e8bde4fdfc8b150056d03e09c3:Sprint1/src/sprint1/Member.java
	// Constructor method	
	public Member(String firstName, String lastName, String screenName, String emailAddress, Date dateCreated) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.screenName = screenName;
		this.emailAddress = emailAddress;
		this.dateCreated = dateCreated;
	}

	
	//returns email address
	public String getEmailAddress() {
		return this.emailAddress;
	}

	
	//returns the date member was created
	public Date getDateCreated() {
		return this.dateCreated;
	}

	
	//returns the member's first name
	public String getFirstName() {
		return this.firstName;
	}

	
	//returns the member's last name
	public String getLastName() {
		return this.lastName;
	}

	
	//returns screen name
	public String getScreenName() {
		return this.screenName;
	}
	
	
<<<<<<< HEAD:Member.java
	//returns list of memberships this member is a part of
=======
	//returns list of memberships this member is a part of////////////////////////////////
>>>>>>> dacdc6f67d3ba5e8bde4fdfc8b150056d03e09c3:Sprint1/src/sprint1/Member.java
	public List<Membership> getMemberships() {
		return memberships;
	}
	// end of getter methods
	
	
    //Joins this member to group and records the dateJoined
	public void joinGroup(Group groupName, Date localDateTime) {
		Membership membership = new Membership(localDateTime, this, groupName);
	    this.memberships.add(membership);
	    groupName.addMembership(membership);
	}

	
	//Returns the number of groups this member is a member of
	public int getNumGroups() {
		return this.memberships.size();
	}

	
	//Returns the Group that corresponds to the groupID
	public Group getGroup(String groupID) {
		Group temp = null;
		for (Membership membership: this.memberships) {
<<<<<<< HEAD:Member.java
			if ( membership.getGroup().getTitle().equals(groupID) ) {
=======
			if ( membership.getGroup().getTitle().equals(groupID) ) {//should group class have group ID variable?
>>>>>>> dacdc6f67d3ba5e8bde4fdfc8b150056d03e09c3:Sprint1/src/sprint1/Member.java
				temp = membership.getGroup();
			}
		}
		return temp;
	}

	
	//Returns a list of Groups the member is a member of
	public List<Group> getGroups() {
		ArrayList<Group> groupList = new ArrayList<Group>();
		for (Membership membership: this.memberships) {
			groupList.add(membership.getGroup());
		}
		return groupList;
	}	
	
	
	//Adds the question to the group by this member and records
	//the date the question was asked
	public void addQuestion(Group groupName, Question question, Date date) {
		for (Membership membership: memberships) {
			if (membership.getGroup().equals(groupName)) {
				question.setMembership(membership);
				membership.getQuestions().add(question);
				//membership.addQuestion(question);
			}
		}	
	}

	
	//Returns the date this member joined this group
	public Date getDateJoined(Group groupName) {
		Date temp =null;
		for (Membership membership: memberships) {
			if (membership.getGroup().equals(groupName)) {
				temp=membership.getDateJoined();
			}
		}
		return temp;
	}

	
	//Adds this member's answer to this question which is in this group and 
	//records the date answered
	public void addAnswer(Group groupName, Question question, Answer answer, Date date) {
		question.addAnswer(answer);
		for (Membership membership: memberships) {
			if (membership.getGroup().equals(groupName)) {
				answer.setMembership(membership);
				membership.getAnswers().add(answer);
<<<<<<< HEAD:Member.java
=======
				//membership.addAnswer(answer);
>>>>>>> dacdc6f67d3ba5e8bde4fdfc8b150056d03e09c3:Sprint1/src/sprint1/Member.java
			}
		}			
	}

	
	//Returns all questions asked by this member in this group
	public List<Question> getQuestions(Group group) {
		ArrayList<Question> questionsList = new ArrayList<Question>();
		for (Membership membership: memberships) {
			if (membership.getGroup().equals(group) ) {
				questionsList.addAll( membership.getQuestions());
			}
		}
		return questionsList;
	}

	
	//Returns all answers asked by this member in this group
	public List<Answer> getAnswers(Group groupName) {
		ArrayList<Answer> answersList = new ArrayList<Answer>();
		for (Membership membership: memberships) {
			if (membership.getGroup().equals(groupName)) {
				answersList.addAll( membership.getAnswers());
			}
		}
		return answersList;
	}

	
	//Provides useful information about this member, neatly formatted
	@Override
	public String toString() {
		return "\nMember Information" + //added "\n before "Member" and before "First" 
			   "\nFirst Name: " +this.firstName +
			   "\nLast Name: " + this.lastName + 
			   "\nScreen Name: " + this.screenName + 
			   "\nEmail address: " + this.emailAddress + 
			   "\nDate Joined: " + this.dateCreated;
	}
}//end of Member.java class