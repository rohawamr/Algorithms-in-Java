import java.util.Stack;


public class IsBalancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="[a+(b*c)]+d}";
		System.out.println(checkForBalanced(str));
		

	}
	
	public static boolean checkForBalanced(String str){
		
	Stack<Character> st=new Stack<Character>();
		
		for(int i=0;i<str.length();i++){
			
			char x=str.charAt(i);
			if(x=='(' || x=='{' || x=='['){st.push(x);}
			else if((x==')' && st.pop()!='(') || (x==')' && st.isEmpty())){return false;}
			else if(x=='}' && st.pop()!='{' || (x=='}' && st.isEmpty())){return false;}
			else if(x==']' && st.pop()!='[' || (x==']' && st.isEmpty())){return false;}
			else{continue;}
		}
		if(st.isEmpty())
		return true;
		else return false;
	}

}
