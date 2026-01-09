import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Resume Text:");
        String resumeText = sc.nextLine();

        System.out.println("Enter Job Skills (comma separated):");
        String jobSkills = sc.nextLine();

        Resume resume = new Resume(resumeText);
        JobDescription job = new JobDescription(jobSkills);

        Analyzer analyzer = new Analyzer();
        Result result = analyzer.analyze(resume, job);

        result.display();

        sc.close();
    }
}
