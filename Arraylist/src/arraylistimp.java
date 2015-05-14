import java.util.*;
public class arraylistimp {

	static Scanner rd=new Scanner(System.in);
	
	static ArrayList<Integer> arr=new ArrayList<Integer>();
	
			public static void main(String[] args) {
				System.out.println("Please enter an array of integers(Enter 0 when finished): ");
				int inp= rd.nextInt(); 
				while(inp !=0)
				{
					arr.add(inp);
					inp=rd.nextInt();
				}
				System.out.println("---------------------------------------");
				for(int i:arr)
				{
					System.out.print	("\t"+i);
				}
				
				
				for(int i:arr)
				{
					if(arr.get(i)==3)
					{
						arr.remove(i);
						break;
					}
				}									// deleting
				
				for(int i:arr)
				{
					System.out.print	("\t"+i);
				}
}
}
