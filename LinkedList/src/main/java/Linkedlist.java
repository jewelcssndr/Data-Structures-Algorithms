import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Melon");
        fruits.add("Guava");
        fruits.add("Grapes");

        System.out.println("LinkedList: "+ fruits);

        int orangeIndex = fruits.indexOf("Orange");
        fruits.add(orangeIndex + 1, "Watermelon");

        int length = fruits.size();
        System.out.println("Length of the Linked List: " + length);

        int appleIndex = fruits.indexOf("Apple");
        fruits.add(appleIndex, "Strawberry");

        fruits.remove("Guava");

        System.out.println("Updated LinkedList: "+fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}