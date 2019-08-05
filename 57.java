class exp
{
 int a;
 exp()
 {
  a=10;
  System.out.print(a);
 }
 exp display(exp ob)
 {
  a=ob.a+30;
  return ob;
 }
}
class ex_p
{
 public static void main(String ar[])
 {
  exp ob1=new exp();
  exp ob2;
  ob2=ob1.display(ob1);
  System.out.print(ob2.a);
 }
}