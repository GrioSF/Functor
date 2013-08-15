package com.grio.functor;

/**
 * 
 * @author lhilden
 *
 * @param <T>
 * @param <R>
 */
public abstract class SimpleListFunctor<T> implements ListFunctor<T> {

	protected T result;
	
	@Override
	public T getResult() {
		return result;
	}
	
}
