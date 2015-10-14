/*
 *  文件创建时间： 2015年9月2日
 *  文件创建者: iamyumingxing
 *  所属工程: toys.demo
 *
 *  备注: 
 */
package info.gutan.toys.demo.guava.basic;

import java.util.List;

import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;

/**
 * 
 * 类功能描述：字符串链接器
 *
 * @author <a href="mailto:iamyumingxing@gmail.com">iamyumingxing</a>
 * @since 2015年9月2日
 *
 */
public class JoinerTest {

	List<String> drinks = Lists.newArrayList("green tea", "yoghourt", null, "pure milk", "black tea");
	
	String seperator = "; ";

	@Test
	public void guavaDo() {

//		System.out.println(Joiner.on(seperator).useForNull("").join(drinks));// green tea; yoghourt; ; pure milk; black tea
		System.out.println(Joiner.on(seperator).skipNulls().join(drinks));// green tea; yoghourt; pure milk; black tea

	}

	@Test
	public void usedToDo() {

		StringBuilder sb = new StringBuilder();
		for (String drink : drinks) {
			sb.append(Strings.nullToEmpty(drink)).append(seperator);
//			if(null != drink) {
//				sb.append(drink).append(seperator);
//			}

		}
		//去掉最后一个分隔符
		System.out.println(sb.substring(0, sb.length()-seperator.length()).toString());//green tea; yoghourt; ; pure milk; black tea

	}

}
