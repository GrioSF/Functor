package com.grio.functor;

import java.util.ListIterator;

/**
 * 
 * @author lhilden
 *
 * @param <T>
 * @param <R>
 */
public interface ListFunctor2<T, R> extends BooleanListFunctor<T>  {
	R getResult();
	Boolean execute(T item, ListIterator<T> itr);
}
