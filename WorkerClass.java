package javathreads.threadpool;

public class WorkerClass implements Runnable{
	String message;
	
	WorkerClass(String m) {
		this.message = m;
	}
	
	@Override
	public void run() {
		System.out.println("The worker-thread "+Thread.currentThread().getName()+" is executing");
		System.out.println("Message for "+Thread.currentThread().getName()+" is:" +this.message);
		//lets sleep for some time
		try {
			Thread.sleep(10);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
