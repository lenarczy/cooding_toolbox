/**
 * 
 */

/**
 * @author rafal
 *
 */
public class NodeWrapper {
	Node node;
	Node ascendant;
	
	NodeWrapper withNode(Node node) {
		this.node = node;
		return this;
	}
	
	NodeWrapper withAscendant(Node ascendant) {
		this.ascendant=ascendant;
		return this;
	}
}
