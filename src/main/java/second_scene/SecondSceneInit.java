package second_scene;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

import java.util.ArrayList;


public class SecondSceneInit {

    private Group secondGroupLayout;
    private Scene duplicateScene;
    private Scene scene;
    private FlowPane panel = new FlowPane(Orientation.VERTICAL, 60, 30);
    private ButtonsIcons buttonsIcons = new ButtonsIcons();
    private ButtonsEffects buttonsEffects = new ButtonsEffects();
    private static ArrayList<Button> buttonsList = new ArrayList<>();



    private void set() {
        duplicateScene = scene;
    }

    public ArrayList<Button> getButtonsList() {
        return buttonsList;
    }

    private void addButtonsToList() {
        for (int i = 0; i < 8; i++) {
            buttonsList.add(new Button());
        }

    }

    private Pane getPanel() {
        addButtonsToList();
        for (Button button : buttonsList) {
            button.setPrefSize(170, 170);
            button.setStyle("-fx-base: #83c5eb");
           button.setShape(new Circle(1));
            panel.getChildren().add(button);
            panel.setPadding(new Insets(110, 0, 200, 67));
        }
        setButtonsEffects();
        return panel;
    }

    private void setButtonsEffects() {
        for (int i = 0; i < buttonsList.size(); i++) {


            buttonsList.get(0).setGraphic(buttonsIcons.getImageViewMoney());
            buttonsList.get(0).setTooltip(buttonsEffects.getAccountInfoButton());

            buttonsList.get(1).setGraphic(buttonsIcons.getImageViewFruit());
            buttonsList.get(1).setTooltip(buttonsEffects.getFruitButton());

            buttonsList.get(2).setGraphic(buttonsIcons.getImageViewBread());
            buttonsList.get(2).setTooltip(buttonsEffects.getBreadButton());

            buttonsList.get(3).setGraphic(buttonsIcons.getImageViewExchange());
            buttonsList.get(3).setTooltip(buttonsEffects.getExchangeMoneyButton());

            buttonsList.get(4).setGraphic(buttonsIcons.getImageViewSmartphonePay());
            buttonsList.get(4).setTooltip(buttonsEffects.getPaymentPhoneButton());

            buttonsList.get(5).setGraphic(buttonsIcons.getImageViewDrink());
            buttonsList.get(5).setTooltip(buttonsEffects.getDrinksButton());


            buttonsList.get(6).setGraphic(buttonsIcons.getImageViewVegetable());
            buttonsList.get(6).setTooltip(buttonsEffects.getVegetableButton());

            buttonsList.get(7).setGraphic(buttonsIcons.getImageViewShoppingCart());
            buttonsList.get(7).setTooltip(buttonsEffects.getShoppingCartButton());

        }

    }



    public Group getSecondGroupLayout() {
      return   secondGroupLayout = new Group();
    }



    public void addToSecondLayout() {
        secondGroupLayout.getChildren().addAll(getPanel());
    }


    public Scene getScene2() {
        return scene = new Scene(secondGroupLayout, 1000, 600, Color.web("#ffc46b"));
    }

    public Scene getDuplicateScene() {
    set();
      return duplicateScene;
    }

}
