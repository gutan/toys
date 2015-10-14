/*
 *  文件创建时间： 2015年9月1日
 *  文件创建者: iamyumingxing
 *  所属工程: demo
 *
 *  备注: 
 */
package info.gutan.toys.demo.guava.basic;

import org.junit.Test;

import com.google.common.base.Optional;

/**
 * 
 * 类功能描述：避免使用NULL
 * 
 * <pre>
 * null可能是没有值，或找不到值。例如，Map.get返回null就表示找不到给定键对应的值。
 *
 * @author <a href="mailto:iamyumingxing@gmail.com">iamyumingxing</a>
 * @since 2015年9月1日
 *
 */
public class OptionalTest {

	@Test
	public void guavaDo() {
		Integer status = null;

		// Optional<Integer> option = Optional.of(status);// 引用空， 直接抛异常NPE
		Optional<Integer> option = Optional.fromNullable(status);// 引用可空

		// 如果不为空
		if (option.isPresent()) {
			System.out.println(option.get());
		}

		// 如果为空，则取默认
		Optional<Integer> nullableObj = Optional.fromNullable(null);// 引用可空
		System.out.println(nullableObj.or(100));// 100

		nullableObj = Optional.fromNullable(88);// 引用可空
		System.out.println(nullableObj.or(100));// 88

	}
}
