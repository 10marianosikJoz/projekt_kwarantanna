package shopping_cart_labels;

import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class ShoppingCartVegetablesLabels {
    private Label onionLabel = new Label("Onion");
    private Label saladLabel = new Label("Salad");
    private Label carrotLabel = new Label("Carrot");
    private Label paprikaLabel = new Label("Paprika");
    private Label tomatoLabel = new Label("Tomato");
    private Label cucumberLabel = new Label("Cucumber");

    public void setCucumberLabelProperties(){
        cucumberLabel.setLayoutX(913);
        cucumberLabel.setLayoutY(500);
        cucumberLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getCucumberLabel() {
        setCucumberLabelProperties();
        return cucumberLabel;
    }


    public void setTomatoLabelProperties(){
        tomatoLabel.setLayoutX(913);
        tomatoLabel.setLayoutY(420);
        tomatoLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getTomatoLabel() {
        setTomatoLabelProperties();
        return tomatoLabel;
    }
    public void setPaprikaLabelProperties(){
        paprikaLabel.setLayoutX(913);
        paprikaLabel.setLayoutY(340);
        paprikaLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getPaprikaLabel() {
        setPaprikaLabelProperties();
        return paprikaLabel;
    }

    public void setCarrotLabelProperties(){
        carrotLabel.setLayoutX(913);
        carrotLabel.setLayoutY(260);
        carrotLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getCarrotLabel() {
        setCarrotLabelProperties();
        return carrotLabel;
    }

    public void setSaladLabelProperties(){
        saladLabel.setLayoutX(913);
        saladLabel.setLayoutY(180);
        saladLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getSaladLabel() {
        setSaladLabelProperties();
        return saladLabel;
    }

    public void setOnionLabelProperties(){
        onionLabel.setLayoutX(913);
        onionLabel.setLayoutY(100);
        onionLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getOnionLabel() {
        setOnionLabelProperties();
        return onionLabel;
    }
}
