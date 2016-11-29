import javafx.scene.Scene;//Scene, text, Font, effect, layout
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.effect.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.geometry.*;
import javax.swing.JOptionPane;


public class Savey extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	StringDetails stuffs = new StringDetails();

	Stage stage;
	Scene home;
	//Box and Scenes form other classes
	HBox abt, hwTo, devs;
	//Scene retrieveScene;
	GridPane retrieveGrid;
	//majorNodes for Scene1
	HBox top;
	TilePane menu;
	VBox navigate;
	TilePane bottom;
	GridPane center;
	BorderPane borders;

	//minorNodes
	Text appName, repoText;
	Button createRepo;
	Button aboutBooty, howToUse, retrieve, developers; // menuButtons 

	//GridLabels
	Label account, username, password;
	TextField acct, uName, pWord;
	PasswordField pWord2;
	CheckBox intruder;

	Label repoLabel,masterKeyLabel;
	TextField repoTextField;
	Button retrieveButton;
	PasswordField masterKey;

	public void start(Stage primaryStage){

		stage = primaryStage;
		appName = new Text("BOOTY");
		appName.setId("appName");
		appName.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 30));
		appName.setFill(Color.BLUE);

		top = new HBox();
		top.setId("top");
		top.setAlignment(Pos.CENTER);
		top.getChildren().addAll(appName);

		//menuBar nodes
		aboutBooty = new Button("About");
		aboutBooty.setOnAction(
			e-> {
				aboutBox();
			});
		howToUse = new Button("HowTo");
		//howToUse.setOnAction();
		retrieve = new Button("Retrieve");
		retrieve.setOnAction(
			e -> {
				toRetrieveScene();
			});
		developers = new Button("Developers");
		developers.setOnAction(
			e->{
				devsBox();
			});

		//menuBar
		menu = new TilePane();
		menu.setId("menu");
		menu.setAlignment(Pos.CENTER);
		menu.setPadding(new Insets(10));
		menu.getChildren().addAll(aboutBooty, howToUse, retrieve, developers);
		menu.setAlignment(Pos.CENTER);

		// text (Create a repo here)
		repoText = new Text("Create a new repository here:");
		repoText.setId("repoText");
		repoText.setFont(Font.font("Lucida Calligraphy", FontWeight.BOLD, 15));

		//grid actions
		account = new Label("Account");
		acct = new TextField();
		acct.setPromptText("e.g Facebook, Twitter etc.");

		username = new Label("Username");
		uName = new TextField();
		uName.setPromptText("e.g booty@stuff.com");

		password = new Label("Password");
		pWord = new TextField();
		pWord.setPromptText("Make sure no one is watching\nWe want you to be sure of your input");

		intruder = new CheckBox("Intruder?");

		createRepo = new Button("Create");
		//createRepo.setOnAction();



		//center
		center = new GridPane();
		center.setHgap(5);
		center.setVgap(5);
		center.setAlignment(Pos.CENTER);
		center.add(menu,0,0,3,1);
		center.add(repoText,0,1,2,1);
		center.add(account,0,2);
		center.add(acct,1,2);
		center.add(username,0,3);
		center.add(uName,1,3);
		center.add(password,0,4);
		center.add(pWord,1,4);
		center.add(intruder,1,5);
		center.add(createRepo,1,6);
		center.setPadding(new Insets(10,10,10,10));

		//borders
		borders = new BorderPane();
		borders.setTop(top);
		borders.setCenter(center);
		//borders.setBottom();
		//borders.setLeft();
		
		//stage and scene


		home = new Scene(borders, 900, 600);
		stage.setScene(home);
		stage.setTitle("BOOTY");
		stage.show();

		home.getStylesheets().add(Savey.class.getResource("Savey.css").toExternalForm());
	}
	// calls gridpane to retrieve and Saves it
	private void toRetrieveScene(){
		createGridTwo();
		GridPane newGrid = returnGridTwo();
		borders.setCenter(newGrid);
	}
	// creates gridpane to retrieve and Saves it
	private void createGridTwo(){
		Text info = new Text("Hi, Kindly supply those informations\nYou could be an intruder  ");
		info.setId("repoText");
		info.setFont(Font.font("Lucida Calligraphy", FontWeight.BOLD, 15));
		PasswordField masterKey = new PasswordField();
		masterKeyLabel = new Label("Master Password");
		repoLabel = new Label("Repository Name");
		repoTextField = new TextField();
		repoTextField.setPromptText("Repository to retrieve from");
		retrieveButton = new Button("Retrieve");

		retrieveGrid = new GridPane();
		retrieveGrid.setHgap(5);
		retrieveGrid.setVgap(5);
		retrieveGrid.setAlignment(Pos.CENTER);
		retrieveGrid.add(menu,0,0,3,1);
		retrieveGrid.add(info,0,1,2,1);
		retrieveGrid.add(repoLabel,0,2);
		retrieveGrid.add(repoTextField,1,2);
		retrieveGrid.add(masterKeyLabel,0,3);
		retrieveGrid.add(masterKey,1,3);
		retrieveGrid.add(retrieveButton,1,4);
		center.setPadding(new Insets(10,10,10,10));
	}
	//returns Grid two
	private GridPane returnGridTwo(){
		return retrieveGrid;
	}
	private void intruderControl(){
		if(intruder.isSelected())
			//center.remove(pWord);
			center.add(pWord2,1,4);
	}
	private void aboutBox(){
		stuffs.createAboutBox();
		abt = stuffs.returnAboutBox();
		borders.setCenter(abt);
	}
	private void devsBox(){
		stuffs.createDeveloperInfo();
		devs = stuffs.returnDeveloperBox();
		borders.setCenter(devs);
	}
}

/*
	More features

	-manage repo
		clear()  clears all the data
		viewAll() retrieves all the data
		deleteSpecific() deletes specific data
		modify() modifies a reposotory
*/
