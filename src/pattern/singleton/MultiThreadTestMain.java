package pattern.singleton;

public class MultiThreadTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < 2; i++) {
			Thread thread = new Thread(new SingletonMultiThread());
			thread.start();
		}

	}

}
