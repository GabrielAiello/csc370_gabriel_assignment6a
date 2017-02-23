package hwassignment6csc300;

public class Node 
{
	private int payload;
	private Node nextnode;
	public Node(int payload)
	{
		this.payload = payload;
		this.nextnode = null;
	}
	public int getPayload() 
	{
		return payload;
	}
	public void setPayload(int payload) 
	{
		this.payload = payload;
	}
	public Node getNextNode() 
	{
		return nextnode;
	}
	public void setNextNode(Node nextnode) 
	{
		this.nextnode = nextnode;
	}
}
