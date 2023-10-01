import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import testcases.CronFieldTypeTestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CronFieldTypeTest {

    @ParameterizedTest
    @EnumSource(CronFieldTypeTestCases.class)
    void testValidMinuteCronFieldType(CronFieldTypeTestCases testCase) {
        assertEquals(testCase.max, testCase.type.max);
        assertEquals(testCase.min, testCase.type.min);
    }
}
