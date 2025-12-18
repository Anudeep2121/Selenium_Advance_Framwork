//package utils;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//public class ExtentManager {
//
//    public static ExtentReports extent;
//    public static ThreadLocal<ExtentTest> scenario = new ThreadLocal<>();
//    public static ThreadLocal<ExtentTest> step = new ThreadLocal<>();
//
//    public static void initReport() {
//        ExtentSparkReporter reporter =
//                new ExtentSparkReporter("target/ExtentReport.html");
//        extent = new ExtentReports();
//        extent.attachReporter(reporter);
//    }
//
//    public static void flushReport() {
//        extent.flush();
//    }
//}