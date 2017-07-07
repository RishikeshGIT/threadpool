package javathreads.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class JavaThreadPoolImplementer {

	public static void main(String [] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 10; i ++) {
			Runnable r = new WorkerClass("Message from the #"+i+" request.");
			es.execute(r);
		}
		es.shutdown();
		
		//ensure that the Executors ref is shutdown.
		while(!es.isTerminated()) {
			//do nothing
		}
	}
}
