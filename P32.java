import java.util.*;
import java.io.*;
class P32{
public static void main(String k[]){
int[] array=new int[]{1,5,8,6,3};
int temp;
for (int i = 0; i<array.length; i++) {
    for (int j = i+1; j<array.length; j++) {
     if (array[i] < array [j+1]) {
      temp = array[i];
      array[i] = array[j+1];
      array[j+1] = temp;
     }
    }
System.out.println("the sorted array="+array[i]);
   }


}
}