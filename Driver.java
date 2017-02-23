package hwassignment6csc300;

import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		/*Stack blue = new Stack();
		blue.push("a");
		blue.push("b");
		blue.push("c");
		blue.push("d");
		blue.display();
		*/
		Driver.towersOfHanoi();
	}
	static void towersOfHanoi()
	{
		Stack a = new Stack();
		Stack b = new Stack();
		Stack c = new Stack();
	    Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to Towers of Hanoi.");
		System.out.println("How big do you want your tower to be?");
		int size = scnr.nextInt();
		if (size>12)
		{
			System.out.println("Way too big");
			return;
		}
		for(int i = size; i > 0; i--)
		{
			a.push(i);
		}
		Driver.displayTowers(a, b, c);
		System.out.println("To move an item from one stack to the other,");
		System.out.println("Enter both of the towers names and press enter.");
		System.out.println("For example; to move from tower '1' to tower '2' press '12'");
		while (c.getCount() != size)
		{
		int scan = scnr.nextInt();
		if(scan == 12)
		{
			if(a.towerPeek()<b.towerPeek())
			{
				b.push(a.pop());
			}
			else
			{
				System.out.println("You cannot move a larger piece onto a smaller piece"); //mmm, pie
			}
		}
		else if(scan == 23)
		{
			if(b.towerPeek()<c.towerPeek())
			{
				c.push(b.pop());
			}
			else
			{
				System.out.println("You cannot move a larger piece onto a smaller piece"); 
			}
		}
		else if (scan == 31)
		{
			if(c.towerPeek()<a.towerPeek())
			{
				a.push(c.pop());
			}
			else
			{
				System.out.println("You cannot move a larger piece onto a smaller piece"); 
			}
		}
		else if(scan == 21)
		{
			if(b.towerPeek()<a.towerPeek())
			{
				a.push(b.pop());
			}
			else
			{
				System.out.println("You cannot move a larger piece onto a smaller piece"); 
			}
		}
		else if(scan == 32)
		{
			if(c.towerPeek()<b.towerPeek())
			{
				b.push(c.pop());
			}
			else
			{
				System.out.println("You cannot move a larger piece onto a smaller piece"); 
			}
		}
			else if(scan == 13)
			{
				if(a.towerPeek()<c.towerPeek())
				{
					c.push(a.pop());
				}
				else
				{
					System.out.println("You cannot move a larger piece onto a smaller piece");
				}
			}
		else
		{
			System.out.println("Not a valid move, make sure that there are no spaces between the number, and no extra symbols.");
		}
		Driver.displayTowers(a, b, c);
		}
	}
	
	
	static void displayTowers(Stack a, Stack b, Stack c)
	{
		System.out.print("The first tower (1) is: ");
		a.display();
		System.out.print("The second tower (2) is: ");
		b.display();
		System.out.print("The third tower (3) is: ");
		c.display();
	}
}
