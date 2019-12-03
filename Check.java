import java.util.*;
import java.io.*;
public class Check
{
	public static void main(String k[])
	{ int a;

	  a=Integer.valueOf(k[0]).intValue();
if(a<0){
System.out.println("negitive");
}
else if(a>0){
System.out.println("Positive");
}
else {
System.out.println("Zero");
}
}
}