public class Prob2 {
    public static void main(String[] args) {
        
    System.out.println("Initialize a stack:");
    Stack stack = new Stack(6);
    
    System.out.println("Input some elements on the stack:");
    stack.push(1);
    stack.push(3);
    stack.push(2);
    stack.push(0);
    stack.push(7);
    stack.push(5);
    
    stack.print();
    
    System.out.println("Sort the elements of the stack in ascending order: ");
    stack.sort();
    
    stack.print();
  }
}