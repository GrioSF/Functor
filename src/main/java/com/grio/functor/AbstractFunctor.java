package com.grio.functor;

/**
 * 
 * @author lhilden
 *
 * @param <T>
 * @param <R>
 */
public interface AbstractFunctor<T, R> {
	R execute(T item);
}
