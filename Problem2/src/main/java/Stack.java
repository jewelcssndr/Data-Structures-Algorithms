import java.util.Scanner;

public class Stack {
  private int[] arr;
  private int top;

  public Stack(int size) {
    arr = new int[size];
    top = -1;
  }

  public void push(int num) {
    if (top == arr.length - 1) {
      System.out.println("Stack is full");
    } else {
      top++;
      arr[top] = num;
    }
  }

  public int pop() {
    if (top == -1) {
      System.out.println("Stack Underflow");
      return -1;
    } else {
      int poppedElement = arr[top];
      top--;
      return poppedElement;
    }
  }

  public int peek() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return -1;
    } else {
      return arr[top];
    }
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public void sort() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return;
    }

    Stack tempStack = new Stack(arr.length);

    while (!isEmpty()) {
      int temp = pop();

      while (!tempStack.isEmpty() && tempStack.peek() > temp) {
        push(tempStack.pop());
      }

      tempStack.push(temp);
    }

    while (!tempStack.isEmpty()) {
      push(tempStack.pop());
    }
  }

  public void print() {
    if (top == -1) {
      System.out.println("Stack is empty");
    } else {
      System.out.print("Stack elements: ");
      for (int i = top; i >= 0; i--) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }
}