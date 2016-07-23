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
public class TheStackTest {
    public static void main(String[] args) {
        TheStack<String> stack = new TheStack<>();	
		
	for (int i = 0; i  < 10; i++)
		stack.push(""+(i*2+1));

	System.out.println("Print stack: ");
	stack.displayStack();
	System.out.println("");
	System.out.println("Top: " +stack.peek());
        System.out.println("Size: " +stack.size());
	System.out.println("Push: ");
	stack.push(""+10);
	System.out.println("isFull: " + stack.isFull());
	System.out.println("isEmpty: " +stack.isEmpty());
	System.out.println("Top: " + stack.peek());
	stack.clear();
	System.out.println("Pop: " + stack.pop());
	System.out.println("Top: " +stack.peek());
    }  
}
