package options_components;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BreadOptionComponents {
    private Image baguetteImage = new Image("bagietka.png", 130, 130, true, true);
    private ImageView baguetteImageView = new ImageView(baguetteImage);
    private Image rollBreadImage = new Image("bulka.png", 130, 130, true, true);
    private ImageView rollBreadImageView = new ImageView(rollBreadImage);
    private Image breadImage = new Image("chleb.png", 130, 130, true, true);
    private ImageView breadImageView = new ImageView(breadImage);
    private Image toastImage = new Image("tost.png", 130, 130, true, true);
    private ImageView toastImageView = new ImageView(toastImage);
    private Image croissantImage = new Image("rogal.png", 130, 130, true, true);
    private ImageView croissantImageView = new ImageView(croissantImage);
    private Image rollsImage = new Image("obwazanek.png", 130, 130, true, true);
    private ImageView rollsImageView = new ImageView(rollsImage);

    public void setBaguetteProperties(){
        baguetteImageView.setX(20);
        baguetteImageView.setY(20);
    }

    public void setBreadProperties() {
        breadImageView.setX(140);
        breadImageView.setY(20);
    }

    public void setCroissantProperties() {
        croissantImageView.setX(260);
        croissantImageView.setY(20);
    }

    public void setRollBreadProperties() {
        rollBreadImageView.setX(422);
        rollBreadImageView.setY(20);
    }

    public void setRollsProperties() {
        rollsImageView.setX(565);
        rollsImageView.setY(20);
    }

    public void setToastProperties() {
        toastImageView.setX(700);
        toastImageView.setY(20);
    }

    public ImageView getBaguetteImageView() {
        setBaguetteProperties();
        return baguetteImageView;
    }

    public ImageView getRollBreadImageView() {
        setRollBreadProperties();
        return rollBreadImageView;
    }

    public ImageView getBreadImageView() {

        setBreadProperties();
    return breadImageView;
    }

    public ImageView getToastImageView() {
        setToastProperties();
        return toastImageView;
    }

    public ImageView getCroissantImageView() {
        setCroissantProperties();
        return croissantImageView;
    }

    public ImageView getRollsImageView() {
        setRollsProperties();
        return rollsImageView;
    }
}
