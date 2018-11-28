package sprint1;


import java.time.LocalDateTime;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Controller {
	SiteManager sm;
	
	@FXML
	private ListView<String> options;
	@FXML
	private TextArea optionInstructions;
	@FXML
	private BorderPane mainFrame;
	@FXML
	private GridPane mainFunction;
	
	
	public void initialize() {
		sm = new SiteManager();
		String[] siteOptions = {"Add Member", "Add Group", "Get Member", "Get Group"};
		options.getItems().setAll(siteOptions);
		options.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		optionInstructions.setEditable(false);
		optionInstructions.setPrefRowCount(1);
	}
	
	@FXML
	public void handleClickListView() {
		String option = options.getSelectionModel().getSelectedItem();
		optionInstructions.setText("You've Choosen to: " + option);
		if(option.equals("Add Member")) {
			createAddMemberScene();
		} else {
			mainFunction.getChildren().clear();
		}
		
	}
	
	private void createAddMemberScene() {
		//String firstName, String lastName, String screenName, String emailAddress, LocalDateTime dateCreated
		Label emailL = new Label("Email");
		TextField emailTF = new TextField();
		Label firstNameL = new Label("First Name");
		TextField firstNameTF = new TextField();
		Label lastNameL = new Label("Last Name");
		TextField lastNameTF = new TextField();
		Label screenNameL = new Label("Screen Name");
		TextField screenNameTF = new TextField();
		Button btnSave = new Button();
		btnSave.setText("Save");
		btnSave.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if(!emailTF.getText().isEmpty()) {
					LocalDateTime dateCreated = LocalDateTime.now();
					sm.addMember(firstNameTF.getText(), lastNameTF.getText(), screenNameTF.getText(), emailTF.getText(), dateCreated);
					System.out.println(sm.getMembers());
				} else {
					System.out.println("Email is Empty");
				}	
			}
		});
		
		mainFunction.setAlignment(Pos.CENTER);
		mainFunction.setPadding(new Insets(20,20,20,20));
		mainFunction.getChildren().clear();	
		mainFunction.add(emailL, 0, 0);
		mainFunction.add(emailTF, 1, 0);
		mainFunction.add(firstNameL, 0, 1);
		mainFunction.add(firstNameTF, 1, 1);
		mainFunction.add(lastNameL, 0, 2);
		mainFunction.add(lastNameTF, 1, 2);
		mainFunction.add(screenNameL, 0, 3);
		mainFunction.add(screenNameTF, 1, 3);
		mainFunction.add(btnSave, 2, 4);
		
	}
	
	
}
