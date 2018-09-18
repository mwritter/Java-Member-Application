import java.util.Date;

abstract class Post {

	//initialize variables
	protected String text;
	protected Date date;
   
   protected Membership membership;
	
	//constructor to set initial values
	public Post(String txt, Date date) {
		
		text = txt;
		this.date = date;
		
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
	public void setText (String text) {
		
		this.text = text;
		
	}
	
	//returns author name
	public Member getAuthor() {
		
		return membership.member;
		
	}
	
	//returns group name
	public Group getGroup() {
		
		return membership.group;
		
	}
	
	//sets membership status
	protected void setMembership(Membership originalMembership) {
		
		this.membership = originalMembership;
				
	}
	
	//returns membership status
	protected Membership getMembership() {
		
		return membership;
		
	}

}
