package com.grio.functor;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFunctor {

	private List<String> stringList;
	final Integer[] visited = new Integer[] {0};
	
	@Before
	public void setup() {
		stringList = Arrays.asList("one", "two", "three", "four", "five", "six");
	}
	
	@Test
	public void testListAllFunctor() {
		Visitor.visit(stringList, new ListAllFunctor<String>() {

			@Override
			public Void execute(String item, ListIterator<String> itr) {
				System.out.println(item);
				visited[0]++;
				return null;
			}
		});
		Assert.assertEquals((Integer)stringList.size(), visited[0]);
	}

	@Test
	public void testListFunctor() {
		
		Visitor.visit(stringList, new SimpleListFunctor<String>() {

			@Override
			public Boolean execute(String item, ListIterator<String> itr) {
				Boolean retval = true;
				System.out.println(item);
				if (item.equals("four")) {
					retval = false;
				}
				visited[0]++;
				return retval;
			}
		});
		Assert.assertEquals((Integer)4, visited[0]);
	}
	
	@Test
	public void testListFunctor2() {
		
		SimpleListFunctor2<String, Integer> functor = new SimpleListFunctor2<String, Integer>() {

			@Override
			public Boolean execute(String item, ListIterator<String> itr) {

				Boolean retval = true;
				System.out.println(item);
				if (item.equals("five")) {
					result = 5;
					retval = false;
				}
				visited[0]++;
				return retval;
			}

		};
		
		Visitor.visit(stringList, functor);
		Assert.assertEquals((Integer)5, functor.getResult());
		Assert.assertEquals((Integer)5, visited[0]);
	}
	
}
