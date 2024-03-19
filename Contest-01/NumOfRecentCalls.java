import java.util.LinkedList;
import java.util.Queue;

class NumOfRecentCalls {
    private Queue<Integer> requests;

    public NumOfRecentCalls() {
        requests = new LinkedList<>();
    }
    
    public int ping(int t) {
        requests.add(t);
        while (requests.peek() < t - 3000) {
            requests.poll();
        }
        return requests.size();
    }

    public static void main(String[] args) {
        NumOfRecentCalls recentCounter = new NumOfRecentCalls();

        System.out.println(recentCounter.ping(1));    
        System.out.println(recentCounter.ping(100));  
        System.out.println(recentCounter.ping(3001)); 
        System.out.println(recentCounter.ping(3002)); 
    }
}