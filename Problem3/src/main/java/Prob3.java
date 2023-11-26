
public class Prob3 {
    
    public static void main(String[] args) {
        
    System.out.println("Initialize a stack:");
    Stack stack = new Stack(10);
    
    System.out.println("Input some elements on the stack: ");
    stack.push(1);
    stack.push(3);
    stack.push(2);
    stack.push(0);
    stack.push(7);
    stack.push(5);
    stack.push(-1);
    stack.print();
    
    int max_val = stack.get_max();
    System.out.println("Maximum value: " + max_val);
    
    int min_val = stack.get_min();
    System.out.println("Minimum value: " + min_val);
  }
}