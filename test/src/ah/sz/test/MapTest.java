package ah.sz.test;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Map<Long,String>  map = new HashMap<Long,String>();
		map.put(1L,"北京");
		map.put(2L,"上海");
		map.put(3L,"天津");
		map.put(4L,"重庆");
		System.out.println("集合大小="+map.size());
		Set<Long>set = map.keySet();
		for(Long long1:set){
			System.out.println(long1);}
			Collection<String> values = map.values();//collection List ArrayList
			for(String str:values){
				System.out.println(str);
			}
			map.remove(1L);
			System.out.println("集合大小="+map.size());
		}
	}


