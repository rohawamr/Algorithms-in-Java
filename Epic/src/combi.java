
public class combi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chno={'a','b','c','d'};
		System.out.println(chno);
		
		int n=chno.length;
		
		for(int m=0;m<(1<<(n));m++){
			//if(Integer.bitCount(m)<=1){continue;}
			//System.out.println(m);
			//int prod=1;
			String ptr="";
			for(int j=0;j<=n;j++){
				if((m & 1<<j)>0){
					ptr=ptr+chno[j];
				}
			}
			System.out.println(ptr);
		}
	}

}
