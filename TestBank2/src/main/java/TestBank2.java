import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestBank2 {
    public static void main(String[] args) {
       
        List<BankAccount> arrayList = new ArrayList<>();
        List<BankAccount> linkedList = new LinkedList<>();

        BankAccount acc1 = new BankAccount("Chandler Bing", 9999);
        BankAccount acc2 = new BankAccount("Joey Tribbiani", 10);
        BankAccount acc3 = new BankAccount("Ross Geller", 2300);

        arrayList.add(acc1);
        arrayList.add(acc2);
        linkedList.add(acc1);
        linkedList.add(acc2);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        arrayList.remove(acc1);
        linkedList.remove(acc2);

        System.out.println("ArrayList after removal: " + arrayList);
        System.out.println("LinkedList after removal: " + linkedList);

        arrayList.add(1, acc3);
        linkedList.add(0, acc3);

        System.out.println("ArrayList after insertion: " + arrayList);
        System.out.println("LinkedList after insertion: " + linkedList);

        int index1 = arrayList.indexOf(acc3);
        int index2 = linkedList.indexOf(acc3);

        System.out.println("Index of account3 in ArrayList: " + index1);
        System.out.println("Index of account3 in LinkedList: " + index2);

        arrayList.sort((a1, a2) -> Double.compare(a1.getBalance(), a2.getBalance()));

        linkedList.sort((a1, a2) -> a1.getOwner().compareTo(a2.getOwner()));

        System.out.println("ArrayList by balance: " + arrayList);
        System.out.println("LinkedList by owner: " + linkedList);
    }
}
