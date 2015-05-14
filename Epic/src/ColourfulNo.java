
public class ColourfulNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(checkColourful(3245))
		{System.out.println("Number is colourful");}
		else
		{System.out.println("Number is not colourfull");}
		
		
	}
	
	
	public static boolean checkColourful(int number){
		char[] chno=Integer.toString(number).toCharArray();
		System.out.println(chno);
		
		int n=chno.length;
		
		if(n<=2){return false;}
		int[] c=new int[10];
		int distinct=0;
		
		for(int i=0;i<n;i++){c[chno[i]-'0']++;}
		
		//for(int i=0;i<10;i++){System.out.println(c[i]);}
		
		
		for(int i=0;i<10;i++){
			if(c[i]>0){distinct++;} 
		}
		System.out.println(distinct);
		if(c[1]>0){return false;}
		if(distinct<n)
		{return false;}
		
		
		int[] set=new int[40000];
		
		for(int m=0;m<(1<<n);m++){
			if(Integer.bitCount(m)<=1){continue;}
			
			int prod=1;
			for(int j=0;j<n;j++){
				if((m & 1<<j)>0){
					prod=prod*(chno[j]-'0');
				}
			}
			
			if(set[prod]>0){
				System.out.println("reached");
				return false;}
			else{set[prod]++;}
				
		}
		
			
		return true;
		
	} 

}
