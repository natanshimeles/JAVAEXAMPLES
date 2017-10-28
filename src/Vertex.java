
public class Vertex {

	Edge a;
	Edge b;
	boolean [][]arr={ {false},{false},{false}};
	public Vertex() {
	
	}
	public Vertex(Edge newedge,Edge newedge2) {
		this.a=newedge;
		this.b=newedge2;
		
		arr[newedge.id][newedge2.id]=true;
	}
	public boolean isconnected() {
		return arr[a.id][a.id];
	}
	public double getdistance() {
		double distance =0;
		int sum;
		distance =Math.sqrt(a.point2-b.point1+b.getpoint2()-a.point2);
		return distance*distance;
	}

}
