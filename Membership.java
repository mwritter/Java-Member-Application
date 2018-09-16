package PackageName;

import java.util.Date;
import java.util.List;

class Membership {//this class should have package level visibility
	//instance variables
	private Date dateJoined;
	private int points =0;
	
    Member member;
	Group group;
	List<Question> questions;
	List<Answer> answers;
	
	
	
	//constructor method
	Membership(Date dateJoined, Member mem, Group grp) {
		this.dateJoined = dateJoined;
		this.member = mem;
		this.group = grp;
		//this.points = points;
	}
	
	
	public String toString() {
		return this.member +"joined " + this.group + "on " + this.dateJoined + ".";
	}
}
