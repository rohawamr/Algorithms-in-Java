public class HashElem {

	public String name;
	public String gf;
	HashElem next;
	public HashElem(String n,String g,HashElem ne)
	{
		name=n;
		gf=g;
	    next=ne;
	}
	public void displayHashElem()
	{
		System.out.printf("%s",name);
		System.out.printf("\t%s\n",gf);
	}
	
}
