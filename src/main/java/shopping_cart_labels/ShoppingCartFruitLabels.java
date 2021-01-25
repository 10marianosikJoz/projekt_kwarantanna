package shopping_cart_labels;

import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class ShoppingCartFruitLabels {
    private Label plumLabel = new Label("Plum");
    private Label pearLabel = new Label("Pear");
    private Label appleLabel = new Label("Apple");
    private Label kiwiLabel = new Label("Kiwi");
    private Label strawberryLabel = new Label("Strawberry");
    private Label bananaLabel = new Label("Banana");

    public void setBananaLabelProperties(){
        bananaLabel.setLayoutX(610);
        bananaLabel.setLayoutY(500);
        bananaLabel.setFont(Font.font("Verdana", FontWeight.BOLD,11));

    }

    public Label getBananaLabel() {
        setBananaLabelProperties();
        return bananaLabel;
    }


    public void setStrawberryLabelProperties(){
        strawberryLabel.setLayoutX(610);
        strawberryLabel.setLayoutY(420);
        strawberryLabel.setFont(Font.font("Verdana", FontWeight.BOLD,11));

    }

    public Label getStrawberryLabel() {
        setStrawberryLabelProperties();
        return strawberryLabel;
    }
    public void setKiwiLabelProperties(){
        kiwiLabel.setLayoutX(610);
        kiwiLabel.setLayoutY(340);
        kiwiLabel.setFont(Font.font("Verdana", FontWeight.BOLD,11));

    }

    public Label getKiwiLabel() {
        setKiwiLabelProperties();
        return kiwiLabel;
    }

    public void setAppleLabelProperties(){
        appleLabel.setLayoutX(610);
        appleLabel.setLayoutY(260);
        appleLabel.setFont(Font.font("Verdana", FontWeight.BOLD,11));

    }

    public Label getAppleLabel() {
        setAppleLabelProperties();
        return appleLabel;
    }

    public void setPearLabelProperties(){
        pearLabel.setLayoutX(610);
        pearLabel.setLayoutY(180);
        pearLabel.setFont(Font.font("Verdana", FontWeight.BOLD,11));

    }

    public Label getPearLabel() {
        setPearLabelProperties();
        return pearLabel;
    }

    public void setPlumLabelProperties(){
        plumLabel.setLayoutX(610);
        plumLabel.setLayoutY(100);
        plumLabel.setFont(Font.font("Verdana", FontWeight.BOLD,11));

    }

    public Label getPlumLabel() {
        setPlumLabelProperties();
        return plumLabel;
    }
}
