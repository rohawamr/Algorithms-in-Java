
public class HashImp {
public static void main(String[] args) {
	String key="muffi";
	
	
	
	MyHash ht=new MyHash(5);
	int i=ht.hash(key);
	System.out.println(i);
	ht.insert("muffi", "azmi");
	ht.insert("abhi", "ash");
	ht.insert("abhishek", "pallavi");
	ht.insert("pratik", "saya");
	ht.insert("sagar", "gur");
	ht.displayHashTable();
	ht.printitemsofindex(1);
	ht.findgf("pratik");
	ht.findgf("sagar");
	ht.findgf("shiva");
	ht.removeElem("sagar");
	ht.displayHashTable();
	ht.printitemsofindex(1);
}
}
