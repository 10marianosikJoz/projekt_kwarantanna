package shopping_cart_labels;

import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class ShoppingCartDrinkLabels {
    private Label colaLabel = new Label("Cola");
    private Label teaLabel = new Label("Tea");
    private Label coffeeLabel = new Label("Coffee");
    private Label beerLabel = new Label("Beer");
    private Label juiceLabel = new Label("Juice");
    private Label waterLabel = new Label("Water");

    ;
    public void setWaterLabelProperties(){
        waterLabel.setLayoutX(20);
        waterLabel.setLayoutY(500);
        waterLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getWaterLabel() {
        setWaterLabelProperties();
        return waterLabel;
    }


    public void setJuiceLabelProperties(){
        juiceLabel.setLayoutX(20);
        juiceLabel.setLayoutY(420);
        juiceLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getJuiceLabel() {
        setJuiceLabelProperties();
        return juiceLabel;
    }
    public void setBeerLabelProperties(){
        beerLabel.setLayoutX(20);
        beerLabel.setLayoutY(340);
        beerLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getBeerLabel() {
        setBeerLabelProperties();
        return beerLabel;
    }

    public void setCoffeeLabelProperties(){
        coffeeLabel.setLayoutX(20);
        coffeeLabel.setLayoutY(260);
        coffeeLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getCoffeeLabel() {
        setCoffeeLabelProperties();
        return coffeeLabel;
    }

    public void setColaLabelProperties(){
        colaLabel.setLayoutX(20);
        colaLabel.setLayoutY(100);
        colaLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getColaLabel() {
        setColaLabelProperties();
        return colaLabel;
    }

    public void setTeaLabelProperties(){
        teaLabel.setLayoutX(20);
        teaLabel.setLayoutY(180);
        teaLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getTeaLabel() {
        setTeaLabelProperties();
        return teaLabel;
    }
}
