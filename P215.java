import java.util.*;
class P215
   {
       public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int t=n;
          int d,s=0;
          while(n>0)
            {
             d=n%10;
             s=s+d;
             n=n/10;
            }
            System.out.println(t+"->"+s);
        }
   }