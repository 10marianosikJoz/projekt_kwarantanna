import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.hamcrest.text.MatchesPattern;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import textfields_formatters.InputAmountFieldsFormatter;



public class InputAmountFieldsTest {

    private InputAmountFieldsFormatter inputFormat;

    @Before
    public void setUp() {
        inputFormat = new InputAmountFieldsFormatter();
    }

    @Test
    public void input_format_without_zero_at_the_beginning_should_match_to_pattern() {
        //given
        String inputNumber = "21";

        //then
        Assert.assertThat(inputNumber,Matchers.matchesPattern(inputFormat.getPatternAmountInput()));

    }

    @Test
    public void input_format_with_one_digit_should_match_to_pattern() {
        //given
        String input = "1";

        //then
        Assert.assertThat(input, Matchers.matchesPattern(inputFormat.getPatternAmountInput()));

    }

    @Test
    public void should_file_with_zero_at_the_beginning() {
        //given
        String inputWithZeroAtBeginning = "01";

        //when
        boolean result = MatchesPattern.matchesPattern(inputWithZeroAtBeginning).matches(inputFormat.getPatternAmountInput());

        //then
        Assertions.assertThat(result).isFalse();

    }

    @Test
    public void should_file_with_input_three_digits_number() {
        //given
        String inputWithZeroAtBeginning = "111";

        //when
        boolean result = MatchesPattern.matchesPattern(inputWithZeroAtBeginning).matches(inputFormat.getPatternAmountInput());

        //then
        Assertions.assertThat(result).isFalse();

    }
}
