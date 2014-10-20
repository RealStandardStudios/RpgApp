package view.partials.dialogs;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import jefXif.view.DialogController;
import view.objects.LanguageRow;

/**
 * @author Matthew
 *
 */

public class SelectLanguagesDialogController extends DialogController {
	//region FXML elements
	@FXML
	TableView<LanguageRow> tableLanguages;
	@FXML
	TableColumn<LanguageRow,String> columnName;
	@FXML
	TableColumn<LanguageRow,CheckBox> columnSelected;
	//endregion
	
	ObservableList<LanguageRow> languages;
	
	@Override
	public void handleOkay(ActionEvent event) {
		this.getDialogStage().close();
	}
	
	public void setData(String[] strings) {
		this.languages = FXCollections.observableArrayList();
		
		for (String string : strings) {
			this.languages.add(new LanguageRow(string));
		}
		
		this.tableLanguages.setItems(this.languages);
		this.columnName.setCellValueFactory(cellData->cellData.getValue().Language);
		this.columnSelected.setCellValueFactory(cellData->cellData.getValue().CheckBox);
		this.languages.get(0).CheckBox.get().setSelected(true);
		this.languages.get(0).CheckBox.get().setDisable(true);
	}
	
	public String[] getData() {
		ArrayList<String> chosenLanguages = new ArrayList<>();
		
		for (LanguageRow row : languages) {
			if(row.isLanguageSelected()) chosenLanguages.add(row.Language.get());
		}
		return chosenLanguages.toArray(new String[chosenLanguages.size()]);
	}
}
