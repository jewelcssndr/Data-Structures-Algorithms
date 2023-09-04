
import java.util.Arrays;
import java.util.Scanner;

public class NameArray {

    public static void main(String[] args) {
        
        String[] name = new String[5];
        name[0] = "Jewel";
        name[1] = "Dhan";
        name[2] = "Maycee";
        name[3] = "Kath";
        name[4] = "Kiko";
        
        System.out.println("Student names: ");
        for (String student : name) {
            System.out.println(student);
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String searchName = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(searchName)) {
                index = i;
                break;
    }
}
        if (index != -1) {
            System.out.println("The index of the name is " + index);
        } else {
            System.out.println("Name not found.");
        }
        
          Arrays.sort(name);

        System.out.println("Sorted array: ");
        for (String student : name) {
            System.out.println(student);
    }
}
}