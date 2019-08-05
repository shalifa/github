import java.util.*;
class squ
{
 public static void main(String ar[])
 {
  Scanner ob=new Scanner(System.in);
  System.out.print("enter num");
  int s=ob.nextInt();
  int i;
  for(i=0;i<=s;i++)
  {
   if(i*i==s)
    {
     System.out.print("perfect square");
    }
  }
 }
}