package starter;
import java.util.LinkedList;
import java.util.Queue;

public class StackQueueDemo {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("pig");
		queue.offer("dog");
		queue.offer("cat");
		queue.remove();
		queue.remove();
		queue.offer("eagle");
		queue.offer("snake");
		queue.remove();
		System.out.println(queue);
		
	}
	 

}
