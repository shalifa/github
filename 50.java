class twt
{
 static int a=10;
 static int b;
 static void display()
 {
  System.out.println(a);
  System.out.println(b);
 }
 static
 {
  System.out.println("static");
  b=a*10;
 }
 public static void main(String ar[])
 {
  System.out.println("main");
  display();
 }
}