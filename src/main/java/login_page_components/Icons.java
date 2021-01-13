package login_page_components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Icons {
    private Image logImage = new Image("enter.png");
    private ImageView logImageView = new ImageView(logImage);

    public void setLogImageView() {
        logImageView.setX(245);
        logImageView.setY(45);
        logImageView.setFitHeight(100);
        logImageView.setFitWidth(100);
        logImageView.setPreserveRatio(true);
    }

    public ImageView getLogImageView() {
        return logImageView;
    }

}


