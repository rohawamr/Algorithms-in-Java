import java.util.Scanner;


public class Parent {
	public static void main(String[] args) {
	int avg1;
final int[] a = {1,2,3,6};;
 		
		System.out.println("Enter the number of integers : ");
		Scanner s = new Scanner(System.in);
		final int n = s.nextInt();
		System.out.println("Enter the integers : ");
		//for (int i = 0; i < n; i++) {
		//	a[i] = s.nextInt();
	//	}
		GetSet get=new GetSet();
		GetSet get1=new GetSet();
		GetSet get2=new GetSet();

		Thread t1=new Thread(new Avg(a,n,get));
		Thread t2=new Thread(new Max(a,n,get1));
		Thread t3=new Thread(new Min(a,n,get2));

		t1.start();
		t2.start();
		t3.start();

		try{
			t1.join();
			t2.join();
			t3.join();

			System.out.println("The average is " + get.getvar()); 
			System.out.println("The Maximum is " + get1.getvar());
			System.out.println("The Minimum is " + get2.getvar());

		}catch(Exception E){}
		

	}
	
}
