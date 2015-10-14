/*
 *  文件创建时间： 2015年9月2日
 *  文件创建者: iamyumingxing
 *  所属工程: toys.demo
 *
 *  备注: 
 */
package info.gutan.toys.demo.guava.basic;

import org.junit.Test;

import com.google.common.base.CharMatcher;

/**
 * 
 * 类功能描述：字符匹配器
 *
 * @author <a href="mailto:iamyumingxing@gmail.com">iamyumingxing</a>
 * @since 2015年9月2日
 *
 */
public class CharMatcherTest {

	@Test
	public void guavaDo() {

		String mix = "[ A1B2C3 \r\n ===#  @###   #$ab789ckdddfd ]";

		System.out.println("-----------默认-----------");
		System.out.println(mix);// 默认
		System.out.println("-----------移除control字符-----------");
		System.out.println(CharMatcher.JAVA_ISO_CONTROL.removeFrom(mix)); // 移除control字符
		System.out.println("-----------只保留数字字符-----------");
		System.out.println(CharMatcher.DIGIT.retainFrom(mix)); // 只保留数字字符
		System.out.println("-----------用*号替换所有数字-----------");
		System.out.println(CharMatcher.JAVA_DIGIT.replaceFrom(mix, "*")); // 用*号替换所有数字
		System.out.println("-----------只保留数字和小写字母-----------");
		System.out.println(CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom(mix));// 只保留数字和小写字母
		System.out.println("-----------只保留指定字符-----------");
		System.out.println("只保留指定字符[Aa#]");
		System.out.println(CharMatcher.anyOf("Aa#").retainFrom(mix));// 只保留指定字符Aa#
		System.out.println("只保留指定字符[a-c]");
		System.out.println(CharMatcher.inRange('a', 'c').retainFrom(mix));// 只保留指定字符a-c

	}

}
