/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npu.dataStructure.queue;

/**
 *
 * @author Shubham
 */
public class TheQueue <T> {
    private T[] queue;
    private int front =  0,
		back  =  0,
		size;

    public TheQueue () {
	this.size = 10;
	this.queue = (T[])new Object[size];
    }

    public TheQueue (int size) {
	this.size = size;
	this.queue = (T[])new Object[size];
    }

    public boolean isEmpty () {
	return back == front;
    }

    public boolean isFull () {
	return front == size - 1;
    }

    public int size () {
	return front - back;
    }

    public T peek () {
	try {
		return queue[front-1];
	} catch (ArrayIndexOutOfBoundsException e) {
		return null;
	}
    }

    public void insert (T element) {	
	if (isFull()) {
		System.out.println("Error: queue overflow");
	} else {
		queue[front++] = element;
	}
    }

    public T remove () {
	if (isEmpty()) {
		System.out.println("Error: queue underflow");
		return null;
	} else {
		T item = queue[back++];
		return item;
	}
    }

    public void displayTheQueue () {
	if (!isEmpty()) {
		for (int i = back; i < front; i++) {
			System.out.print(queue[i] + " ");
		}
	}
    }

    public void clear () {
	if (!isEmpty()) {
		for (int i = 0; i < front; i++) {
			queue[i] = null;
		}
	}
        back = 0;
	front = 0;
    }
}