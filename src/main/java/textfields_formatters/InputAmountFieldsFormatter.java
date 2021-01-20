package textfields_formatters;

import javafx.scene.control.TextFormatter;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class InputAmountFieldsFormatter {

    private Pattern getPatternPhoneNumber() {
        Pattern pattern = Pattern.compile(".{0,12}");
        return pattern;
    }
    private Pattern getPatternAmountInput(){
        Pattern pattern = Pattern.compile("\\d{0,2}");
        return pattern;
    }

    public TextFormatter getPhoneNumberFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternPhoneNumber().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }

    public TextFormatter <TextFormatter> getAmountNumberFormatter() {
        return new TextFormatter((UnaryOperator<TextFormatter.Change>) change -> {
            return getPatternAmountInput().matcher(change.getControlNewText()).matches() ? change : null;

        });
    }


}
