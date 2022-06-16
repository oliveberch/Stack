public class StackViaArray {
    final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    StackViaArray() {
        top = -1;
    }

    // Function to chech if Stack is empty
    boolean isEmpty() {
        return (top < 0);
    }

    // Function to push element in stack
    boolean push(int data) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = data;
            return true;
        }
    }

    // Function to pop element from Stack
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        } else {
            int popped = a[top--];
            return popped;
        }
    }

    // Function to get top element in stack
    int peek() {
        if (top < 0) {
            System.out.println("Stack Underrflow");
            return Integer.MIN_VALUE;
        } else {
            int peek = a[top];
            return peek;
        }
    }

    // Function to print all the elements of stack
    void print() {
        for (int i = top; i >= 0; i--) {
            System.out.print(a[i] + ", ");
        }
    }
}