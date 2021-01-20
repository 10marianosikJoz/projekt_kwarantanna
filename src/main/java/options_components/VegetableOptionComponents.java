package options_components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class VegetableOptionComponents {

    private Image garlicImage = new Image("czosnek.png", 130, 130, true, true);
    private ImageView garlicImageView = new ImageView(garlicImage);
    private Image cabbageImage = new Image("kapusta.png", 130, 130, true, true);
    private ImageView cabbageImageView = new ImageView(cabbageImage);
    private Image carrotImage = new Image("marchewka.png", 130, 130, true, true);
    private ImageView carrotImageView = new ImageView(carrotImage);
    private Image paprikaImage = new Image("papryka.png", 130, 130, true, true);
    private ImageView paprikaImageView = new ImageView(paprikaImage);
    private Image tomatoImage = new Image("pomidor.png", 130, 130, true, true);
    private ImageView tomatoImageView = new ImageView(tomatoImage);
    private Image potatoImage = new Image("ziemniaki.png", 130, 130, true, true);
    private ImageView potatoImageView = new ImageView(potatoImage);

    public void setGarlicProperties(){
        garlicImageView.setX(20);
        garlicImageView.setY(20);
    }
    public ImageView getGarlicImageView() {
        setGarlicProperties();
        return garlicImageView;
    }
    public void setCabbageProperties(){
        cabbageImageView.setX(150);
        cabbageImageView.setY(20);
    }
    public ImageView getCabbageImageView() {
        setCabbageProperties();
        return cabbageImageView;
    }
    public void setCarrotProperties(){
        carrotImageView.setX(260);
        carrotImageView.setY(20);
    }

    public ImageView getCarrotImageView() {
        setCarrotProperties();
        return carrotImageView;
    }

    public void setPaprikaProperties(){
        paprikaImageView.setX(380);
        paprikaImageView.setY(20);
    }

    public ImageView getPaprikaImageView() {
        setPaprikaProperties();
        return paprikaImageView;
    }

    public void setTomatoProperties(){
        tomatoImageView.setX(500);
        tomatoImageView.setY(20);
    }

    public ImageView getTomatoImageView() {
        setTomatoProperties();
        return tomatoImageView;
    }
    public void setPotatoProperties(){
        potatoImageView.setX(630);
        potatoImageView.setY(20);
    }

    public ImageView getPotatoImageView() {
        setPotatoProperties();
        return potatoImageView;
    }
}
