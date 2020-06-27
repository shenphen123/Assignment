package core.thread;

public class ThreadB extends Thread{

	@Override
	public void run(){
		for(int i = 0; i <100; i++){
			 System.out.println("Current name is " + Thread.currentThread().getName() + "i =" + i) ;
	}
}
}