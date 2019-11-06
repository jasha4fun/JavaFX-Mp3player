package mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;


public class ControlPaneController {

    @FXML
    private Button previousButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider progressSlider;

    public void initialize() {
        System.out.println("Control controller created");
        configureButtons();
        configureSliders();
    }

    private void configureSliders() {
        volumeSlider.valueProperty().addListener((observable, oldValue, newValue) ->
                System.out.println("Change in volume" + newValue.doubleValue()));

        progressSlider.valueProperty().addListener(x ->
                System.out.println("Song shift"));

    }

    private void configureButtons() {
        previousButton.setOnAction(event -> System.out.println("Previous song"));
        nextButton.setOnAction(x -> System.out.println("Next song"));
        playButton.setOnAction(event -> {
            if (playButton.isSelected()) {
                System.out.println("Play");
            } else {
                System.out.println("Stop");
            }
        });
    }

}

