/*
 *  文件创建时间： 2015年9月2日
 *  文件创建者: iamyumingxing
 *  所属工程: toys.demo
 *
 *  备注: 
 */
package info.gutan.toys.demo.guava.basic;

import org.junit.Test;

import com.google.common.base.CaseFormat;

/**
 * 
 * 类功能描述：大小写格式
 *
 * @author <a href="mailto:iamyumingxing@gmail.com">iamyumingxing</a>
 * @since 2015年9月2日
 *
 */
public class CaseFormatTest {

	@Test
	public void guavaDo() {

		String name = "CONSTANT_NAME";

		System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name));// constantName
		System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_HYPHEN, name));// constant-name
		System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_UNDERSCORE, name));// constant_name
		System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name));// ConstantName

	}
}
