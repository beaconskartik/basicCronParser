import org.example.CronParser;
import org.example.IllegalCronFieldException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import testcases.CronParserInValidTestCases;
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
    @EnumSource(CronParserInValidTestCases.class)
    public void testInValidCronField(CronParserInValidTestCases testCase) {
        assertThrows(IllegalCronFieldException.class, () -> {
            CronParser cronParser = new CronParser(testCase.input);
            cronParser.toString();
        });
    }
}
