public class BtreeImp {
	public static void main(String[] args) {
		MyBtree tree = new MyBtree();
		tree.insertBtree(5, 62);
		tree.insertBtree(1, 54);
		tree.insertBtree(3, 34);
		tree.insertBtree(6, 99);
		tree.insertBtree(2, 45);
		tree.find(5);
		//System.out.println("\n"+res);
	}
}
