package com.src.nirakar.functional;

@FunctionalInterface
public interface ConsumerFunctional<T> {

	void consume(T input);
}
