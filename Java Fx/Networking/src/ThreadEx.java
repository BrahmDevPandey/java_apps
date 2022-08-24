import java.util.Scanner;

// program to check whether two threads can execute parallely in an infinite while loop
public class ThreadEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Thread t1 =  new Thread(new Runnable() {
			int count = 0;
			@Override
			public void run() {
				while(true) {					
					System.out.println(count);
					count++;
//					if(sc.hasNext())
//						break;
				}
			}
		});
		
		Thread t2 =  new Thread(new Runnable() {
			int count = 0;
			@Override
			public void run() {
				while(true) {					
					System.out.println(count);
					count++;
//					if(sc.hasNext())
//						break;
				}
			}
		});

		t1.start();
		t2.start();
	}
}
