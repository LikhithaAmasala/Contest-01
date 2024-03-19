import java.io.*;
import java.util.*;
public class QueueUsingStacks {
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public QueueUsingStacks() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }
    
    public void push(int x) {
        enqueueStack.push(x);
    }
    
    public int pop() {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }
    
    public int peek() {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.peek();
    }
    
    public boolean empty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }
    public class Main {
        public static void main(String[] args) {
            QueueUsingStacks myQueue = new QueueUsingStacks();
    
            myQueue.push(1);
            myQueue.push(2);
            myQueue.push(3);
    
            System.out.println("Peek: " + myQueue.peek()); 
            System.out.println("Pop: " + myQueue.pop());   
    
            System.out.println("Queue is empty: " + myQueue.empty()); 
    
            while (!myQueue.empty()) {
                System.out.println("Pop: " + myQueue.pop());
            }
    
            System.out.println("Queue is empty: " + myQueue.empty()); 
        }
    } 
}
