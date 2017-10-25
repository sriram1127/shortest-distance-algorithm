import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<Map.Entry<String, Integer>>(3,
				new Comparator<Map.Entry<String, Integer>>() {

					@Override
					public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

						return o1.getValue().compareTo(o2.getValue());
					}

				});
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("A", 2);
		map.put("C", 4);
		map.put("T", 7);
		Entry<String, Integer> obj = null;
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			obj = e;
			pq.add(e);
		}
		/*
		 * for (Map.Entry<String, Integer> e : map.entrySet()) {
		 * System.out.println(e.toString()); pq.remove(e); }
		 */

		String s = "A=2";
		
		System.out.println(pq.peek());
		System.out.println(pq.peek());
		System.out.println(pq.remove(obj));
		System.out.println(pq.peek());
	}
}
