package br.com.oliverdev17.geoexplorer.context;

import br.com.oliverdev17.geoexplorer.domain.Challenge;
import br.com.oliverdev17.geoexplorer.domain.Technology;
import br.com.oliverdev17.geoexplorer.strategy.ChallengeGenerationStrategy;

public class ChallengeGeneratorContext {
    private ChallengeGenerationStrategy strategy;

    public void setStrategy(ChallengeGenerationStrategy strategy) {
        this.strategy = strategy;
    }

    public Challenge generateChallenge(Technology technology) {
        if (this.strategy == null) {
            throw new IllegalStateException("Strategy not set in context!");
        }
        return this.strategy.generate(technology);
    }
}
