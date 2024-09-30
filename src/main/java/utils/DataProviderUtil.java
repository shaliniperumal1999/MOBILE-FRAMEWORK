package utils;

import org.testng.annotations.DataProvider;

import java.util.Iterator;

public class DataProviderUtil {
    public static class staticProviderClass {
        @DataProvider(name = "SampleDetails", parallel = false)
        public static Iterator<Object[]> APFProgram_BasicDetails() {

            Iterator<Object[]> testData = ExcelUtil.getTestData("input/APF/TC_001_Submit_and_Approval.xlsx", "Basic Details");
            return testData;
        }
    }
}
