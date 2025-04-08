
import java.util.HashMap;

public class HashMaps{
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // 1. Adding elements
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println("After adding elements: " + students);

        // 2. Changing/Updating an element (change Bob to Bobby)
        students.put(102, "Bobby"); // Overwrites the value for key 102

        System.out.println("After updating key 102: " + students);

        // 3. Removing an element
        students.remove(103); // Removes entry with key 103

        System.out.println("After removing key 103: " + students);
    }
}
