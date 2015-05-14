
public class Min implements Runnable{
	private int[] b=new int[100];
	private int n1;
	private GetSet min1;

	public Min(int[] a, int n,GetSet val) {
			// TODO Auto-generated constructor stub
		b=a;
		n1=n;
		min1=val;
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
		//	for(int i=0;i<10;i++)
		//		System.out.println("Thread Min");
			int min=b[0];
			for(int i=0;i<n1;i++)
			{
				if(b[i]<min)
					min=b[i];
			}
			
			min1.setvar(min);
		}catch(Exception e){}
	}
	}