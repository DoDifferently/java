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
public class TheQueueTest {
     public static void main(String[] args){
         TheQueue<Integer> queue = new TheQueue<>();
		
	System.out.println(queue.isEmpty());
	queue.insert(1);
	queue.insert(2);
	queue.insert(3);
	System.out.println(queue.isFull());
        System.out.println("Dequeue: " + queue.remove());
        System.out.println("Dequeue: " + queue.remove());
        System.out.println("Dequeue: " + queue.remove());
        System.out.println("Dequeue: " + queue.remove());
	
	queue.insert(4);
	queue.insert(5);
	queue.insert(6);
	
	System.out.println(queue.size());
	System.out.println(queue.peek());
		
	queue.displayTheQueue();
	queue.clear();
        queue.displayTheQueue();
    }    
}
