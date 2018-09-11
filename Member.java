package PackageName;

import java.util.Date;

public class Member {

	// instance variables
	private Date dateCreated;
	private String firstName;
	private String lastName;
	private String screenName; // emailAddress & screenName must be unique
	private String emailAddress;

	// Constructor methods
	
	/*public Member(){}//no-argument constructor
	 */
	public Member(String firstName, String lastName, String screenName, String emailAddress, Date dateCreated) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.screenName = screenName;
		this.emailAddress = emailAddress;
		this.dateCreated = dateCreated;
	}

	// getter methods
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getScreenName() {
		return this.screenName;
	}
	// end of getter methods

	public void joinGroup(Group groupName, Date localDateTime) {

	}

	public int getNumGroups() {
		return ____;
	}

	public Group getGroup(String _____) {
		return ____;
	}

	public List<Group> getGroups() {

		return ____;
	}

	public void addQuestion(Group groupName, Question question, Date date) {

	}

	public Date getDateJoined(Group groupName {
		return ___;
	}

	public void addAnswer(Group groupName, Question question, Answer answer, Date date) {
	}

	public List<Question> getQuestions(Group groupName) {
	}

	public List<Answer> getAnswers(Group groupName) {
	}

	public String toString() {
		return "" + ____;

	}

}
