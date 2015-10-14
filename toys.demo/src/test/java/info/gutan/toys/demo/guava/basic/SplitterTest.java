/*
 *  文件创建时间： 2015年9月2日
 *  文件创建者: iamyumingxing
 *  所属工程: demo
 *
 *  备注: 
 */
package info.gutan.toys.demo.guava.basic;

import org.junit.Test;

import com.google.common.base.Splitter;

/**
 * 
 * 类功能描述：字符串拆分器
 *
 * @author <a href="mailto:iamyumingxing@gmail.com">iamyumingxing</a>
 * @since 2015年9月2日
 *
 */
public class SplitterTest {

	String drinks = " green tea# yoghourt ##pure milk #black tea";

	String seperator = "#";

	@Test
	public void guavaDo() {

		// 默认
		System.out.println(Splitter.on(seperator).split(drinks));
		// 忽略空字串
		System.out.println(Splitter.on(seperator).omitEmptyStrings().split(drinks));
		// 忽略空字串、去除元素前后空白
		System.out.println(Splitter.on(seperator).omitEmptyStrings().trimResults().split(drinks));
		// 忽略空字串、去除元素前后空白、限制分拆元素个数
		System.out.println(Splitter.on(seperator).omitEmptyStrings().trimResults().limit(3).split(drinks));

		// Result:
		// [ green tea, yoghourt , , pure milk , black tea]
		// [ green tea, yoghourt , pure milk , black tea]
		// [green tea, yoghourt, pure milk, black tea]
		// [green tea, yoghourt, pure milk #black tea]

	}

}
