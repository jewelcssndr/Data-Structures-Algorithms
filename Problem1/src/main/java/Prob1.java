import java.util.*;
public class Prob1 {

public static void main(String[] args) {
    
    System.out.println("Initialize a stack: ");
    
    Stack stack = new Stack(5);
    
    System.out.println("Is the stack empty? " + stack.isEmpty());
    System.out.println("Input some elements on the stack: ");
    
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    
    stack.print();

    System.out.println("Top element of the stack: " + stack.peek());
    
    System.out.println("Remove two element from the stack: ");
    
    stack.pop();
    stack.pop();
    
    stack.print();

    System.out.println("Top element of the stack after popping: " + stack.peek());
    
    System.out.println("Is the stack empty? " + stack.isEmpty());
  }
}