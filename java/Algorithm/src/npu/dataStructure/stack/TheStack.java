/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npu.dataStructure.stack;

/**
 *
 * @author Shubham
 */
public class TheStack <T> {
    private T[] stack;
    private int position = -1;
    private int size;

    /**
	 * Constructs an empty stack with an initial capacity of ten.
     */
    public TheStack () {
	this.size = 10;
	this.stack = (T[])new Object[size];
    }

    public TheStack(int size) {
	this.stack = (T[])new Object[size];
	this.size = size;
    }

    public boolean isEmpty () {
	return position == -1;
    }

    public boolean isFull () {
	return position == size - 1;
    }
    
    public int size () {
        if(!isEmpty()) {
            int tam = position;
            return ++tam;
        }
        return 0;
    }

    public T peek () {
	return stack[position];
    }

    public void push (T element) {
	try {
		stack[++position] = element;
        } catch (ArrayIndexOutOfBoundsException e) {
		--position;
		System.out.println ("Error: stack overflow");
	}
    }

    public T pop () {
	try{
		T top = stack[position];
		stack[position--] = null;
		return top;
	} catch (ArrayIndexOutOfBoundsException e) {
		++position;
		System.out.println("Error: stack underflow");
		return null;
	}
    }

    public void displayStack () {
	if (!isEmpty()) {
		for (int i = 0; i <= position; i++) {
			System.out.print (stack[i] + " ");
		}
	}
    }    
    
    public void clear () {
	if (!isEmpty()) {
		for (int i = 0; i <= position; i++) {
			stack[i] = null;
		}
		position = -1;
	}
    }
}
