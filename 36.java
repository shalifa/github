import java.util.*;
class ran
{
 public static void main(String ar[])
 {
  int i;
  System.out.println(Math.random()+1);
  Random ob=new Random();
  int c=ob.nextInt(100);
  System.out.println(c);
  Random ob1=new Random();
  System.out.println(ob1.nextInt(100));
  for(i=5;i<=10;i++)
  {
   System.out.println(Math.random()+i);
  }
 }
}
  