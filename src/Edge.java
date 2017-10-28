
public class Edge {
  int point1;
  int point2;
  boolean conn;
  int id;
  
 public Edge(int point1,int point2,int id) {
	  this.point1=point1;
	  this.point2=point2;
	  this.id=id;
  }
  public String toString() {
	  return "("+this.point1+","+this.point2+")";
  }

  public int getpoint1() {
	  return this.point1;
  }
  public int getpoint2() {
	  return this.point2;
  }
}
