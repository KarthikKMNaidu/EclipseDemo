package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
				

		map.put("Name", "Karthik");
		map.put("Address", "Kappanahalli");
		map.put("Profession", "Software Developer");
		map.put("Designation", "Android Developer");
		map.put("Email", "karthikkm25@gmail.com");

		Set<String> keys = new HashSet<String>();
		keys.addAll(map.keySet());

		/*
		 * for (String key : keys) { System.out.println(key + ", " + map.get(key)); }
		 */

		Set<Map.Entry<String, String>> entry = map.entrySet();

		for (Entry<String, String> e : entry) {
			System.out.println(e);
		}
	}

}
