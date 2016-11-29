import javafx.scene.paint.Color;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.effect.*;
import javafx.geometry.*;

public class StringDetails{

	public StringDetails(){

	}

	HBox aboutBox, whyBox, developers;
	public void createAboutBox(){
		String about = "Booty is an application that allows you to have just one password\nfor all your enterprise appplications\n\nBooty saves you the stress of having to memorise passwords\n\nSo you can save once and retrieve severally";
		Text abt = new Text(about);
		aboutBox = new HBox();
		aboutBox.setAlignment(Pos.CENTER);
		aboutBox.getChildren().addAll(abt);
	}
	public void createWhyAppBox(){
		String why = "Booty was created out of the frustration of having to play around Notepad trying to save passwords\nand also saving passwords on web storages\n\nBooty was built for fun";
		Text wy = new Text(why);
		whyBox = new HBox();
		whyBox.setAlignment(Pos.CENTER);
		whyBox.getChildren().addAll(wy);
	}
	public void createDeveloperInfo(){
		String devs = "This app was created by a team of intelligent developers\nall embedded in one developer\n\nThe only one you need to know\n\n\nDaniel Osineye";
		Text dvs = new Text(devs);
		developers = new HBox();
		developers.setAlignment(Pos.CENTER);
		developers.getChildren().addAll(dvs);
	}
	public HBox returnWhyBox(){
		return whyBox;
	}
	public HBox returnAboutBox(){
		return aboutBox;
	}
	public HBox returnDeveloperBox(){
		return developers;
	}
}

/*
	the app
	why booty

*/