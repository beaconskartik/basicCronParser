import org.example.CronField;
import org.example.CronParser;
import org.example.IllegalCronFieldException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import testcases.CronFieldInValidTestCases;
import testcases.CronFieldValidTestCases;
import testcases.CronParserValidTestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CronParserTest {

    @ParameterizedTest
    @EnumSource(CronParserValidTestCases.class)
    public void testValidCronField(CronParserValidTestCases testCase) throws IllegalCronFieldException {
        CronParser cronParser = new CronParser(testCase.input);
        assertEquals(testCase.expectedOutput, cronParser.toString());
    }

    @ParameterizedTest
    @EnumSource(CronFieldInValidTestCases.class)
    public void testInValidCronField(CronFieldInValidTestCases testCases) {
        assertThrows(IllegalCronFieldException.class, () -> {
            CronField cronField = new CronField(testCases.input, testCases.type);
            cronField.toString();
        });
    }
}
