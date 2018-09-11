import java.util.Date;

class Post {

	//initialize variables
	protected String text;
	protected Date date;
	
	//constructor to set initial values
	public Post(String txt, Date date) {
		
		text = txt;
		date = new Date();
		
	}
	
	//returns value of text
	public String getText() {
		
		return text;
		
	}
	
	//returns local date value
	public Date getDate() {
		
		return date;
		
	}
	
	//sets/resets value in text
	public void setText (String txt) {
		
		text = txt;
		
	}
	
	//returns author name
	public Member getAuthor() {
		
		return member;
		
	}
	
	//returns group name
	public Group getGroup() {
		
		return group;
		
	}
	
	//sets membership status
	protected void setMembership(Membership m) {
		
		Membership mem = m;
		
		return mem;
		
	}
	
	//returns membership status
	protected Membership getMembership() {
		
		return membership;
		
	}

}
