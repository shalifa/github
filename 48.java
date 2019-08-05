class testee
{
 int a;
 void display()
 {
  System.out.println(a);
 }
 testee()
 {
  System.out.println("hello");
  System.out.println(a);
 }
}
class topu
{
 public static void main(String ar[])
 {
  testee ob1=new testee();
  ob1.a=10;
  testee ob2=ob1;
  ob2.display();
  ob1.a=null;
  ob2.a=50;
  ob2.display();
 }
}