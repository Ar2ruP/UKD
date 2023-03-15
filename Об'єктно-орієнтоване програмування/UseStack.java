class StackNode {
    int date;
    StackNode next;
}
public StackNode(int date) {
    this.date = date;
}

class Stack {
    StackNode root;
    void push(int date) {
        StackNode node = new StackNode(date);
        if (root == null) {
            root = node;
        } else {
            StackNode temp = root;
            root = node;
            node.next = temp;
        }
    }
}
public class UseStack {
    public static void main(String Args[]) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
    }
}
