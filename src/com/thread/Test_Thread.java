package com.thread;

public class Test_Thread {
public static void main(String[] args) {
	System.out.println("Test Thread-->Start");
	Thread taskTabel1 = new Thread(new TaskTable());
	taskTabel1.setName("TaskTable-one");
	taskTabel1.start();
	
	System.out.println("Test Thread-->end");
	
	
}
}
class TaskTable implements Runnable{

	@Override
	public void run() {
	for(int i =0;i<=10;i++) {
		System.out.println(Thread.currentThread().getName()+"--->executing"+i);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		
	}
	
}