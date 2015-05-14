

public class Avg implements Runnable{
private int[] b=new int[100];
private int n1;
private GetSet avg1;

public Avg(int[] a, int n,GetSet val) {
		// TODO Auto-generated constructor stub
	b=a;
	n1=n;
	avg1=val;
	}

@Override
public void run() {
	// TODO Auto-generated method stub
	try{
	//	for(int i=0;i<10;i++)
		//	System.out.println("Thread Avg");
		int avg=0;
		for(int i=0;i<n1;i++)
		{
			avg+=b[i];
		}
		avg=avg/n1;
		avg1.setvar(avg);
		
	}catch(Exception e){}
}
}
