public class StackViaLinkedList {
    StackNode root;
    //Creating class Stacknode to be used in Stack LinkedList
    public class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }
    // Function to check if stack is empty
    public boolean isEmpty(StackNode top) {
        if (top == null) {
            return true;
        } else
            return false;
    }
    // Function to push data into stack
    public void push(StackNode top, int data) {
        StackNode nodeN = new StackNode(data);
        if (top == null) {
            top = nodeN;
            return;
        }
        StackNode temp = top;
        top = nodeN;
        nodeN.next = temp;
    }
    // Function to pop data from Stack
    public int pop(StackNode top) {
        if (top == null) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        StackNode popped = top;
        top = top.next;
        return popped.data;
    }
    // Function to peek top node from stack
    public int peek(StackNode top) {
        if (top == null) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        return top.data;
    }
}