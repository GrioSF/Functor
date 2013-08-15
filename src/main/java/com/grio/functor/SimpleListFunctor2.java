package com.grio.functor;

/**
 * 
 * @author lhilden
 *
 * @param <T>
 * @param <R>
 */
public abstract class SimpleListFunctor2<T, R> implements ListFunctor2<T, R> {

	protected R result;
	
	@Override
	public R getResult() {
		return result;
	}

}
