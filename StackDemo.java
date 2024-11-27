package starter;
import java.util.Stack;

public class StackDemo {

		public static void main(String[] args) {
			Stack<String> stack = new Stack<String>();
			stack.push("dog");
			stack.push("cat");
			stack.push("pig");
		
			while(!stack.empty()) {
				System.out.println(">" + stack.pop());
				
			}
		}
}
