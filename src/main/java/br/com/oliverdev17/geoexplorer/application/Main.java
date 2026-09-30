package br.com.oliverdev17.geoexplorer.application;

import br.com.oliverdev17.geoexplorer.context.ChallengeGeneratorContext;
import br.com.oliverdev17.geoexplorer.domain.Challenge;
import br.com.oliverdev17.geoexplorer.domain.Technology;
import br.com.oliverdev17.geoexplorer.strategy.AdvancedChallengeStrategy;
import br.com.oliverdev17.geoexplorer.strategy.BeginnerChallengeStrategy;
import br.com.oliverdev17.geoexplorer.strategy.IntermediateChallengeStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Geo Explorer DIO: Challenge Generation ===");
        
        Technology java = new Technology("Java");
        ChallengeGeneratorContext context = new ChallengeGeneratorContext();

        System.out.println("\n--- Requesting Beginner Challenge ---");
        context.setStrategy(new BeginnerChallengeStrategy());
        Challenge beginnerChallenge = context.generateChallenge(java);
        System.out.println(beginnerChallenge);

        System.out.println("\n--- Requesting Intermediate Challenge ---");
        context.setStrategy(new IntermediateChallengeStrategy());
        Challenge intermediateChallenge = context.generateChallenge(java);
        System.out.println(intermediateChallenge);

        System.out.println("\n--- Requesting Advanced Challenge ---");
        context.setStrategy(new AdvancedChallengeStrategy());
        Challenge advancedChallenge = context.generateChallenge(java);
        System.out.println(advancedChallenge);
        
        System.out.println("\n=== Demonstration Completed ===");
    }
}
