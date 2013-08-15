package com.grio.functor;

/**
 * 
 * @author lhilden
 *
 * @param <F>
 */
public interface Filter<F> {

	boolean accept(F item);
	
}
