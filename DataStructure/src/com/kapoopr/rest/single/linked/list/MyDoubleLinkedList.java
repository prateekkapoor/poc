package com.kapoopr.rest.single.linked.list;

import java.util.Iterator;

public class MyDoubleLinkedList<T> implements Iterable<T>, MyList<T> {
	private Link<T> start;

	private class Link<R> {
		Link<R> prev;
		R data;
		Link<R> next;
	}

	public MyDoubleLinkedList() {

	}

	private Link<T> createNewLink(T t) {
		Link<T> newLink = new Link<T>();
		newLink.prev = null;
		newLink.data = t;
		newLink.next = null;
		return newLink;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kapoopr.single.linked.list.MyDoubleLinkedList#addAtStart(T)
	 */
	@Override
	public boolean addAtStart(T num) {
		if (start != null) {
			Link<T> link = createNewLink(num);
			link.next = start;
			start.prev = link;
			start = link;

		} else {
			Link<T> link = createNewLink(num);
			start = link;

		}
		return true;

	}

	private Link<T> findBeforeInsertLink(T t) {
		Link<T> temp = start;

		while (!t.equals(temp.data) && temp.next != null) {
			temp = temp.next;
		}
		return temp;

	}

	private Link<T> findBeforeInsertLink() {
		Link<T> temp = start;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp;

	}

	private Link<T> findBeforeremoveLink(T t) {
		Link<T> temp = start;
		Link<T> temp1 = temp.next;
		while (temp1 != null && !t.equals(temp1.data) && temp1.next != null) {
			temp = temp1;
			temp1 = temp1.next;
		}
		return temp;

	}

	private Link<T> findBeforeremoveLink() {
		Link<T> temp = start;
		Link<T> temp1 = temp.next;
		while (temp1 != null && temp1.next != null) {
			temp = temp1;
			temp1 = temp1.next;
		}
		return temp;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kapoopr.single.linked.list.MyDoubleLinkedList#addAtEnd(T)
	 */
	@Override
	public boolean addAtEnd(T num) {
		if (start != null) {
			Link<T> targetLink = findBeforeInsertLink();
			Link<T> newLink = createNewLink(num);
			newLink.prev = targetLink;
			targetLink.next = newLink;

		} else {
			Link<T> link = createNewLink(num);
			start = link;
		}
		return true;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kapoopr.single.linked.list.MyDoubleLinkedList#addAtPos(T, T)
	 */
	@Override
	public boolean addAtPos(T pos, T num) {
		if (start != null) {
			Link<T> targetLink = findBeforeInsertLink(pos);
			Link<T> newLink = createNewLink(num);
			newLink.next = targetLink.next;
			newLink.prev = targetLink.prev;
			if (targetLink.next != null) {
				targetLink.next.prev = newLink;
			}
			targetLink.next = newLink;

		} else {
			Link<T> link = createNewLink(num);
			start = link;
		}
		return true;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kapoopr.single.linked.list.MyDoubleLinkedList#removeAtStart()
	 */
	@Override
	public T removeAtStart() {
		T data = null;
		if (start != null) {
			data = start.data;
			start = start.next;
			if (start != null)
				start.prev = null;
		}
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kapoopr.single.linked.list.MyDoubleLinkedList#removeAtEnd()
	 */
	@Override
	public T removeAtEnd() {
		T data = null;
		if (start != null) {
			Link<T> temp = findBeforeremoveLink();
			data = temp.data;
			if (temp.next != null)
				temp.next = null;
			else
				start = null;
		}
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 */
	@Override
	public boolean removeAtPos(T num) {
		if (start != null) {
			Link<T> temp = findBeforeremoveLink(num);
			if (temp.next != null) {
				temp.next.prev = temp;
				temp.next = temp.next.next;
				

			} else {
				start = null;
			}
			return true;
		}
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			Link<T> temp = start;

			@Override
			public boolean hasNext() {
				if (temp == null) {
					return false;
				} else {
					return true;
				}
			}

			@Override
			public T next() {
				T data = null;
				if (temp != null) {
					data = temp.data;
					temp = temp.next;
				}
				return data;
			}
		};
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (T link : this) {
			stringBuilder.append(link).append("---->");
		}
		return stringBuilder.toString();
	}

	@Override
	public boolean contains(T num) {
		// TODO Auto-generated method stub
		return false;
	}
}
