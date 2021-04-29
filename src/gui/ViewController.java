package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button btnTeste;
	
	@FXML
	public void onBtnTestAction() {
		System.out.println("Ops! Click Here");
		Alerts.showAlert("Titulo", "header", "Ola", AlertType.INFORMATION);
	}

}
