import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int topElement;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        queue1.add(x);
        topElement = x;
    }
    
    public int pop() {
        while (queue1.size() > 1) {
            topElement = queue1.remove();
            queue2.add(topElement);
        }
        int poppedElement = queue1.remove();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return poppedElement;
    }
    
    public int top() {
        return topElement;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}
public class Main {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top()); 
        System.out.println("Pop: " + stack.pop()); 

        System.out.println("Stack is empty: " + stack.empty()); 

        while (!stack.empty()) {
            System.out.println("Pop: " + stack.pop());
        }

        System.out.println("Stack is empty: " + stack.empty()); 
    }
}