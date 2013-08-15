package com.grio.functor;

import java.util.ListIterator;

/**
 * 
 * @author lhilden
 *
 * @param <T>
 */
public interface ListAllFunctor<T> extends AbstractListFunctor<T, Void> {
	Void execute(T item, ListIterator<T> itr);
}
