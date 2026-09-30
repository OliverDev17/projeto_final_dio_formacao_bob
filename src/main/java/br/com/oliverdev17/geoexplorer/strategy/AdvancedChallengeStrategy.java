package br.com.oliverdev17.geoexplorer.strategy;

import br.com.oliverdev17.geoexplorer.domain.Challenge;
import br.com.oliverdev17.geoexplorer.domain.Technology;

public class AdvancedChallengeStrategy implements ChallengeGenerationStrategy {
    @Override
    public Challenge generate(Technology technology) {
        String title = "Advanced Architecture and Performance in " + technology.getName();
        String description = "Design scalable systems, apply design patterns, and optimize performance bottlenecks in " + technology.getName() + ".";
        return new Challenge(title, description, "Advanced", technology);
    }
}
