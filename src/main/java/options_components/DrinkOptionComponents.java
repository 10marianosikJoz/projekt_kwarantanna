package options_components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DrinkOptionComponents {
    private Image colaImage = new Image("cola.png", 130, 130, true, true);
    private ImageView colaImageView = new ImageView(colaImage);
    private Image teaImage = new Image("herbata.png", 130, 130, true, true);
    private ImageView teaImageView = new ImageView(teaImage);
    private Image coffeeImage = new Image("kawa.png", 130, 130, true, true);
    private ImageView coffeeImageView = new ImageView(coffeeImage);
    private Image beerImage = new Image("piwo.png", 130, 130, true, true);
    private ImageView beerImageView = new ImageView(beerImage);
    private Image juiceImage = new Image("sok.png", 130, 130, true, true);
    private ImageView juiceImageView = new ImageView(juiceImage);
    private Image waterImage = new Image("woda.png", 130, 130, true, true);
    private ImageView waterImageView = new ImageView(waterImage);

    public void setColaProperties(){
        colaImageView.setX(20);
        colaImageView.setY(20);
    }
    public ImageView getColaImageView() {
        setColaProperties();
        return colaImageView;
    }
    public void setTeaProperties(){
        teaImageView.setX(140);
        teaImageView.setY(40);
    }
    public ImageView getTeaImageView() {
        setTeaProperties();
        return teaImageView;
    }
    public void setCoffeeProperties(){
        coffeeImageView.setX(260);
        coffeeImageView.setY(20);
    }

    public ImageView getCoffeeImageView() {
        setCoffeeProperties();
        return coffeeImageView;
    }

    public void setBeerProperties(){
        beerImageView.setX(380);
        beerImageView.setY(20);
    }

    public ImageView getBeerImageView()
    {  setBeerProperties();
        return beerImageView;
    }

    public void setJuiceProperties(){
        juiceImageView.setX(500);
        juiceImageView.setY(20);
    }
    public ImageView getJuiceImageView() {
        setJuiceProperties();
        return juiceImageView;
    }
    public void setWaterProperties(){
        waterImageView.setX(620);
        waterImageView.setY(20);
    }

    public ImageView getWaterImageView() {
        setWaterProperties();
        return waterImageView;
    }
}
