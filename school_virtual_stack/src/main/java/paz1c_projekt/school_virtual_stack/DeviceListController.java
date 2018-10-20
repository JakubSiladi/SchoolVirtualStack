package paz1c_projekt.school_virtual_stack;

import java.beans.PropertyVetoException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.util.Callback;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class DeviceListController {
	
	private DeviceDAO deviceDAO = new DeviceDAO();
    private ObservableList<Device> devicesModel;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private ListView<Device> devicesListView;

    @FXML
    private TableView<Device> devicesTableView;

    @FXML
    private Button AddButton;

    @FXML
    private Button EditButton;

    @SuppressWarnings("restriction")
	@FXML
    void initialize() {
    	devicesModel = FXCollections.observableArrayList(deviceDAO.getAll());
    	devicesListView.setItems(devicesModel);
    	
    	TableColumn<Device, String> nazovCol = new TableColumn<Device, String>("Nazov");
    	TableColumn<Device, String> zodpovednaOsobaCol = new TableColumn<Device, String>("Zodpovedna osoba");
    	TableColumn<Device, String> ucebnaCol = new TableColumn<Device, String>("Ucebna");
    	
    	nazovCol.setCellValueFactory(new PropertyValueFactory<Device, String>("nazov"));
    	zodpovednaOsobaCol.setCellValueFactory(new PropertyValueFactory<Device, String>("zodpovednaOsoba"));
    	ucebnaCol.setCellValueFactory(new PropertyValueFactory<Device, String>("ucebna"));
    	
    	devicesTableView.getColumns().addAll(nazovCol, zodpovednaOsobaCol, ucebnaCol);
    	
    	devicesTableView.setItems(devicesModel);
    }
}
