public class MyHash {

	private int index;
	private int size;
	HashElem[] newHT;

	public MyHash(int s) {
		size = s;
		newHT = new HashElem[size];
		for (int i = 0; i < size; i++) {
			newHT[i] = new HashElem("empty", "empty", null);

		}
	}

	public int hash(String key) {
		index = 0;
		for (int i = 0; i < key.length(); i++) {
			index = index + (int) key.charAt(i);
			// System.out.println((int)key.charAt(i));
		}
		index = index % size;
		return index;
	}

	public void displayHashTable() {
		for (int i = 0; i < size; i++) {
			int count = 0;
			System.out.printf("Bucket [%d]=", i);
			newHT[i].displayHashElem();

			HashElem ptr = newHT[i];
			if (ptr.name != "empty") {
				count = 1;
			}
			while (ptr.next != null) {
				ptr = ptr.next;
				count++;
			}
			System.out.printf("Number of elements=%d\n", count);

		}
	}

	public int noofelements(int i) {
		int count = 0;
		HashElem ptr = newHT[i];
		if (ptr.name != "empty") {
			count = 1;
		}
		while (ptr.next != null) {
			ptr = ptr.next;
			count++;
		}
		return count;
	}

	public void insert(String n, String g) {
		int i = hash(n);
		HashElem p = new HashElem(n, g, null);

		if (newHT[i].name == "empty") {
			newHT[i] = p;
		} else {
			HashElem ptr = newHT[i];
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = p;
		}

	}

	public void printitemsofindex(int i) {
		HashElem ptr = newHT[i];
		if (ptr.name == "empty") {
			System.out.println("\nThere are no elements in this bucket..");
		} else {
			System.out.printf("\nElements in bucket[%d]: \n", i);
			ptr.displayHashElem();
			while (ptr.next != null) {
				ptr = ptr.next;
				ptr.displayHashElem();
			}
		}
	}

	public void findgf(String n) {
		int i = hash(n);
		HashElem ptr = newHT[i];
		int flag = 0;
		while (ptr != null) {
			if (ptr.name == n) {
				System.out.println(n + "'s girlfreind is " + ptr.gf);
				flag = 1;
			}
			ptr = ptr.next;
		}
		if (flag == 0) {
			System.out.println(n + " is not in database");
		}
	}

	public void removeElem(String n) {
		int i = hash(n);
		HashElem ptr = newHT[i];
		HashElem ptr1 = ptr.next;
		HashElem p = new HashElem("empty", "empty", null);
		switch (noofelements(i)) {
		case 0:
			System.out.println("\nThis element is not present in database");
			break;
		case 1:
			if (ptr.name == n) {
				newHT[i] = p;
				System.out.println("\n" + n + " item removed");
			} else
				System.out.println("\nThis element is not present in database");
			break;
		default:
			if (ptr.name == n) {
				newHT[i] = ptr1;
				System.out.println("\n" + n + " item removed");
			} else {
				int f = 0;
				while (ptr1 != null) {

					if (ptr1.name == n && ptr1.next!=null) {
						ptr1 = ptr1.next;
						ptr.next = ptr1;
						System.out.println("\n" + n + " item removed");
						//f = 1;
					}
					else if(ptr1.name == n){
						ptr1 = ptr1.next;
						ptr.next = ptr1;
						System.out.println("\n" + n + " item removed");
						f = 1;
						
					}
					if (f == 0) {
						ptr = ptr.next;
						ptr1 = ptr1.next;
					}
				}
			}
			break;

		}

	}
}
