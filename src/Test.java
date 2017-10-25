import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Test {
	
	public static void main(String[] args) {
		 
		/*StringTokenizer st = new StringTokenizer("The hello world"	);
		System.out.println(st.countTokens());*/
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("A");
		pq.remove("A");
		System.out.println(pq.peek());
	}

}
