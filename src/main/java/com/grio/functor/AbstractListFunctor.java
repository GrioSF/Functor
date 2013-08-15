package com.grio.functor;

import java.util.ListIterator;

/**
 * 
 * @author lhilden
 *
 * @param <T>
 * @param <R>
 */
public interface AbstractListFunctor<T, Q> {
	Q execute(T item, ListIterator<T> itr);
}
