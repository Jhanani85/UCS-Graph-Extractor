
import java.io.File;   // <-- add this line

public class Main {

    public static void main(String[] args) {
        System.out.println("=== AI-Based UCS Graph Data Extraction ===");

        ProblemStatement.describe();

        // Loop through all files in resources folder
        File folder = new File("../resources");
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("Processing: " + file.getName());
                    SolutionOverview.runPipeline(file.getPath());
                }
            }
        }

        AccuracyEvaluator.evaluate();
        PracticalityModule.showUseCases();
        ScalabilityModule.testPerformance();
        SafetyEthicsUX.checkEthics();
        DocumentationHelper.showRepoLink();
        ChallengesFutureWork.listChallenges();

        System.out.println("=== Extraction Complete. Results saved to output/ ===");
    }
}
