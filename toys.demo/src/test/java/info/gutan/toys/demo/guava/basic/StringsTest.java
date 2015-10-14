/*
 *  文件创建时间： 2015年9月1日
 *  文件创建者: iamyumingxing
 *  所属工程: toys.demo
 *
 *  备注: 
 */
package info.gutan.toys.demo.guava.basic;

import org.junit.Test;

import com.google.common.base.Strings;

/**
 * 
 * 类功能描述：区分null与空
 *
 * @author <a href="mailto:iamyumingxing@gmail.com">iamyumingxing</a>
 * @since 2015年9月1日
 *
 */
public class StringsTest {

	@Test
	public void guavaDo() {

		System.out.println(Strings.emptyToNull(""));// null
		System.out.println(Strings.nullToEmpty(null));// ""
		System.out.println(Strings.isNullOrEmpty(""));// true
		System.out.println(Strings.isNullOrEmpty(null));// true

	}
}
