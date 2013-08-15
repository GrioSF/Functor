package com.grio.functor;

import java.util.ListIterator;

/**
 * 
 * @author lhilden
 *
 * @param <T>
 */
public interface BooleanListFunctor<T> extends AbstractListFunctor<T, Boolean> {
	Boolean execute(T item, ListIterator<T> itr);
}
