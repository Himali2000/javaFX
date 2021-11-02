package java_fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Every javaFx application extends Application class. It has all the core functionalities for applications.
public class Main extends Application {

	// IDK why global to class. Write reasons when you find.
	Button button;
	
	public static void main(String[] args) {
		// Launch method goes into application class and sets-up program as javaFX
		launch(args);
	}
	
	// After launch method, Application class will call a method called start. But there is no method called 
	// start in main class. Hence, the user has to create a start method, and hence override the start method
	// in Application class.
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Hence, all the code written inside this method will be the core code.
		/*
		 * JAVAFX TERMINOLOGY
		 * Stage = Entire window including title, close, minimize/maximize button
		 * Scene = Content inside the Stage
		 */
		primaryStage.setTitle("Wraitpad");
		
		button = new Button(); 
		button.setText("Hit me");  // button = new Button("Hit me"); does the same work
		
		// Nothing will appear on the screen until coding the "layout". Up next "layout"
		StackPane layout = new StackPane();
		// It sets button in the middle of the scene. How? IDK ATM.
		layout.getChildren().add(button);
		
		// Create scene. In this case just one button.
		// The first parameter it will take is the layout. Hence pass the layout object to it. 
		// Other two parameters describes the size of the scene. It will be the size of entire window.
		Scene scene = new Scene(layout, 500, 500);
		primaryStage.setScene(scene);
		// This will actually launch and show the output window/stage
		primaryStage.show();
	} 
	
}
