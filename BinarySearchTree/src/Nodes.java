import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 */

/**
 * @author rafal
 *
 */
public class Nodes {
	
	Node root;
	
	public NodeWrapper search(int k) {
		Node n = root;
		NodeWrapper nw = new NodeWrapper();
		while(n != null && n.key != k) {
			nw.withAscendant(n);
			if(k < n.key) {
				n = n.left;
			} else {
				n= n.right;
			}			
		}
		nw.withNode(n);
		return nw;
	}
	
	public void insert(int k) {
		Node n,p;
		p = null;
		NodeWrapper nw = search(k);
		n = new Node();
		n.key = k;
		n.ascendant = nw.ascendant;
		if(root == null) {
			root = n;
			return;
		} else {
			if(k < nw.ascendant.key) nw.ascendant.left = n;
			else nw.ascendant.right = n;
		}
		
	}
	
	public void remove(int k) {
		NodeWrapper nw = search(k);
		if(nw.node == null) return;
		if(nw.node.left == null && nw.node.right == null) {
			if(k < nw.ascendant.key) 
				nw.ascendant.left = null;
			else 
				nw.ascendant.right = null;
		} else if (nw.node.left ==null){
			if(k < nw.ascendant.key) 
				nw.ascendant.left = nw.node.right;
			else 
				nw.ascendant.right = nw.node.right;
		} else if (nw.node.right ==null){
			if(k < nw.ascendant.key) 
				nw.ascendant.left = nw.node.left;
			else 
				nw.ascendant.right = nw.node.left;
		}  else {
			Node s,t;
			s = nw.node;
			t = nw.node.right;
			while(t.left != null) {
				s = t;
				t = t.left;
			}
			if(nw.node != s) {
				s.left = t.right;
			}
			t.left = nw.node.left;
			if(nw.node != s) {
				t.right = nw.node.right;
			}
			if(nw.node != null) {
				if(k < nw.ascendant.key) nw.ascendant.left = t;
				else nw.ascendant.right = t;
			} else {
				root = t;
			}
		}
		return;
	}
	
	public void a(Node node) {
		node = new Node();
		System.out.println(node.key);
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	public static void main(String[] args) {
		Nodes nodes = new Nodes();
		nodes.insert(5);
		nodes.insert(3);
		nodes.insert(2);
		nodes.insert(4);
		nodes.insert(10);
		nodes.insert(7);
		nodes.insert(15);
		nodes.insert(9);
		nodes.insert(6);
		nodes.insert(12);
		nodes.insert(17);
		
		System.out.println(nodes.root);
		nodes.remove(10);
		System.out.println(nodes.root);
		
		List<String> l = new ArrayList<String>(Arrays.asList("ala","ola","kasia","zosia"));
		System.out.println(l);
		replace(l, "kasia", Arrays.asList("1","2"));
		System.out.println(l);
	}
	
	static <T> void replace(List<T> list, T val, List<T> newVal) {
		for(ListIterator<T> iter = list.listIterator();iter.hasNext();) {
			if(val == null ? iter.next() == null:val.equals(iter.next())) {
				iter.remove();
				for(T t : newVal) {
					iter.add(t);
				}
			}
		}
	}

}
