import java.util.*;
public class JobDescription {

    private List<String> skills;

    public JobDescription(String skillsInput) {
        skills = new ArrayList<>();
        String[] skillArray = skillsInput.toLowerCase().split(",");

        for (String skill : skillArray) {
            skills.add(skill.trim());
        }
    }

    public List<String> getSkills() {
        return skills;
    }
}
