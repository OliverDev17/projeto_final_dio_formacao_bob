package br.com.oliverdev17.geoexplorer.strategy;

import br.com.oliverdev17.geoexplorer.domain.Challenge;
import br.com.oliverdev17.geoexplorer.domain.Technology;

public class IntermediateChallengeStrategy implements ChallengeGenerationStrategy {
    @Override
    public Challenge generate(Technology technology) {
        String title = technology.getName() + " Object-Oriented Design";
        String description = "Apply OOP principles, simple algorithms, and build a modular application using " + technology.getName() + ".";
        return new Challenge(title, description, "Intermediate", technology);
    }
}
