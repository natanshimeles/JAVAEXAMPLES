
class myclass{
	
	public static  void main(String[] args) {
		Thread t=new Thread(new JAVAthread());
		int count =0;
		while(count<10) {
		t.run();
		count++;}
		System.out.println(t.toString());
	}
	
}