import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		final int[] a = new int[100];
		System.out.println("Enter the number of integers : ");
		Scanner s = new Scanner(System.in);
		final int n = s.nextInt();
		System.out.println("Enter the integers : ");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Thread t1");
				int avg=0;
				for(int i=0;i<n;i++)
				{
					avg+=a[i];
				}
				avg=avg/n;

			}

		};

		Thread t2 = new Thread() {
			public void run() {

				System.out.println("Thread t2");
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		};
		Thread t3 = new Thread() {
			public void run() {

				System.out.println("Thread t3");
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};
		t1.start();
		t2.start();
		t3.start();
	}
}
