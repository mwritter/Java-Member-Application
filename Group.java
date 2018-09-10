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

    public Date getDateCreated() {
        return dateCreated;
    }

    // Returns this groups title
    public String getTitle() {
        return title;
    }

    // Returns this groups description
    public String getDescription() {
        return description;
    }

    public int getNumberOfMembers() {
        return -1;
    }

    // Returns the Member of this group that corresponds to the emailAddress
    public Member getMember(String emailAddress) {

        for (Membership m : memberships) {
            if (m.getMember().name.equals(emailAddress)) {
                return m.getMember();
            }
        }
        return new Member("Dummy", "NoEmail");
    }
}