package PackageName;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

class Membership {//this class should have package level visibility
	//instance variables
	private Date dateJoined;
	private int points =0;
	
    Member member;
	Group group;
	List<Question> questions = new ArrayList<>();
	List<Answer> answers = new ArrayList<>();
	
	
	
	//constructor method
	Membership(Date dateJoined, Member mem, Group grp) {
		this.dateJoined = dateJoined;
		this.member = mem;
		this.group = grp;
		//this.points = points;
	}
	
	
	//returns the date the member joined the goup
	 Date getDateJoined() {
		return this.dateJoined;
	}
	
	
	public String toString() {
		return this.member +"joined " + this.group + "on " + this.dateJoined + ".";
	}
}