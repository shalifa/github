import java.util.*;
class test
{
 int a;
 void read()
 {
  Scanner ob=new Scanner(System.in);
  a=ob.nextInt();
  }
 void display()
 {
  System.out.print(a);
 }
 public static void main(String ar[])
 {
  test ob1= new test();
  ob1.read();
  ob1.display();
  ob1.a=10;
  ob1.display();
 }
} 
 