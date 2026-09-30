package br.com.oliverdev17.geoexplorer.strategy;

import br.com.oliverdev17.geoexplorer.domain.Challenge;
import br.com.oliverdev17.geoexplorer.domain.Technology;

public interface ChallengeGenerationStrategy {
    Challenge generate(Technology technology);
}
