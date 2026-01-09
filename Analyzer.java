import java.util.*;

public class Analyzer {

    public Result analyze(Resume resume, JobDescription job) {

        List<String> matchedSkills = new ArrayList<>();
        List<String> missingSkills = new ArrayList<>();

        for (String skill : job.getSkills()) {
            if (resume.getContent().contains(skill)) {
                matchedSkills.add(skill);
            } else {
                missingSkills.add(skill);
            }
        }

        int totalSkills = job.getSkills().size();
        int atsScore = (matchedSkills.size() * 100) / totalSkills;

        return new Result(atsScore, matchedSkills, missingSkills);
    }
}
