/**
 * 
 */

/**
 * @author rafal
 *
 */
public class Node {
	
	public int key;
	public Node left;
	public Node right;
	public Node ascendant;
	String underLine = "--";
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(key)
			.append(underLine);
		if(left != null) {
			sb.append(key)
				.append("left")
				.append(left);
		}
		if(right != null) {
			sb.append(key)
				.append("right")
				.append(right);
		}
		return sb.toString();		
	}

}
