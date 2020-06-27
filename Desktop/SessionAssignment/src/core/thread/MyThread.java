package core.thread;

public class MyThread {

	public static void main(String[] args) {
		 System.out.println("Current Thread " + Thread.currentThread().getName() + " started");
		ThreadA threadA = new ThreadA();
		threadA.start();
		
		
		ThreadA threadB = new ThreadA();
		threadB.start();
		try{
			threadB.join();
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("Completed");
		 }

	}


