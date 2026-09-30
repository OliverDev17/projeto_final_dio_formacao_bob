package br.com.oliverdev17.geoexplorer.domain;

public class Challenge {
    private String title;
    private String description;
    private String difficultyLevel;
    private Technology technology;

    public Challenge(String title, String description, String difficultyLevel, Technology technology) {
        this.title = title;
        this.description = description;
        this.difficultyLevel = difficultyLevel;
        this.technology = technology;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public Technology getTechnology() {
        return technology;
    }

    @Override
    public String toString() {
        return "Challenge {\n" +
                "  Title: '" + title + "'\n" +
                "  Description: '" + description + "'\n" +
                "  Difficulty: '" + difficultyLevel + "'\n" +
                "  Technology: " + technology.getName() + "\n" +
                '}';
    }
}
