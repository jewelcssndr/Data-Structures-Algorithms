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

  public int get_max() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return -1;
    }

    int max = arr[0];

    for (int i = 1; i <= top; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public int get_min() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return -1;
    }

    int min = arr[0];

    for (int i = 1; i <= top; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
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