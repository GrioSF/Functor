package com.grio.functor;

/**
 * 
 * @author lhilden
 *
 * @param <T>
 * @param <T2>
 */
public interface Functor2<T, T2> {
	Void execute(T item, T2 item2);
}
