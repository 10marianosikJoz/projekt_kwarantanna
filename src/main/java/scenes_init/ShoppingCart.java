package scenes_init;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import shopping_card_textfields.DrinkTextFields;

public class ShoppingCart {
    private Group group;
    private Scene scene;
    private Button backToMenu = new Button("BACK TO MENU");
    private Label colaLabel = new Label("Cola");
    private Label teaLabel = new Label("Tea");
    private static DrinkTextFields drinkTextFields = new DrinkTextFields();





    private void setBackToMenuButtonProparties() {
        backToMenu.setLayoutX(350);
        backToMenu.setLayoutY(550);
        backToMenu.setStyle("-fx-background-color: #4e524e; -fx-background-radius: 22  ");
        backToMenu.setPrefSize(150, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);

    }

    public Button getBackToMenuButton() {
        setBackToMenuButtonProparties();
        return backToMenu;
    }

    public void setColaLabelProperties(){
        colaLabel.setLayoutX(20);
        colaLabel.setLayoutY(20);

    }

    public Label getColaLabel() {
        setColaLabelProperties();
        return colaLabel;
    }

    public void setTeaLabelProperties(){
        teaLabel.setLayoutX(20);
        teaLabel.setLayoutY(80);
    }
    public Label getTeaLabel() {
        setTeaLabelProperties();
        return teaLabel;
    }

    public Group getGroup() {
        return group = new Group();
    }

    public Scene getScene() {
        return scene = new Scene(group, 850, 650, Color.web("#ffc46b"));
    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getBackToMenuButton(),getColaLabel(),getTeaLabel(),drinkTextFields.getPrice(),drinkTextFields.getAmount(),drinkTextFields.getTotalSum(),
                drinkTextFields.getTeaAmount(),drinkTextFields.getTeaPrice(),drinkTextFields.getTeaTotalSum(),
                drinkTextFields.getFinalResult(), drinkTextFields.getTotalSumOfAllItems());
    }
}
