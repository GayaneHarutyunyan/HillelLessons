package Lesson8;

import java.util.Objects;

public class Person extends Objects {
    private String name;

    public String getName() {
        return name.toUpperCase();
    }
    public void setName(String name) {
        this.name = name;
    }
    public void greeting() {
        System.out.println("Hello, I'm person my name is " + getName());
    }
    @Override
    public boolean equals(Objects o) {
        if(!(o instanceof Person))
        return this.getName().equals(other.getName());

    }
}
