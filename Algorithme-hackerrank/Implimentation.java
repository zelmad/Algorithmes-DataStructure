import java.util.*;
import java.io.*;

class Node{
	Node left, right;
	int data;
	Node(int data){
		this.data = data;
		left = right = null;
	}
}
public class Implimentation{
	
	static void levelorder(Node root){
	}
	
	public static Node insert(Node root, int data){
		Node cur;
		if(root == null){
			return new Node(data);
		}
		else{
			if(data <= root.data){
				cur = insert(root.left, data);
				root.left = cur;
			}
			else{
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}
	
	public static void main(String[] args){
		Scanner Kayb = new Scanner(System.in);
		int t = Kayb.nextInt();
		Node root = null;
		while(t-->0){
			int sc = Kayb.nextInt();
			root = insert(root, sc);
		}
		levelorder(root);
		
	}
}