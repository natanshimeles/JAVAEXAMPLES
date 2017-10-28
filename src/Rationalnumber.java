
public class Rationalnumber {

int deno;
int num;

public Rationalnumber(int num,int deno) {
	this.deno=deno;
	this.num=num;
	
}
public Rationalnumber mul(Rationalnumber r) {
	Rationalnumber rn=new Rationalnumber(0,0);
	rn.num=num*r.num;
	rn.deno=deno*r.deno;
	return rn;
	
	
}
public String toString() {
	return this.num+"/"+this.deno;
}

}
