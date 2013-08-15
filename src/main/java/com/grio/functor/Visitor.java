package com.grio.functor;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;


/**
 * @author lhilden
 *
 * @param <T>
 */
public class Visitor<T, R> {

	/**
	 * 
	 * @param list
	 * @param functor
	 * @return
	 */
	public static <T> T visit(List<T> list, ListFunctor<T> functor) {
		for(ListIterator<T> itr = list.listIterator(); itr.hasNext() && functor.execute(itr.next(), itr); );
		return functor.getResult();
	}
	
	/**
	 * 
	 * @param list
	 * @param functor
	 */
	public static <T> void visit(List<T> list, ListAllFunctor<T> functor) {
		for(ListIterator<T> itr = list.listIterator(); itr.hasNext();) {
			 functor.execute(itr.next(), itr);
		}
	}

	/**
	 * 
	 * @param list
	 * @param functor
	 * @return
	 */
	public static <T, R> R visit(List<T> list, ListFunctor2<T, R> functor) {
		for(ListIterator<T> itr = list.listIterator(); itr.hasNext() && functor.execute(itr.next(), itr); );
		return functor.getResult();
	}
	
	/**
	 * 
	 * @param collection
	 * @param functor
	 */
	public static <T> void visit(Collection<T> collection, Functor<T> functor) {
		for(T item : collection) {
			functor.execute(item);
		}
	}

	/**
	 * 
	 * @param list
	 * @param functor
	 */
	public static <T> void visit(List<T> list, ListAllFunctor<T> functor, Filter<T> filter) {
		for(ListIterator<T> itr = list.listIterator(); itr.hasNext();) {
			T item = itr.next();
			if (filter.accept(item)) {
				functor.execute(item, itr);
			}
		}
	}
	
	private Visitor() {}

}
