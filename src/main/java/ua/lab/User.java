package ua.lab;

public class User {

    private final String name;

    public User(String fullName) {
        this.name = fullName;
    }

    public String getFullName() {
        return name;
    }
}
