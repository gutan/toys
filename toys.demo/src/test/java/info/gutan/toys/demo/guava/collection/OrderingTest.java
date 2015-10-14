/*
 *  文件创建时间： 2015年9月8日
 *  文件创建者: iamyumingxing
 *  所属工程: toys.demo
 *
 *  备注: 
 */
package info.gutan.toys.demo.guava.collection;

import java.util.List;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

/**
 * 
 * 类功能描述：集合排序
 *
 * @author <a href="mailto:iamyumingxing@gmail.com">iamyumingxing</a>
 * @since 2015年9月8日
 *
 */
public class OrderingTest {

	class Person {

		private String name;
		private int age;

		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}

	@Test
	public void guavaDo() {

		List<Person> persons = Lists.newArrayList();
		persons.add(new Person("Peter", 12));
		persons.add(new Person("Susan", 18));
		persons.add(new Person("Hellen", 20));
		persons.add(new Person("Anne", 15));

		// 按照年龄升序
		Ordering<Person> orderingAge = Ordering.natural().onResultOf(new Function<Person, Integer>() {
			@Override
			public Integer apply(Person input) {
				return input.getAge();
			}
		});

		persons = orderingAge.sortedCopy(persons);
		System.out.println("-----------------按照年龄升序");
		for (Person person : persons) {
			System.out.println(person.getName() + ":" + person.getAge());
		}

		// 按照名字升序
		Ordering<Person> orderingName = Ordering.natural().onResultOf(new Function<Person, String>() {
			@Override
			public String apply(Person input) {
				return input.getName();
			}
		});

		persons = orderingName.sortedCopy(persons);
		System.out.println("-----------------按照名字升序");
		for (Person person : persons) {
			System.out.println(person.getName() + ":" + person.getAge());
		}

	}
}
