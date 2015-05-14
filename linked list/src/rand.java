import java.io.*;

public class rand {

	
	public static void main(String args[]){
		
		int m = 0, n = 112;
		int a=0,b=0,c=0,d=0,i,j;
	double kick[] = new double[n];
	double high[] = new double[n];
		try{
			BufferedReader r1 = new BufferedReader(new FileReader("C:\\kmeans.txt"));
			BufferedReader r2 = new BufferedReader(new FileReader("C:\\hc.txt"));
			String k1;
			String k2;
			while(m < n){
			
			
			k1 = r1.readLine();
			k2 = r2.readLine();
			String[] f1= k1.split(",");
			String[] g1= k2.split(",");
			
			kick[m] = Double.parseDouble(f1[2]);
			high[m] = Double.parseDouble(g1[12]);
			
			m++;
			}
			r1.close();
			r2.close(); 
			for (i = 0; i<n ; i++)
			{
			    for (j = (i+1); j<n; j++)
			      {  
  		    
			          if( kick[i]==kick[j] && high[i]==high[j] ) a++;
			else if( kick[i]!=kick[j] && high[i]!=high[j] ) b++;
			else if( kick[i]==kick[j] && high[i]!=high[j]  )  c++;
			else d++;
			        }
			}
		
			double ri = (double)(a+b)/(a+b+c+d);
			System.out.println("The Rand Index for k=4 k means and k=4 complete hierarchical is "+ri);
			
			
			
			}

			catch( IOException ioException ) {}
	
	}
}
