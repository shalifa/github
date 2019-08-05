class test
{
 int a;
 void display(int a)
 {
  a=a;
  System.out.print(a);
 }
}
class tup
{
 public static void main(String ar[])
 {
  test ob=new test();
  ob.display(20);
  }
}