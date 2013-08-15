package com.grio.functor;

/**
 * 
 * @author lhilden
 *
 * @param <T>
 */
public interface BooleanFunctor<T> extends AbstractFunctor<T, Boolean> {
	Boolean execute(T item);
}
