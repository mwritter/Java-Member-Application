package sprint1;
import java.util.List;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class IntMainTest {

    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();

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

        System.out.println("============");
        System.out.println("getMember(mwritter@valdosta.edu):" + group1.getMember("mwritter@valdosta.edu"));
        System.out.println("============");

        for (Group group : matt.getGroups()) {
            System.out.println(matt.getScreenName() + " Joined: " + group.getTitle() + " " + matt.getDateJoined(group)
                    + "\n" + "============");
        }
        for (Group group : virginia.getGroups()) {
            System.out.println(virginia.getScreenName() + " Joined: " + group.getTitle() + " "
                    + virginia.getDateJoined(group) + "\n" + "============\n");
        }
        System.out.println("============");
        System.out.println("getMembers(group2):" + group2.getMembers());
        System.out.println("============");
        Answer answer1 = new Answer(question1, "This is the answer", date);

        matt.addAnswer(group1, question1, answer1, date);
        System.out.println("============");
        System.out.println("GetQuestions For Matt: \n" + matt.getQuestions(group1));
        System.out.println("============");
        System.out.println("GetAnswers For Matt: " + matt.getAnswers(group1));
        System.out.println("============");
        System.out.println("GetAnswers For Group1: " + group1.getAnswers());
        System.out.println("============");
        System.out.println("GetAuthor of answer1" + answer1.getAuthor());
        System.out.println("============");
        System.out.println("Member toString method: " + matt.toString());
        System.out.println("============");
        System.out.println("***************SITEMANAGER STUFF***********");
        SiteManager sm = new SiteManager();
        sm.addGroup("First Group", "This is an awesome Group1", date);
        sm.addGroup("Second Group", "This is an awesome Group2", date);
        sm.addMember("Matthew", "Ritter", "Matt", "mwritter@valdosta.edu", date);
        sm.getMember("mwritter@valdosta.edu").joinGroup(sm.getGroup("Second Group"), date);
        sm.getMember("mwritter@valdosta.edu").joinGroup(sm.getGroup("First Group"), date);
        System.out.println(sm.getMember("mwritter@valdosta.edu"));
        System.out.println(sm.getGroup("First Group"));
        System.out.println("g2 has: "+sm.getGroup("Second Group").getMembers());
        System.out.println("g1 has: "+sm.getGroup("First Group").getMembers());
        System.out.println(sm.getPopularGroups(5));
        System.out.println("No errors");

    }

}