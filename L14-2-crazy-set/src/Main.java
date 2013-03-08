import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("hello");
		
		System.out.println(list.hashCode());
		
		Set<List<String>> set = new HashSet<List<String>>();
		set.add(list);
		
	}
}
