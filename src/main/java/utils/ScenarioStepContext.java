package utils;

public class ScenarioStepContext {

    private static ThreadLocal<String> currentStep = new ThreadLocal<>();

    public static void setCurrentStep(String stepName) {
        currentStep.set(stepName);
    }

    public static String getCurrentStep() {
        return currentStep.get();
    }

    public static void clear() {
        currentStep.remove();
    }
}
