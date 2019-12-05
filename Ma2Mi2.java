import java.util.*;
import java.io.*;
class P35{
public static void main(String k[]){
int[] array=new int[]{1,5,8,6,3};
int temp;
for (int i = 0; i<array.length; i++) {
    for (int j =i+1; j<array.length; j++) {
     if (array[i] < array [j]) {
      temp = array[i];
      array[i] = array[j];
      array[j] = temp;
     }
    }
System.out.println(""+array[i]);
   }
int n=array.length;

System.out.println("min="+array[n-1]+array[n-2]);
System.out.println("max="+array[0]+array[1]);


}
}