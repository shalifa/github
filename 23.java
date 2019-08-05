class rect
 {
  int l,b,are,peri;
  void are()
  {
   System.out.print(l*b);
  }
  void peri()
  {
   System.out.print(2*(l+b));
  }
 }
class one
 {
  public static void main(String ar[])
  { 
   rect ob1=new rect();
   ob1.l=10;
   ob1.b=20;
   ob1.are();
   ob1.peri();
  }
 }