import java.util.Date;
import java.util.List;
import java.util.ArrayList;

class Membership {
	//instance variables
	private Date dateJoined;
	private int points =0;	
    private Member member;
	private Group group;
	private List<Question> questions = new ArrayList<>();
	private List<Answer> answers = new ArrayList<>();
	

	//constructor method
	public Membership(Date dateJoined, Member member, Group group) {
		this.dateJoined = dateJoined;
		this.member = member;
		this.group = group;
		//this.points = points; 
	}	
	
	
	//returns the date the member joined the group
    Date getDateJoined() {
		return this.dateJoined;
	}
	
    
    //returns the member in this membership
	Member getMember() {
		return member;
	}
	
	
	//returns the group in this membership
	Group getGroup() {
		return group;
	}

    
	//returns all questions in this membership
    List<Question> getQuestions() {
		return questions;
	}


    //returns all answers in this membership
	List<Answer> getAnswers() {
		return answers;
	}
	

    //returns information about member and group and the date the member joined
	public String toString() {
		return "\n" + this.member +"joined " + this.group + "on " + this.dateJoined + ".";
	}
	
}