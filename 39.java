import java.util.*;
class emp
{
 int a,b;
 String s2;
 void read()
 {
  System.out.println("enter employ name");
  Scanner ob=new Scanner(System.in);
  s2=ob.nextLine();
  System.out.println("enter employ id");
  a=ob.nextInt();
  System.out.println("enter employ salary");
  b=ob.nextInt();
 }
 void display()
 {
  System.out.println("name:"+s2);
  System.out.println("id:"+a);
  System.out.println("salary:"+b);
  }
}
class noo
{
 public static void main(String ar[])
 {
  emp ob1=new emp();
  ob1.read();
  ob1.display();
 }
}