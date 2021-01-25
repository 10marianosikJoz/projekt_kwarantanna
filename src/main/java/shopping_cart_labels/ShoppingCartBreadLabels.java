package shopping_cart_labels;

import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class ShoppingCartBreadLabels {
    private Label baguetteLabel = new Label("Baguette");
    private Label breadLabel = new Label("Bread");
    private Label croissantLabel = new Label("Croissant");
    private Label rollBreadLabel = new Label("Roll \n Bread");
    private Label rollLabel = new Label("Roll");
    private Label toastLabel = new Label("Toast");

    public void setToastLabelProperties(){
        toastLabel.setLayoutX(315);
        toastLabel.setLayoutY(500);
        toastLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));


    }

    public Label getToastLabel() {
        setToastLabelProperties();
        return toastLabel;
    }


    public void setRollLabelProperties(){
        rollLabel.setLayoutX(315);
        rollLabel.setLayoutY(420);
        rollLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getRollLabel() {
        setRollLabelProperties();
        return rollLabel;
    }
    public void setRollBreadLabelProperties(){
        rollBreadLabel.setLayoutX(315);
        rollBreadLabel.setLayoutY(340);
        rollBreadLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getRollBreadLabel() {
        setRollBreadLabelProperties();
        return rollBreadLabel;
    }

    public void setCroissantLabelProperties(){
        croissantLabel.setLayoutX(315);
        croissantLabel.setLayoutY(260);
        croissantLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getCroissantLabel() {
        setCroissantLabelProperties();
        return croissantLabel;
    }

    public void setBreadLabelProperties(){
        breadLabel.setLayoutX(315);
        breadLabel.setLayoutY(180);
        breadLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getBreadLabel() {
        setBreadLabelProperties();
        return breadLabel;
    }

    public void setBaguetteLabelProperties(){
        baguetteLabel.setLayoutX(315);
        baguetteLabel.setLayoutY(100);
        baguetteLabel.setFont(Font.font("Verdana", FontWeight.BOLD,12));

    }

    public Label getBaguetteLabel() {
        setBaguetteLabelProperties();
        return baguetteLabel;
    }
}
