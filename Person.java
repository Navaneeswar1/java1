import java.io.Serializable;

public class Person implements Serializable
{

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public String getName() {
        return name;
    }
}
