import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValues {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("first", "D");
		map.put("second", "S");
		map.put("third", "Y");
		map.put("fourth", "Z");
		map.put("fifth", "A");
		
		System.out.println("Before: " + map);
		
		List<Map.Entry<String, String>> entries = new LinkedList<Map.Entry<String, String>>(map.entrySet());
		Collections.sort(entries, new Comparator<Map.Entry<String, String>>() {
			public int compare(Map.Entry<String, String> v1, Map.Entry<String, String> v2) {
				return v1.getValue().compareTo(v2.getValue());
			}
		});
		
		Map<String, String> sortedMap = new LinkedHashMap<String, String>();
		
		for(Map.Entry<String, String> entry : entries) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println("After: "+sortedMap);
	}

}
