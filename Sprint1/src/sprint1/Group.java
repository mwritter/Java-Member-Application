package sprint1;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Group {
    private LocalDateTime dateCreated;
    private String title;
    private String description;
    private List<Answer> answers;
    private List<Membership> memberships = new ArrayList<>();
    private List<Question> questions;

    Group(String title, String description, LocalDateTime date) {
        this.title = title;
        this.description = description;
        this.dateCreated = date;
    }

    LocalDateTime getDateCreated() {
        return dateCreated;
    }

    String getTitle() {
        return title;
    }

    // Returns this groups description
    String getDescription() {
        return description;
    }

    int getNumOfMembers() {
        return memberships.size();
    }

    // Returns the Member of this group that corresponds to the emailAddress
    Member getMember(String emailAddress) {
        for (Membership membership : memberships) {
        	System.out.println(membership.getMember().getEmailAddress());
            if (membership.getMember().getEmailAddress().equals(emailAddress)) {
                return membership.getMember();
            }
        }
        
        return null;
    }

    void addMembership(Membership membership) {
        memberships.add(membership);
    }

    List<Member> getMembers() {
        List<Member> members = new ArrayList<>();
        for (Membership membership : memberships) {
        	
            members.add(membership.getMember());
        }
        
        Collections.sort(members, new Comparator<Member>() {
        	public int compare(Member m1, Member m2) {
        		if(m1.getLastName().equals(m2.getLastName())) {
        			return m1.getFirstName().compareTo(m2.getFirstName());
        		} else {
        			return m1.getLastName().compareTo(m2.getLastName());
        		}
        	}
        });
        
        return members;
    }

    // Returns all questions that have been asked in this group in the order
    // that they were asked
    List<Question> getQuestions() {
    	List<Question> groupQuestions = new ArrayList<>();
    	for(Member member : this.getMembers()) {
    		for(Question question : member.getQuestions(this)) {
    			groupQuestions.add(question);
    		}
    		
    	}
        return groupQuestions;
    }

    // Returns all answers to all questions that have been asked in this group in
    // the order
    // that they were answered
    List<Answer> getAnswers() {
    	List<Answer> groupAnswers = new ArrayList<>();
    	for(Member member : this.getMembers()) {
    		for(Answer answer : member.getAnswers(this)) {
    			groupAnswers.add(answer);
    		}
    		
    	}
        return groupAnswers;
    }
    
   
    

    // Provides useful information about this group, neatly formatted
    public String toString() {
        return "Group: " + this.title;
    }
    
}