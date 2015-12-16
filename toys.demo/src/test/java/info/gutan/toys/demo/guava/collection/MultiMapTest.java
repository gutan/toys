/*
 *  文件创建时间： 2015年8月26日
 *  文件创建者: iamyumingxing
 *  所属工程: toys.demo
 *
 *  备注: 
 */
package info.gutan.toys.demo.guava.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Test;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

/**
 * 
 * 类功能描述：
 * 
 * <pre>
 * 有没有很熟悉？！ 检查一个map，是否存在一个key对应一个集合?不存在，则新建一个集合并添加一个<K,V>
 * 
 * @author <a href="mailto:iamyumingxing@gmail.com">iamyumingxing</a>
 * @since 2015年8月26日
 * 
 */
public class MultiMapTest {

	Map<String, Set<String>> map = Maps.newHashMap();

	private void put(String key, String value) {
		Set<String> set = map.get(key);
		if (null == set) {
			set = Sets.newHashSet();
			map.put(key, set);
		}
		set.add(value);
	}

	@Test
	public void usedToDo() {

		put("tea", "green tea");
		put("milk", "yoghourt");
		put("milk", "pure milk");
		put("tea", "black tea");

		System.out.println(map.keySet());
		System.out.println(map.get("tea"));
		System.out.println(map.get("milk"));
		System.out.println(map.values());

		// reinvent the Wheel

		// remove(k,v)
		// removeAll(k)

	}

	Multimap<String, String> multiMap = HashMultimap.create();

	@Test
	public void guavaDo() {

		multiMap.put("tea", "green tea");
		multiMap.put("milk", "yoghourt");
		multiMap.put("milk", "pure milk");
		multiMap.put("tea", "black tea");

		System.out.println(multiMap.keySet());
		System.out.println(multiMap.get("tea"));
		System.out.println(multiMap.get("milk"));
		System.out.println(multiMap.values());

		Collection<Entry<String, String>> collection = multiMap.entries();
		for (Entry<String, String> entry : collection) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("=============remove=============");

		multiMap.remove("tea", "green tea");
		multiMap.removeAll("milk");

		System.out.println(multiMap.keySet());
		System.out.println(multiMap.get("tea"));
		System.out.println(multiMap.get("milk"));
		System.out.println(multiMap.values());

	}

}
