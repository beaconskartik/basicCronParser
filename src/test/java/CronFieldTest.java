import org.example.CronField;
import org.example.IllegalCronFieldException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import testcases.CronFieldInValidTestCases;
import testcases.CronFieldValidTestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CronFieldTest {
    @ParameterizedTest
    @EnumSource(CronFieldValidTestCases.class)
    public void testValidCronField(CronFieldValidTestCases testCase) throws IllegalCronFieldException {
        CronField cronField = new CronField(testCase.input, testCase.type);
        assertEquals(testCase.expectedOutput, cronField.toString());
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


