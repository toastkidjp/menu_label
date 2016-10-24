package jp.toastkid.jfxlistview;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Example app of MenuLabel.
 *
 * @author Toast kid
 */
public class Main extends Application {

    /** Application title. */
    private static final String TITLE = "Menu Label & JFXListView";

    /** fxml. */
    private static final String FXML_PATH = "jfxlistview.fxml";

    /** Stage. */
    private Stage stage;

    @Override
    public void start(final Stage arg0) throws Exception {
        stage = new Stage(StageStyle.DECORATED);

        try {
            final FXMLLoader loader
                = new FXMLLoader(getClass().getClassLoader().getResource(FXML_PATH));
            final Parent load = loader.load();
            final Scene scene = new Scene(load);
            scene.getStylesheets()
                .add(getClass().getClassLoader().getResource("snackbar.css").toExternalForm());
            stage.setScene(scene);
            final Controller controller = (Controller) loader.getController();
            controller.setOnClose(this::close);
        } catch (final IOException e) {
            e.printStackTrace();
        }

        stage.setResizable(true);
        stage.setTitle(TITLE);
        stage.show();
    }

    /**
     * Close this app.
     */
    private void close() {
        stage.close();
    }

    /**
     * Main method.
     * @param args
     */
    public static void main(final String[] args) {
        Application.launch(Main.class);
    }
}
