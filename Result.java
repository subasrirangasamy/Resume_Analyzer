import java.util.*;

public class Result {

    private int atsScore;
    private List<String> matchedSkills;
    private List<String> missingSkills;

    public Result(int atsScore, List<String> matchedSkills, List<String> missingSkills) {
        this.atsScore = atsScore;
        this.matchedSkills = matchedSkills;
        this.missingSkills = missingSkills;
    }

    public void display() {
        System.out.println("\n===== Resume Analysis Report =====");
        System.out.println("ATS Score: " + atsScore + "%");

        System.out.println("\nMatched Skills:");
        for (String skill : matchedSkills) {
            System.out.println("- " + skill);
        }

        System.out.println("\nMissing Skills:");
        for (String skill : missingSkills) {
            System.out.println("- " + skill);
        }
    }
}
