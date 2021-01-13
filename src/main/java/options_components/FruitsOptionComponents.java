package options_components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FruitsOptionComponents {
    private Image bananaImage = new Image("banany.png", 100, 100, true, true);
    private ImageView bananImageView = new ImageView(bananaImage);
    private Image pearImage = new Image("gruszka.jpg", 100, 100, true, true);
    private ImageView pearImageView = new ImageView(pearImage);
    private Image appleImage = new Image("jablko.jpg", 100, 100, true, true);
    private ImageView appleImageView = new ImageView(appleImage);
    private Image kiwiImage = new Image("kiwi.png", 100, 100, true, true);
    private ImageView kiwiImageView = new ImageView(kiwiImage);
    private Image strawberryImage = new Image("truskawka.png", 100, 100, true, true);
    private ImageView strawberryImageView = new ImageView(strawberryImage);
    private Image plumImage = new Image("sliwka.jpg", 100, 100, true, true);
    private ImageView plumImageView = new ImageView(plumImage);

    public void setPlumProperties(){
        plumImageView.setY(120);

    }
    public void setPearProperties(){
        pearImageView.setY(240);

    }
    public void setAppleProperties(){
        appleImageView.setY(360);

    }
    public void setKiwiProperties(){
        kiwiImageView.setY(480);

    }
    public void setStrawberryProperties(){
        strawberryImageView.setY(600);

    }
    public void setBananaProperties(){
        pearImageView.setY(600);

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
