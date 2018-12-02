package sprint1;

import java.time.LocalDateTime;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class AnswerFormPane {
	Member member;
	Group group;
	Question question;
	
	AnswerFormPane(Member member, Group group, Question question){
		this.member = member;
		this.group = group;
		this.question = question;
	}
	
	public VBox createAnswerFormPane() {
		Label answerL = new Label("Add Answer to \n"+ question.getTitle());
		Label questionDescriptionL = new Label(question.getText());
		TextArea answerTA = new TextArea();
		Button btnSubmit = new Button("Submit");
		btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(!answerTA.getText().isEmpty()) {
					LocalDateTime dateCreated = LocalDateTime.now();
					Answer answer = new Answer(question,answerTA.getText(),dateCreated);
							member.addAnswer(group, question, answer, dateCreated);
				}
			}
			
		});
		VBox vb = new VBox();
		vb.getChildren().addAll(answerL,questionDescriptionL, answerTA, btnSubmit);
		return vb;
	}
	
}
