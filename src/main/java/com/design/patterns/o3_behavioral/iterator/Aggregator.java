package com.design.patterns.o3_behavioral.iterator;

public interface Aggregator<T> {

  Iterator<T> createIterator();

}
