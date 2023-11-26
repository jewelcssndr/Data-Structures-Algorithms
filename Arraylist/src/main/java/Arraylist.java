import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("Java");
        list.add("C#");
        list.add("Python");
        list.add("C++");
        list.add("Pascal");

        System.out.println("ArrayList: " + list);
        
        list.add(list.indexOf("Pascal") + 1, "COBOL");

        System.out.println("ArrayList with Cobol: "+ list);

        list.add(list.indexOf("C#") + 1, "Visual Basic");

        list.remove("C++");

        System.out.println("Final List: " + list);
    }
}
