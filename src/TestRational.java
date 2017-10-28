
public class TestRational {
public static void main(String[] args) {
	Rationalnumber rn=new Rationalnumber(5,4);
	Rationalnumber nr=new Rationalnumber(7,6);
	Rationalnumber k=rn.mul(nr);
	System.out.println(k.toString());
	
}
}
