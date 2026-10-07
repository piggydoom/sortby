package com.piggydoom;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class controller {

    @FXML
    public GridPane gridPane;

    Image defImgIcon = new Image(getClass().getResource("/com/piggydoom/assets/defImgIcon.png").toExternalForm());

    public void switchToImport() throws IOException {
        App.setRoot("import");
    }

        public void writeThumbnails(){
        for(Node node : gridPane.getChildren()){
            // in future--> get true file > either write the file as a smaller sprite size if possible, if not write a seperate version that is already sprite size.

            System.out.println(node.getLayoutX() + " x " + node.getLayoutY());

        }
    }
}
