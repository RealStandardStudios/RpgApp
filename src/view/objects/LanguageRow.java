package view.objects;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.CheckBox;
/**
 * A wrapper for the data stored in a row of the TableView on the SelectLanguagesDialog
 * @author Matthew
 */
public class LanguageRow {
	public StringProperty Language;
	public ObjectProperty<CheckBox> CheckBox;
	/**
	 * @return the Language
	 */
	public String getLanguage() {
		return Language.get();
	}
	/**
	 * @return whether the Language is selected
	 */
	public boolean isLanguageSelected() {
		return this.CheckBox.get().isSelected();
	}
	
	/**
	 * Creates a wrapper for the data stored in a row of the TableView on the SelectLanguagesDialog
	 * @param Language
	 */
	public LanguageRow(String language) {
		this.Language = new SimpleStringProperty(language);
		this.CheckBox = new SimpleObjectProperty<CheckBox>(new CheckBox());
	}
}
