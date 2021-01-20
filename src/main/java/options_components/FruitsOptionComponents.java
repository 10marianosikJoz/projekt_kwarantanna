package options_components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class FruitsOptionComponents {
    private Image bananaImage = new Image("banany.png", 130, 130, true, true);
    private ImageView bananImageView = new ImageView(bananaImage);
    private Image pearImage = new Image("gruszka.png", 130, 130, true, true);
    private ImageView pearImageView = new ImageView(pearImage);
    private Image appleImage = new Image("jablko.png", 130, 130, true, true);
    private ImageView appleImageView = new ImageView(appleImage);
    private Image kiwiImage = new Image("kiwi.png", 130, 130, true, true);
    private ImageView kiwiImageView = new ImageView(kiwiImage);
    private Image strawberryImage = new Image("truskawka.png", 130, 130, true, true);
    private ImageView strawberryImageView = new ImageView(strawberryImage);
    private Image plumImage = new Image("sliwka.png", 130, 130, true, true);
    private ImageView plumImageView = new ImageView(plumImage);

    public void setPlumProperties() {
        plumImageView.setX(20);
        plumImageView.setY(20);

    }

    public void setPearProperties() {
        pearImageView.setX(155);
        pearImageView.setY(20);

    }

    public void setAppleProperties() {
        appleImageView.setX(275);
        appleImageView.setY(20);

    }

    public void setKiwiProperties() {
        kiwiImageView.setX(410);
        kiwiImageView.setY(20);

    }

    public void setStrawberryProperties() {
        strawberryImageView.setX(545);
        strawberryImageView.setY(20);

    }

    public void setBananaProperties() {
        bananImageView.setX(680);
        bananImageView.setY(20);

    }

    public ImageView getBananImageView() {
        setBananaProperties();
        return bananImageView;
    }

    public ImageView getPearImageView() {
        setPearProperties();
        return pearImageView;
    }

    public ImageView getAppleImageView() {
        setAppleProperties();
        return appleImageView;
    }

    public ImageView getKiwiImageView() {
        setKiwiProperties();
        return kiwiImageView;
    }

    public ImageView getStrawberryImageView() {
        setStrawberryProperties();
        return strawberryImageView;
    }

    public ImageView getPlumImageView() {
        setPlumProperties();
        return plumImageView;
    }
}
