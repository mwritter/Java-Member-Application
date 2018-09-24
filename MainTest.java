import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class MainTest {

    public static void main(String[] args) {
        Date date = new Date();

        Member matt = new Member("Matthew", "Ritter", "Matt", "mwritter@valdosta.edu", date);
        Member virginia = new Member("Virginia", "Ritter", "Gin", "vrharnevious@valdosta.edu", date);
        Group group1 = new Group("First Group", "This is an awesome Group1", date);
        Group group2 = new Group("Second Group", "This is an awesome Group2", date);

        matt.joinGroup(group1, date);
        matt.joinGroup(group2, date);
        virginia.joinGroup(group2, date);

        Question question1 = new Question("First Question Title", "Is this a question?", date);
        Question question2 = new Question("Second Question Title", "Do you know?", date);

        matt.addQuestion(group1, question1, date);
        matt.addQuestion(group1, question2, date);
        matt.addQuestion(group2, question2, date);

        for (Group group : matt.getGroups()) {
            System.out.println(matt.getScreenName() + " Joined: " + group.getTitle() + matt.getDateJoined(group) + "\n"
                    + "============");
        }

        Answer answer1 = new Answer(question1, "This is the answer", date);

        matt.addAnswer(group1, question1, answer1, date);
        System.out.println("GetQuestions: " + matt.getQuestions(group1));
        System.out.println("GetAnswers: " + matt.getAnswers(group1));
        System.out.println("GetAuthor: " + answer1.getAuthor());
        System.out.println("Member toString method: " + matt.toString());
        System.out.println("No errors Member and Membership look good");

    }

}
