class test
{
 int a;
 test()
 {
  System.out.print(a);
 }
 test(int x)
 {
  a=x;
  System.out.print(a);
 }
 void display()
 {
  System.out.print(a);
 }
}
class test_p
{
 public static void main(String ar[])
 {
 test ob=new test();
 test ob2=new test(5);
 ob.a=20;
 ob.display();
 }
}