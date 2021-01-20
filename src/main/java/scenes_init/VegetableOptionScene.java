package scenes_init;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import options_components.VegetableOptionComponents;
import textfields_formatters.InputAmountFieldsFormatter;

import java.util.ArrayList;

public class VegetableOptionScene {
    private Group group;
    private Scene scene;
    private Pane panel = new Pane();
    private Button backToMenu = new Button("BACK TO MENU");
    private static ArrayList<TextField> textFieldsAmountVegetables = new ArrayList<>();
    private VegetableOptionComponents vegetableOptionComponents = new VegetableOptionComponents();
    private InputAmountFieldsFormatter inputAmountFieldsFormatter = new InputAmountFieldsFormatter();

    private void setBackToMenuButtonProparties() {
        backToMenu.setLayoutX(315);
        backToMenu.setLayoutY(550);
        backToMenu.setStyle("-fx-background-color: #4e524e; -fx-background-radius: 22 ");
        backToMenu.setPrefSize(150, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);

    }

    public Button getBackToMenuButton() {
        setBackToMenuButtonProparties();
        return backToMenu;
    }

    private void addTextFieldsToList() {
        for (int i = 0; i < 12; i++) {
            textFieldsAmountVegetables.add(new TextField());
        }
    }

    private void setTextFieldsPreferredSizes() {
        for (TextField textField : textFieldsAmountVegetables) {
            textField.setPrefSize(35, 35);
        }
    }
    private void setTextFieldsProperties() {
        textFieldsAmountVegetables.get(0).setLayoutX(35);
        textFieldsAmountVegetables.get(0).setLayoutY(160);
        textFieldsAmountVegetables.get(0).setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountVegetables.get(1).setLayoutX(165);
        textFieldsAmountVegetables.get(1).setLayoutY(160);
        textFieldsAmountVegetables.get(1).setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountVegetables.get(2).setLayoutX(285);
        textFieldsAmountVegetables.get(2).setLayoutY(160);
        textFieldsAmountVegetables.get(2).setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountVegetables.get(3).setLayoutX(405);
        textFieldsAmountVegetables.get(3).setLayoutY(160);
        textFieldsAmountVegetables.get(3).setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountVegetables.get(4).setLayoutX(525);
        textFieldsAmountVegetables.get(4).setLayoutY(160);
        textFieldsAmountVegetables.get(4).setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountVegetables.get(5).setLayoutX(650);
        textFieldsAmountVegetables.get(5).setLayoutY(160);
        textFieldsAmountVegetables.get(5).setTextFormatter(inputAmountFieldsFormatter.getAmountNumberFormatter());

        textFieldsAmountVegetables.get(6).setLayoutX(85);
        textFieldsAmountVegetables.get(6).setLayoutY(160);
        textFieldsAmountVegetables.get(6).setText("30");
        textFieldsAmountVegetables.get(6).setEditable(false);
        textFieldsAmountVegetables.get(6).setFont(Font.font("Verdana", FontWeight.BOLD, 12));

        textFieldsAmountVegetables.get(7).setLayoutX(215);
        textFieldsAmountVegetables.get(7).setLayoutY(160);
        textFieldsAmountVegetables.get(7).setText("30");
        textFieldsAmountVegetables.get(7).setEditable(false);
        textFieldsAmountVegetables.get(7).setFont(Font.font("Verdana", FontWeight.BOLD, 12));

        textFieldsAmountVegetables.get(8).setLayoutX(335);
        textFieldsAmountVegetables.get(8).setLayoutY(160);
        textFieldsAmountVegetables.get(8).setText("30");
        textFieldsAmountVegetables.get(8).setEditable(false);
        textFieldsAmountVegetables.get(8).setFont(Font.font("Verdana", FontWeight.BOLD, 12));


        textFieldsAmountVegetables.get(9).setLayoutX(455);
        textFieldsAmountVegetables.get(9).setLayoutY(160);
        textFieldsAmountVegetables.get(9).setText("30");
        textFieldsAmountVegetables.get(9).setEditable(false);
        textFieldsAmountVegetables.get(9).setFont(Font.font("Verdana", FontWeight.BOLD, 12));


        textFieldsAmountVegetables.get(10).setLayoutX(575);
        textFieldsAmountVegetables.get(10).setLayoutY(160);
        textFieldsAmountVegetables.get(10).setText("30");
        textFieldsAmountVegetables.get(10).setEditable(false);
        textFieldsAmountVegetables.get(10).setFont(Font.font("Verdana", FontWeight.BOLD, 12));


        textFieldsAmountVegetables.get(11).setLayoutX(700);
        textFieldsAmountVegetables.get(11).setLayoutY(160);
        textFieldsAmountVegetables.get(11).setText("30");
        textFieldsAmountVegetables.get(11).setEditable(false);
        textFieldsAmountVegetables.get(11).setFont(Font.font("Verdana", FontWeight.BOLD, 12));



    }

    private Pane getPanel() {
        addTextFieldsToList();
        for (TextField textField : textFieldsAmountVegetables) {
            panel.getChildren().addAll(textField);
        }
       /* numberFieldValidation();
        amountFieldValidation();
        buttonHandler();*/
        setTextFieldsProperties();
        setTextFieldsPreferredSizes();
        return panel;
    }

    public static ArrayList<TextField> getTextFieldsAmountVegetables() {
        return textFieldsAmountVegetables;
    }

    public Group getGroup() {
        return group = new Group();
    }

    public Scene getScene() {
        return scene = new Scene(group, 780 , 650, Color.web("#ffc46b"));
    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getPanel(),getBackToMenuButton(),vegetableOptionComponents.getCabbageImageView(),vegetableOptionComponents.getCarrotImageView(),
                vegetableOptionComponents.getGarlicImageView(),vegetableOptionComponents.getPaprikaImageView(),vegetableOptionComponents.getPotatoImageView(),
                vegetableOptionComponents.getTomatoImageView());
    }
}
