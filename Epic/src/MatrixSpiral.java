
public class MatrixSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multi = new int[][]{
				  { 1, 2, 3, 4},
				  { 12, 13, 14, 5},	
				  { 11, 16, 15, 6},
				  
				};
		spiralPrint(multi);
		
	}
	public static void spiralPrint(int[][] a)
	{
	    int i, k = 0, l = 0;
	    int m=a.length;
	    int n=a[0].length;
	    		System.out.println(m);
	    		System.out.println(n);
	 
	    /*  k - starting row index
	        m - ending row index
	        l - starting column index
	        n - ending column index
	        i - iterator
	    */
	 
	    while (k < m && l < n)
	    {
	        /* Print the first row from the remaining rows */
	        for (i = l; i < n; ++i)
	        {
	            System.out.println(a[k][i]);
	        }
	        k++;
	 
	        /* Print the last column from the remaining columns */
	        for (i = k; i < m; ++i)
	        {
	        	 System.out.println(a[i][n-1]);
	        }
	        n--;
	 
	        /* Print the last row from the remaining rows */
	        if ( k < m)
	        {
	            for (i = n-1; i >= l; --i)
	            {
	            	 System.out.println(a[m-1][i]);
	            }
	            m--;
	        }
	 
	        /* Print the first column from the remaining columns */
	        if (l < n)
	        {
	            for (i = m-1; i >= k; --i)
	            {
	            	 System.out.println(a[i][l]);
	            }
	            l++;    
	        }        
	    }
	}
	 
	/* Driver program to test above functions */
	
}
