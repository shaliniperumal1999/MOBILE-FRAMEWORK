package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestResult;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Date;

public class Report {

    private static final String OUTPUT_FOLDER = "./Report/";
    private static final String FILE_NAME = "TestReport.html";
    public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    public static ExtentReports extentReports;

    // Static block to initialize ExtentReports
    static {
        extentReports = init();
    }

    private static ExtentReports init() {
        Path path = Paths.get(OUTPUT_FOLDER);
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ExtentReports extentReports = new ExtentReports();
        ExtentSparkReporter reporter = new ExtentSparkReporter(OUTPUT_FOLDER + FILE_NAME);
        reporter.config().setReportName("Test Results");
        extentReports.attachReporter(reporter);
        return extentReports;
    }

    public static ExtentTest createTest(String testName) {
        ExtentTest extentTest = extentReports.createTest(testName);
        test.set(extentTest);  // Set ExtentTest in ThreadLocal
        return extentTest;
    }

    public static void flushReports() {
        if (extentReports != null) {
            extentReports.flush();
        }
    }



}
