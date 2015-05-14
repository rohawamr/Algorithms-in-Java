
public class Max implements Runnable{
	private int[] b=new int[100];
	private int n1;
	private GetSet max1;

	public Max(int[] a, int n,GetSet val) {
			// TODO Auto-generated constructor stub
		b=a;
		n1=n;
		max1=val;
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
		//	for(int i=0;i<10;i++)
		//		System.out.println("Thread Max");
			int max=b[0];
			for(int i=0;i<n1;i++)
			{
				if(b[i]>max)
					max=b[i];
				
			}
			
			max1.setvar(max);
		}catch(Exception e){}
	}
	}