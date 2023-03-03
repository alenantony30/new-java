package mapfam;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map = new HashMap<Integer,String>();
				
		map.put(11, "Alen");
		map.put(12, "Sam");
		map.put(13, "Sam");
		map.put(15, "Alen");
		map.put(14, "Sam");
		
		System.out.println(map);
		
	}

}
