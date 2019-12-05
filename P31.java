import java.util.*;
import java.io.*;
class P31{
public static void main(String k[]){
int[] a=new int[]{1,2,3,4,5};
int i,sum=0,avg;
for(i=0;i<a.length;i++){
sum=sum+a[i];
}
System.out.println("sum="+sum);
avg=sum/a.length;
System.out.println("avg="+avg);
}
}

