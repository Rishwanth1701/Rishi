import java.util.*;
   class Menu
     {
       public static void main(String args[])
         {
           Scanner sc=new Scanner(System.in);
            System.out.println(" two numbers:");

            int x1=sc.nextInt();
            int x2=sc.nextInt();
           String s;
            
            
            
            do
             {
               System.out.println("1.Add");
             System.out.println("2.Subtract");
               int b =sc.nextInt();
                      if(b==1)
                       System.out.println(x1+x2);
                      else if(b==2)
                       System.out.println(x1-x2);
                      System.out.println("Do You want to continue the program(y/n)");
                       s=sc.next();
                
                }while(s=="y"||s=="n");
             }
          }