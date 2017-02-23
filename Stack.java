package hwassignment6csc300;

public class Stack 
{
	private Node top;
	private int count;
	public Stack()
	{
		this.top = null;
		this.setCount(0);
	}
	
	public void push(int payload)
	{
		Node n = new Node(payload);
		if(this.top == null)
		{
			this.top = n;
		}
		else
		{
			n.setNextNode(this.top);
			this.top = n;
		}
		this.setCount(this.getCount() + 1);
	}
	
	public int pop()
	{
		if(this.top == null)
		{
			throw new RuntimeException("Can't pop from the empty stack!");
		}
		else
		{
			int valToReturn = this.top.getPayload();
			this.top = this.top.getNextNode();
			this.setCount(this.getCount() - 1);
			return valToReturn;
		}
	}
	
	public int peek()
	{
		if(this.top == null)
		{
			throw new RuntimeException("Empty Stack: Nothing to Peek");
		}
		else
		{
			return this.top.getPayload();
		}
	}
	public int towerPeek()
	{
		if(this.top == null)
		{
			//throw new RuntimeException("Empty Stack: Nothing to Peek");
			return 9000;
		}
		else
		{
			return this.top.getPayload();
		}
	}
	
	public void display()
	{
		if(this.getCount() == 0)
		{
			System.out.println("Empty Stack");
		}
		else
		{
			Stack temp = new Stack();
			int tempCount = this.getCount();
			for(int i = 0; i < tempCount; i++)
			{
				System.out.print(this.peek() + " -> ");
				temp.push(this.pop());
			}
			System.out.println("null");
			tempCount = temp.getCount();
			for(int i = 0; i < tempCount; i++)
			{
				this.push(temp.pop());
			}
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
