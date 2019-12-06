import java.util.*;
import java.io.*;
class Animal
{
	Boolean b=false;
	Boolean a=true;
	void eat(Boolean b)
	{
		this.b=b;
		if(b==true)
		{
		System.out.println("ate");
		}
		else
		{
		System.out.println("not ate");
		}
	}
	void sleep(Boolean a)
	{
		this.a=a;
		if(a==true)
		{
		System.out.println("Slept");
		}
		else
		{
		System.out.println("not slept");
		}

	}
}
class Bird extends Animal
{
	Boolean c=true;
	void fly(Boolean c)
	{
		this.c=c;
		if(c==true)
		{
		System.out.println("bird is flying");
		}
		else{
		System.out.println("bird is not flying");
		}
	}
}
class P61
{
	public static void main(String k[]){
	Bird b=new Bird();
	b.eat(false);
	b.sleep(true);
	b.fly(true);
	}
}
