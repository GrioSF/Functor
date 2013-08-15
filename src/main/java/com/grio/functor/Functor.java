package com.grio.functor;

/**
 * 
 * @author lhilden
 *
 * @param <T>
 */
public interface Functor<T> extends AbstractFunctor<T, Void>{
	Void execute(T item);
}
