package textfields_formatters;

import javafx.scene.control.TextFormatter;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class InputAmountFieldsFormatter {

    public Pattern getPatternTotalSumOfItems() {
        Pattern pattern = Pattern.compile("^\\d*\\.\\d+|\\d+\\.\\d*$");
        return pattern;
    }
    public Pattern getPatternAmountInput(){
        Pattern pattern = Pattern.compile("(^([0-9]|[1-9][0-9])$)");
        return pattern;
    }

    public TextFormatter getTotalSumNumberFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternTotalSumOfItems().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }

    public TextFormatter <TextFormatter> getAmountNumberFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternAmountInput().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }


}
