package com.piggydoom;

import java.io.IOException;
import javafx.fxml.FXML;

public class importController {

    @FXML
    public void switchToGallery() throws IOException {
        App.setRoot("gallery");
    }
}