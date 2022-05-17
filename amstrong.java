import java.lang.*;
import java.util.*;
public class amstrong
{
public static void main(String arg[])
{
      Scanner s = new Scanner(System.in);
      int mod,i,m,sum=0;
      System.out.println("enter number");
      m=s.nextInt();
      for(i=m;i!=0;i=i/10)
      {
          mod=i%10;
          sum=sum+(mod*mod*mod);
          
         
      }
      
      if(sum==m)
      { 
         System.out.println("amstrong");
      }
     
      else
      {
           System.out.println("not amstrong");
      }
        
}
    
}