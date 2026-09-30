package br.com.oliverdev17.geoexplorer.strategy;

import br.com.oliverdev17.geoexplorer.context.ChallengeGeneratorContext;
import br.com.oliverdev17.geoexplorer.domain.Challenge;
import br.com.oliverdev17.geoexplorer.domain.Technology;

public class StrategyTestRunner {
    public static void main(String[] args) {
        System.out.println("Running Tests...");
        
        Technology testTech = new Technology("TestTech");
        ChallengeGeneratorContext context = new ChallengeGeneratorContext();
        
        // Test 1: Beginner Strategy
        context.setStrategy(new BeginnerChallengeStrategy());
        Challenge b = context.generateChallenge(testTech);
        assert b.getDifficultyLevel().equals("Beginner") : "Test Failed: Expected Beginner";
        assert b.getTitle().contains("TestTech") : "Test Failed: Title mismatch";
        
        // Test 2: Intermediate Strategy
        context.setStrategy(new IntermediateChallengeStrategy());
        Challenge i = context.generateChallenge(testTech);
        assert i.getDifficultyLevel().equals("Intermediate") : "Test Failed: Expected Intermediate";
        
        // Test 3: Advanced Strategy
        context.setStrategy(new AdvancedChallengeStrategy());
        Challenge a = context.generateChallenge(testTech);
        assert a.getDifficultyLevel().equals("Advanced") : "Test Failed: Expected Advanced";
        
        // Test 4: Null Strategy Exception
        context.setStrategy(null);
        try {
            context.generateChallenge(testTech);
            assert false : "Test Failed: Expected IllegalStateException";
        } catch (IllegalStateException e) {
            // Expected
        }

        // Test 5: Invalid Technology name throws IllegalArgumentException
        try {
            new Technology("");
            assert false : "Test Failed: Expected IllegalArgumentException for blank name";
        } catch (IllegalArgumentException e) {
            // Expected
        }

        try {
            new Technology(null);
            assert false : "Test Failed: Expected IllegalArgumentException for null name";
        } catch (IllegalArgumentException e) {
            // Expected
        }

        System.out.println("All tests passed successfully!");
    }
}
