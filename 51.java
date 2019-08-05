import java.util.*;
class ret
{
  static int z,fat=1;
  static  int fact(int x)
  {
   z=x;
    if(z==1)
    {
      fat=1;
    }
    else
    {
      fat=z*fact(z-1);
    }
   return fat;
  }
  public static void main(String ar[])
  {
    int y,x;
    System.out.println("enter value");
    Scanner ob= new Scanner(System.in);
    x=ob.nextInt();
    y=fact(x);
    System.out.println(y);
  }
}
 