package MultiThreading;

 class ThreadDemo extends Thread{
	private String name;
	public ThreadDemo(String name) {
		this.name=name;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(name+" "+":"+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
 }
	public class MyThread{
	public static void main(String[] args) {
	ThreadDemo thread1=new ThreadDemo("Thread1");
	thread1.start();
	thread1.setPriority(Thread.NORM_PRIORITY);
	ThreadDemo thread2=new ThreadDemo("Thread1");
	thread2.start();
	
	}
	}

