/*
 *  文件创建时间： 2015年9月2日
 *  文件创建者: iamyumingxing
 *  所属工程: toys.demo
 *
 *  备注: 
 */
package info.gutan.toys.demo.guava.basic;

import org.junit.Test;

import com.google.common.base.Preconditions;

/**
 * 
 * 类功能描述：前置条件
 *
 * @author <a href="mailto:iamyumingxing@gmail.com">iamyumingxing</a>
 * @since 2015年9月2日
 *
 */
public class PreconditionsTest {

	@Test
	public void guavaDo() {

		int i = -1;
		int j = -2;
//		Preconditions.checkArgument(i >= 0, "Argument was %s but expected nonnegative", i);// IllegalArgumentException
		Preconditions.checkArgument(i < j, "Expected i < j, but %s > %s", i, j);// IllegalArgumentException

//		Preconditions.checkNotNull(null, "Argument was null but expected not null");// NullPointerException

		// 检查：检查index作为索引值对某个列表、字符串或数组是否有效,即index>=0 && index<size
//		Preconditions.checkElementIndex(12, 10, "Expected index less than collection's size!");// IndexOutOfBoundsException

//		Preconditions.checkState(false, "State was false but expected true");// IllegalStateException

	}

}
