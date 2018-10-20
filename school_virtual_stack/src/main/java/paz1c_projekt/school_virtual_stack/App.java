package paz1c_projekt.school_virtual_stack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class App extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		DeviceListController mainController = new DeviceListController();
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("DeviceList.fxml"));
		fxmlLoader.setController(mainController);
		Parent rootPane = fxmlLoader.load();
 		Scene scene = new Scene(rootPane);
		primaryStage.setTitle("Správa školského vybavenia");
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
	
    public static void main( String[] args ) {
        launch(args);
    }
}
