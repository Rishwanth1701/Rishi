
import java.util.*; 
import java.io.*;
class P39 { 
	public static int find(int[] a, int target)
{
	for (int i = 0; i < a.length; i++)
		if (a[i] == target)
			return i;

	return -1;
}

	public static void main(String[] args) 
	{ int sum=0;
		int[] a= { 5, 4, 6, 1, 2, 7, 8, 9 }; 
			int b=find(a, 6);
			int c=find(a, 7); int i;
		
		for(i=0;i<a.length;i++){
		System.out.println("ajjbd="+a[b]);
	}
	} 
} 

