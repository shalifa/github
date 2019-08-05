class example
{
 int a,b;
 example()
 {
  a=10;
  b=20;
  }
  void display(example ob)
  {
   a=ob.a+10;
   b=ob.b+30;
   System.out.println(a+" "+b);
  }
  public static void main(String ar[])
  {
   example ob1=new example();
   example ob2=new example();
   ob2.display(ob1);
   System.out.println(ob1.a+" "+ob1.b);
   System.out.println(ob2.a+" "+ob2.b);
  }
}