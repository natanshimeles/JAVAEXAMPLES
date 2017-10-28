
public class TreeTest {
public static void main(String[] args) {
TreeNode n=new TreeNode(7,null,null);

TreeNode m=new TreeNode(6,null,null);
TreeNode k=new TreeNode(5,m,n);
System.out.println(k.firstchild.element);
	
}
}
