package jp.toastkid.menu_label;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXSnackbar.SnackbarEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

/**
 * Controller.
 *
 * @author Toast kid
 */
public class Controller implements Initializable {

    /** Root. */
    @FXML
    private Pane root;

    /** Snackbar. */
    @FXML
    private JFXSnackbar snackbar;

    /** closing command. */
    private Runnable command;

    /**
     * start timer.
     */
    @FXML
    private void hello() {
        snackbar.fireEvent(new SnackbarEvent("Hello!"));
    }

    /**
     * Run close command.
     */
    @FXML
    private void close() {
        command.run();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        snackbar.registerSnackbarContainer(root);
    }

    /**
     * Set action on close.
     * @param command
     */
    public void setOnClose(Runnable command) {
        this.command = command;
    }

}
