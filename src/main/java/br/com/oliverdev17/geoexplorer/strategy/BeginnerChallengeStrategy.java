package br.com.oliverdev17.geoexplorer.strategy;

import br.com.oliverdev17.geoexplorer.domain.Challenge;
import br.com.oliverdev17.geoexplorer.domain.Technology;

public class BeginnerChallengeStrategy implements ChallengeGenerationStrategy {
    @Override
    public Challenge generate(Technology technology) {
        String title = "Introduction to " + technology.getName();
        String description = "Learn the basic syntax, variables, and control structures in " + technology.getName() + ".";
        return new Challenge(title, description, "Beginner", technology);
    }
}
