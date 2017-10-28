
public class Graph {
	public static void main(String[] args) {
		Edge a=new Edge(1,32,0);
		Edge b=new Edge(4,5,0);
		Vertex v=new Vertex(a,b);
		System.out.println(v.getdistance());
		
	}

}
