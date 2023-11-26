import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandlingObjectExample {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.txt"))) {
            oos.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.txt"))) {
            List<Person> loadedPeople = (List<Person>) ois.readObject();
            for (Person person : loadedPeople) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
