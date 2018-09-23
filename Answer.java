import java.util.ArrayList;
import java.util.Date;
import java.util.List;


    public class Answer extends Post {
    	
    	private String title;
		private Question question;

		public Answer (Question question, String text, Date dateCreated) { 
    		super(text,dateCreated);
    		this.question = question;
    		}
        public Question getQuestion() {
			return question;
        }
        public String toString() {
			String result = "Answer: " + text + " for question " + question.getTitle();
			return result;
        
       }

    }
