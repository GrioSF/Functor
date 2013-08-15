package com.grio.functor;

import java.util.ListIterator;

/**
 * 
 * @author lhilden
 *
 * @param <T>
 */
public interface ListFunctor<T> extends BooleanListFunctor<T> {
	T getResult();
	Boolean execute(T item, ListIterator<T> itr);
}
