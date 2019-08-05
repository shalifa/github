class tee
{
 int a;
 tee()
 {
  this(10);
  System.out.print("hi");
 }
 tee(int x)
 {
  a=x;
  System.out.print(a);
 }
}
class tee_p
{
 public static void main(String ar[])
 {
  tee ob=new tee();
 }
}