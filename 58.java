class exe
{
 int a;
 exe()
 {
  a=10;
  System.out.print(a);
 }
 exe display(exe ob)
 {
  ob.a=ob.a+30;
  return ob;
 }
}
class ex_e
{
 public static void main(String ar[])
 {
  exe ob1=new exe();
  exe ob2;
  ob2=ob1.display(ob1);
  System.out.print(ob2.a);
  ob1.a=50;
  ob1=ob2.display(ob1);
  System.out.print(ob1.a);
 }
}