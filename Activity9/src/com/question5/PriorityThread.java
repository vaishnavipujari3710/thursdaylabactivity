package com.question5;

class Test extends Thread{
	public void run(){
		System.out.println("Priority of running thread: " + 
				Thread.currentThread().getPriority());
	}
}
 
public class PriorityThread{
	public static void main(String args[]){
		//creating thread.
		Test thrd1 = new Test();
		Test thrd2 = new Test();
		Test thrd3 = new Test();
 
		//set thread priority.
		thrd1.setPriority(Thread.MIN_PRIORITY);
		thrd2.setPriority(Thread.NORM_PRIORITY);
		thrd3.setPriority(Thread.MAX_PRIORITY);
 
		//start the thread.
		thrd1.start();
		thrd2.start();
		thrd3.start();
	}
}