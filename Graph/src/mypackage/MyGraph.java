package mypackage;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Stack;



public class MyGraph {

	private Map<Integer, List<Integer>> AdjList;
	private boolean[] wasVisited;
	private Queue<Integer> Q=new LinkedList<Integer>();
	private Stack<Integer> S=new Stack<Integer>();
	
	public MyGraph(int noOfVert) {
		// TODO Auto-generated constructor stub
		AdjList=new HashMap<Integer, List<Integer>>();
		wasVisited=new boolean[noOfVert];
		for(int i=0;i<noOfVert;i++){
			AdjList.put(i, new LinkedList<Integer>());
			wasVisited[i]=false;
		}
		
		
	}
	
	public void setEdge(int source, int dest) {
		// TODO Auto-generated method stub
			if(!AdjList.containsKey(source) && !AdjList.containsKey(dest)){
				System.out.println("Source and destination are out of range of the vertex list");
				return;
			}
			List<Integer> slist=AdjList.get(source);
			slist.add(dest);
			List<Integer> dlist=AdjList.get(dest);
			dlist.add(source);
			
	}
	
	
	public void getEdge(int source){
	
		if(!AdjList.containsKey(source)){
			System.out.println("Source are out of range of the vertex list");
			return;
		}
		
		List<Integer> slist=AdjList.get(source);
		System.out.println("The neighbours of "+source+" are :");
		ListIterator<Integer> li=slist.listIterator();
		
		while(li.hasNext()){
			System.out.println(li.next());
		}
		
			
	}
	
	public void displayV(int v){
		System.out.println(v);
	}
	public void bfs(){
		wasVisited[0]=true;
		displayV(0);
		Q.add(0);
		int v;
		while(!Q.isEmpty()){
			v=Q.remove();
			
			List<Integer> slist=AdjList.get(v);
			ListIterator<Integer> li=slist.listIterator();
			
			while(li.hasNext()){
				Integer i=li.next();
				if(wasVisited[i]==false){
				displayV(i);
				wasVisited[i]=true;
				Q.add(i);
				}
			}
				
			
		}
		for(int i=0;i<wasVisited.length;i++){
			wasVisited[i]=false;
		}	
	}
	
	
	public void dfs(){
		
	}
	
	public void mst(){
		wasVisited[0]=true;
		S.push(0);
		while(!S.isEmpty()){
			int curr=S.peek();
			int v=getAdjVert(curr);
			if(v==-1){
				S.pop();
			}
			else{
				wasVisited[v]=true;
				System.out.println("Edge-->>");
				displayV(curr);
				displayV(v);
				S.push(v);
				System.out.println("<<   ");
			}
		}
		
		for(int i=0;i<wasVisited.length;i++){
			wasVisited[i]=false;
		}	
		
	}
	
	public Integer getAdjVert(int v){
		List<Integer> slist=AdjList.get(v);
		ListIterator<Integer> li=slist.listIterator();
		
		while(li.hasNext()){
			Integer i=li.next();
			if(wasVisited[i]==false){
			return i;
			}
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		
		int source , destination;
        int number_of_edges,number_of_vertices;
        int count = 1;
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter the number of vertices and edges in graph");
        number_of_vertices = scan.nextInt();
        number_of_edges = scan.nextInt();
        
        MyGraph adjacencyList = new MyGraph(number_of_vertices);
        
        System.out.println("Enter the edges in graph Format : <source index> <destination index>");

        while(count<=number_of_edges){
        	int s=scan.nextInt();
        	int d=scan.nextInt();
        	adjacencyList.setEdge(s, d);
        	count++;
        }
        
        
        adjacencyList.getEdge(2);
        adjacencyList.mst();
	}
	
	
}
