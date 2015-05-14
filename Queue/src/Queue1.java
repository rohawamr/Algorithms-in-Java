public class Queue1 {

	private int size;
	private int rear, front;
	private int[] q1;
	private int n;

	public Queue1(int s) {
		size = s;
		q1 = new int[size];
		n = 0;
		rear = -1;
		front = 0;
	}

	public boolean isemp() {
		return (rear == -1);
	}

	public boolean isfull() {
		if(rear!=-1)
		return (((rear+1)% size)==front);
		else
			return false;
	}

	public void insertQ(int key) {
		if (!isfull()) {
			rear=(rear+1)%size;
			q1[rear] = key;
			n++;
			
		} else
			System.out.println("Queue is full");

	}

	public int delQ() {
		if (!isemp()) {
						int temp=front;
						front=(front+1)%size;
						n--;
						return q1[temp];
		} else if(front==rear)
		{
			int temp=front;
			front=0;
			rear=-1;
			n--;
			return q1[temp];
			
			
		}
		else
				{
			System.out.println("Queue is empty");
			return 0;
		}
	}

	
}
