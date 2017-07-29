package com.kapoopr.rest.single.linked.list;

public interface MyList<T> {

	public abstract boolean addAtStart(T num);

	public abstract boolean addAtEnd(T num);

	public abstract boolean addAtPos(T pos, T num);

	public abstract T removeAtStart();

	public abstract T removeAtEnd();

	public abstract boolean removeAtPos(T num);

	public abstract boolean contains(T num);

}