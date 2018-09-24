import java.util.Date;

public class MemberTest {

	public static void main(String[] args) {
		
		
		//Tests constructor
		Member mem1 = new Member("Alex", "Amundson", "screenName", "asamundson@valdosta.edu", new Date());
		
		//Test getEmailAddress()
		System.out.println( mem1.getEmailAddress() );
		//Test getDateCreated
		System.out.println( mem1.getDateCreated() );
		//Test getFirstName
		System.out.println( mem1.getFirstName() );
		//Test getLastName
		System.out.println( mem1.getLastName() );
		//Test getScreenName()
		System.out.println( mem1.getScreenName() );
		
		//Test joinGroup()    Joins this member to group and records the dateJoined
		Group group1 = new Group("Group#1", "GroupDescription", new Date() );//creates a group
		Group group2 = new Group("Group#2", "GroupDescription", new Date() );
		Group group3 = new Group("Group#3", "GroupDescription", new Date() );
		Group group4 = new Group("Group#4", "GroupDescription", new Date() );
		
		
		mem1.joinGroup(group1, new Date());
		mem1.joinGroup(group2, new Date());
		mem1.joinGroup(group3, new Date());
		mem1.joinGroup(group4, new Date());
		
		
		//Test getNumGroups()     Tested with 0,1, and 4 groups  
		System.out.println(mem1.getNumGroups());
		
		//Test getGroup()      Returns the Group that corresponds to the groupID
		                      //where group ID is the group's name
		System.out.println(mem1.getGroup("Group#1"));
		
		//Test getGroups()
		System.out.println( mem1.getGroups() );
		
		//Test addQuestion()
		Question q1 = new Question("Question1", "text", new Date());
		Question q2 = new Question("Question2", "text", new Date());
		Question q3 = new Question("Question3", "text", new Date());
		mem1.addQuestion(group1, q1, new Date());//add q1 to group1
		mem1.addQuestion(group2, q2, new Date());//add q2 to group2
		mem1.addQuestion(group2, q3, new Date());//add q3 to group2
		
		//Test getDateJoined()
		System.out.println( mem1.getDateJoined(group1) );
		System.out.println( mem1.getDateJoined(group2) );
		System.out.println( mem1.getDateJoined(group3) );
		System.out.println( mem1.getDateJoined(group4) );
		
		//Test addAnswer()
		Answer answer1 = new Answer(q1, "Answer to q1", new Date() );
		mem1.addAnswer(group1, q1, answer1, new Date() );
		
		
		//Test getQuestions()
		System.out.println( mem1.getQuestions(group1) );
		System.out.println( mem1.getQuestions(group2) );
		
		//Test getAnswers()
		System.out.println( mem1.getAnswers(group1) );
		System.out.println( mem1.getQuestions(group2) );
		
		//Test toString()
		System.out.println(mem1);
	}

}