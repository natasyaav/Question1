import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import javafx.geometry.Insets;

/**
 * Natasya Virgichalia
 * Date: 11/26/2017
 * Question 16.22
 */
public class audioClip extends Application {
    final String audio = "http://cs.armstrong.edu/liang/common/audio/anthem/anthem2.mp3";

    @Override
    public void start(Stage primaryStage) {
        AudioClip audioClip = new AudioClip(audio);
        Button play = new Button("Play");
        Button loop = new Button("Loop");
        Button stop = new Button("Stop");

        play.setOnAction(e -> {
            if(audioClip.isPlaying()) {
                audioClip.stop();
            }
            audioClip.setCycleCount(1);
            audioClip.play();
        });
        loop.setOnAction(e -> {
            if(audioClip.isPlaying()) {
                audioClip.stop();
            }
            audioClip.setCycleCount(AudioClip.INDEFINITE);
            audioClip.play();
        });
        stop.setOnAction(e -> audioClip.stop());
        HBox pane = new HBox (play, loop, stop);
        pane.setSpacing(10);
        pane.setPadding(new Insets(10));
        primaryStage.setTitle("Audio Clip");
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
