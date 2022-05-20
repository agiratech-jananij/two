
public class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		
		System.out.println("This is a Child Thread");
	}
	public static void main(String[] args) {
		System.out.println("This is Main Class");
		
		ThreadRunnable tr = new ThreadRunnable();
		
		Thread t = new Thread(tr);
		
		t.start();
	}
}
