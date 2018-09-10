public class Group {
    Date dateCreated;
    String title;
    String description;
    private List<Answer> answers;
    private List<Membership> memberships;
    private List<Question> questions;

    public Group(String title, String description, Date date) {
		this.title = title;
		this.description = description;
		this.dateCreated = date;
	}