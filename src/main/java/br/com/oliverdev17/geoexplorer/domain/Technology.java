package br.com.oliverdev17.geoexplorer.domain;

public class Technology {
    private String name;

    public Technology(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Technology name must not be null or blank.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
