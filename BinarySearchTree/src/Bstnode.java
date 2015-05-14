
public class Bstnode {

	public int data;
	public int key;
	public Bstnode left;
	public Bstnode right;
	
	public Bstnode(int key,int data){
		this.key=key;
		this.data=data; 
		left=null;
		right=null;
	}
	
	public void display(){
		System.out.println(this.key+":/n"+this.data);
	}
}
