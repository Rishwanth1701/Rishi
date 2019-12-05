import java.util.*;
import java.io.*;
class Search{
public static void main(String k[]){
int[] a=new int[]{1,3,5,6,7};
int i,search=0;
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
for(i=0;i<a.length;i++){
if(b==a[i]){
search++;
}
}
if(search==1){
System.out.println("element found");
}
else{
System.out.println("-1");
}
}
}