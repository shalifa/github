class teste
{
 int a;
 void display()
 {
  System.out.println(a);
 }
 teste()
 {
  System.out.println("hello");
  System.out.println(a);
 }
}
class top
{
 public static void main(String ar[])
 {
  teste ob1=new teste();
  ob1.a=10;
  teste ob2=ob1;
  ob2.display();
  ob2.a=20;
  ob1.display();
  ob2.display();
  ob1.a=40;
  ob2.display();
 }
}