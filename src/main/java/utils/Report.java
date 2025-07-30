package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Report {

    private static final String OUTPUT_FOLDER = "./Report/";
    private static final String FILE_NAME = "TestReport.html";

    public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    public static ExtentReports extentReports;


    static {
        extentReports = initSparkReport();
        Runtime.getRuntime().addShutdownHook(new Thread(Report::flushReports));
    }

    private static ExtentReports initSparkReport() {
        Path path = Paths.get(OUTPUT_FOLDER);
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(OUTPUT_FOLDER + FILE_NAME);
        sparkReporter.config().setReportName("Automation Test Results");
        sparkReporter.config().setDocumentTitle("Test Execution Report");
        sparkReporter.config().setTheme(Theme.STANDARD);

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(sparkReporter);


        return extent;
    }
    public static ExtentTest createTest(String testName) {
        ExtentTest extentTest = extentReports.createTest(testName);
        test.set(extentTest);
        return extentTest;
    }

    public static void flushReports() {
        if (extentReports != null) {
            extentReports.flush();
        }
    }

}
